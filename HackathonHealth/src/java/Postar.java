/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.dados.MedicamentoDAO;
import org.modelos.Usuario;

/**
 *
 * @author gutol
 */
public class Postar extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String descricao = request.getParameter("descricao");
        HttpSession session = request.getSession();
        Usuario usuario = (Usuario)session.getAttribute("usuario");

        Mensagem nova = new Mensagem();
        nova.setDescricao(descricao);
        nova.setAutor(usuario);

        MedicamentoDAO dao = new MedicamentoDAO();

        try {
         dao.insert(nova);

         request.setAttribute("mensagens", dao.selectAll(usuario));
         RequestDispatcher rd = request.getRequestDispatcher("/perfil.jsp");
         rd.forward(request,response);

        }catch(Exception e){
           e.printStackTrace();
        }



    }

}
