package org.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.modelos.Usuario;

public class UsuarioDAO {

   public UsuarioDAO(){}

   public ArrayList<Usuario> select(String sql) throws SQLException, ClassNotFoundException {
      ArrayList<Usuario> result = new ArrayList<Usuario>();

      // conectando no banco de dados
      Connection con = ConnectionFactory.getConnection();

      // cria um preparedStatement para configurar a consulta
      Statement stmt = con.createStatement();

      // executa a consulta no banco de dados
      ResultSet rs = stmt.executeQuery(sql);

      // criando lista de mensagens do banco de dados
      while(rs.next()){
         Usuario usuario = new Usuario();
         usuario.setId(rs.getInt("id"));
         usuario.setNome(rs.getString("nome"));
         usuario.setSexo(rs.getString("sexo"));
         usuario.setIdade(rs.getString("idade"));
         usuario.setAltura(rs.getString("altura"));
         usuario.setPeso(rs.getString("peso"));
         usuario.setGestante(rs.getString("gestante"));
         
         
         result.add(usuario);
      }

      rs.close();
      stmt.close();

      return result;
   }

   public void insert(Usuario usuario) throws SQLException, ClassNotFoundException{
      // conectando
      Connection con = new ConnectionFactory().getConnection();

      // cria um preparedStatement
      String sql = "insert into usuario" +
	             " (nome, email, cpf, senha)" +
	             " values (?, ?, ?, ?)";
      PreparedStatement stmt = con.prepareStatement(sql);
      // executa
      stmt.execute();
      stmt.close();
   }

   public void delete(Usuario usuario) throws SQLException, ClassNotFoundException{
      // conectando
      Connection con = new ConnectionFactory().getConnection();

      // cria um preparedStatement
      String sql = "delete from usuario where " + "id = ?";
      PreparedStatement stmt = con.prepareStatement(sql);

      // preenche os valores
      stmt.setInt(1, usuario.getId());

      // executa
      stmt.execute();
      stmt.close();
   }

}
