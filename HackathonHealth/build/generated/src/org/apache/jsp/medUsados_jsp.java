package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class medUsados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Medicamentos Usados</title>\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            ");
      org.modelos.Medicamento medicamento = null;
      synchronized (request) {
        medicamento = (org.modelos.Medicamento) _jspx_page_context.getAttribute("medicamento", PageContext.REQUEST_SCOPE);
        if (medicamento == null){
          medicamento = new org.modelos.Medicamento();
          _jspx_page_context.setAttribute("medicamento", medicamento, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("            \n");
      out.write("            <h1>Medicamentos Usados</h1>\n");
      out.write("            \n");
      out.write("            <form action=\"CadastrarMedicamento\" method=\"post\">\n");
      out.write("\n");
      out.write("                <select class=\"form-control\" id=\"sexo\">\n");
      out.write("                    <c:forEach var=\"medicamento\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamentos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamento.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Inserir</button>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <h3>Lista de Medicamentos Usados </h3>\n");
      out.write("\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nome</th>\n");
      out.write("                        <th>Classe</th>\n");
      out.write("                        <th>Principio Ativo</th>\n");
      out.write("                        <th>Descricao</th>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                       <c:forEach var=\"medicamento\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamentos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamento.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamento.classe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamento.principioativo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicamento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                </c:forEach>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Proseguir</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
