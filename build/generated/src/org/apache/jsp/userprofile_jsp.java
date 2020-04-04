package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<head>\n");
      out.write("    \n");
      out.write("    <title>BootStrap Of Darkchocolate</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/userprofile.css\">\n");
      out.write("   <style>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image:url(\"image/webback3_1.jpeg\")\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("            <!-- ======================================Navigation Bar================================================= -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navStyle\">\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mainMenu\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto navList\">\n");
      out.write("                        <li class=\"nav-item active\"><a href=\"index.jsp\" class=\"nav-link\"><i class=\"fas fa-align-right\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Home</i></b></h4></button><span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                       \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"search.jsp\" class=\"nav-link\"><i class=\"fas fa-search\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Search</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"login.jsp\" class=\"nav-link\"><i class=\"fas fa-sign-in-alt\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Sign In</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"userList_servlet\" class=\"nav-link\"><i class=\"fas fa-users\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i> UserList</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"logout.jsp\" class=\"nav-link\"><i class=\"fas fa-sign-out-alt\"></i><button type=\"button\" style=\"color: white\"  class=\"btn btn-link mb-1\"><h4><b><i>Logout</i></b></h4></button></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("             ");

               String name1 = session.getAttribute("name1").toString();
               session.setAttribute("name1", name1);
               
               String dept = session.getAttribute("dept").toString();
               session.setAttribute("dept", dept);
               
               String email2 = session.getAttribute("email2").toString();
               session.setAttribute("email2", email2);
                
               String mobile = session.getAttribute("mobile").toString();
               session.setAttribute("mobile",mobile);
            
      out.write(" \n");
      out.write("           \n");
      out.write("            <br><div class=\"panel-heading\" align=\"center\"> <h3 style=\"color:white;\">  profile  of ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                    \n");
      out.write("                <br>\n");
      out.write("                                <div class=\"form\">\n");
      out.write("                                    <div class=\"name\">\n");
      out.write("                                         <h5 style=\"color:white;\"> Username : </h5>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"firstname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width:280px; text-align: center; color: #0000ff\" readonly>\n");
      out.write("                                    </div><br>\n");
      out.write("                                    \n");
      out.write("                                        \n");
      out.write("                                   \n");
      out.write("                                        <div class=\"dept\">\n");
      out.write("                                        <h5 style=\"color:white;\"> Department name : </h5>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"firstname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dept}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width:280px; text-align: center;color: #0000ff\" readonly>\n");
      out.write("                                    </div><br>\n");
      out.write("                              \n");
      out.write("                                \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"email\">\n");
      out.write("                                        <h5 style=\"color:white;\"> Email : </h5>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width:280px; text-align: center;color: #0000ff\" readonly>\n");
      out.write("                                    </div><br>\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                                       <div class=\"mobile\">\n");
      out.write("                                        <h5 style=\"color:white;\">Mobile Number</h5>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width:280px; text-align: center; color: #0000ff\" readonly >\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("                                    <div class=\"vl\"></div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"image\">\n");
      out.write("                                        <img src=\"image/_DSC0030.JPG\" height=\"200px\" width=\"220px\" alt=\"avatar\" style=\" border-radius:50%;\"></a>\n");
      out.write("                                         \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"namedept\">\n");
      out.write("                                     <h2 style=\" text-align:center;\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h2>\n");
      out.write("                                         <h3 style=\" text-align:center;\">Dept. of ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dept}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                               \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                                     <div class=\"update\">\n");
      out.write("                                         <a href=\"userupdate.jsp\"><button class=\"btnn\">Update Profile</button></a>\n");
      out.write("                                </div>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("              </body>\n");
      out.write("    </html>");
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
