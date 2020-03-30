package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/text_center.css\">  \n");
      out.write("\n");
      out.write("        <title>BootStrap Of Darkchocolate</title>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image:url(\"image/webback3_1.jpeg\")\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("            <!-- ======================================Navigation Bar================================================= -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navStyle\">\n");
      out.write("                \n");
      out.write("                <a class=\"brand-navbar\" href=\"#\"><img src=\"image/logo9.jpg\" alt=\"Responsive image\" height=\"90px\"> </a>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mainMenu\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto navList\">\n");
      out.write("                    \n");
      out.write("                        <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link\"><i class=\"fas fa-align-right\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Home</i></b></h4></button><span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"registration.jsp\" class=\"nav-link\"><i class=\"fas fa-user-plus\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Sign Up</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"search.jsp\" class=\"nav-link\"><i class=\"fas fa-search\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Search</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"login.jsp\" class=\"nav-link\"><i class=\"fas fa-sign-in-alt\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Sign In</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"userList_servlet\" class=\"nav-link\"><i class=\"fas fa-users\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>UserList</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"logout.jsp\" class=\"nav-link\"><i class=\"fas fa-sign-out-alt\"></i> <button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Logout</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("    \n");
      out.write("   <div class=\"container\">\n");
      out.write("  \n");
      out.write("    <h1>Welcome to nasim's project</h1>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
