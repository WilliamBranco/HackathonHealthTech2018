/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.modelos.Medicamento;
import org.modelos.Usuario;


public class MedicamentoDAO {

    public ArrayList<Medicamento> selectAll() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM  medicamentos";
        return select(sql);
    }

   public ArrayList<Medicamento> select(String sql) throws SQLException, ClassNotFoundException {
        ArrayList<Medicamento> result = new ArrayList<Medicamento>();

        // conectando no banco de dados
        Connection con = ConnectionFactory.getConnection();

        // cria um preparedStatement para configurar a consulta
        Statement stmt = con.createStatement();

        // executa a consulta no banco de dados
        ResultSet rs = stmt.executeQuery(sql);

        // criando lista de mensagens do banco de dados
        while(rs.next()){
            Medicamento medicamento = new Medicamento();
            medicamento.setNome(rs.getString("nome"));
            medicamento.setClasse(rs.getString("classe"));
            medicamento.setDescricao(rs.getString("descricao"));

            result.add(medicamento);
        }

        rs.close();
        stmt.close();

        return result;
   }

   public void insert(Medicamento medicamento) throws SQLException, ClassNotFoundException{
      // conectando
      Connection con = new ConnectionFactory().getConnection();

      // cria um preparedStatement
      String sql =  "insert into usuario" +
                    " (nome,classe,descricao)" +
                    " values (?, ? ,? ,?)";
      PreparedStatement stmt = con.prepareStatement(sql);

      // preenche os valores
      stmt.setString(1, medicamento.getNome());
      stmt.setString(1, medicamento.getClasse());
      stmt.setString(1, medicamento.getDescricao());

      // executa
      stmt.execute();
      stmt.close();
   }

   public void delete(Medicamento medicamento) throws SQLException, ClassNotFoundException{
      // conectando
      Connection con = new ConnectionFactory().getConnection();

      // cria um preparedStatement
      String sql = "delete from medicamentos where " +
                   "id = ?";
      PreparedStatement stmt = con.prepareStatement(sql);

      // executa
      stmt.execute();
      stmt.close();
   }
}