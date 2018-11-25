import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.dados.UsuarioDAO;
import org.modelos.Alergia;
import org.modelos.Usuario;

public class Cadastrar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String sexo = request.getParameter("sexo");
        String idade = request.getParameter("idade");
        String altura = request.getParameter("altura");
        String peso = request.getParameter("peso");
        String gestante = request.getParameter("gestante");

        Usuario novo = new Usuario();
        novo.setNome(nome);
        novo.setSexo(sexo);
        novo.setIdade(idade);
        novo.setAltura(altura);
        novo.setPeso(peso);
        novo.setGestante(gestante);
        

        UsuarioDAO dao = new UsuarioDAO();

        try{
           dao.insert(novo);
        }catch(Exception e){
           e.printStackTrace();
        }

        //request.setAttribute("usuarios", Usuario.dados);
        //RequestDispatcher rd = request.getRequestDispatcher("/usuarios.jsp");
        //rd.forward(request, response);

        response.sendRedirect("index.jsp");
    }

}
