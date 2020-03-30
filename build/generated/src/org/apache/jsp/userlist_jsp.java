package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Db_package.user;

public final class userlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- \n");
      out.write("    Document   : userlist\n");
      out.write("    Created on : Mar 22, 2020, 11:31:27 PM\n");
      out.write("    Author     : Zafrul Hasan Nasim\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/userlist.css\">\n");
      out.write("     <style>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image:url(\"image/webback3_1.jpeg\")\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"heading\" align=\"center\">\n");
      out.write("            <h2>See all User</h2>\n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("             \n");
      out.write("        \n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <thead class=\"theading\">\n");
      out.write("                                    <tr >\n");
      out.write("                                        <th class=\"hname\" style=\"border: 3px solid red;\"><h5>UserName</h5></th>\n");
      out.write("                                        <th class=\"hdept\" style=\"border: 3px solid red;\"><h5>Department Name</h5></th>\n");
      out.write("                                        <th class=\"hemail\" style=\"border: 3px solid red;\"><h5>Email</h5></th>\n");
      out.write("                                        <th class=\"hmobile\" style=\"border: 3px solid red;\"><h5>Mobile Number</h5></th>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </thead><br>\n");
      out.write("                                <tbody>\n");
      out.write("        ");

                ArrayList<user> userlist =(ArrayList) request.getAttribute("userlist");
                
                int i = 0;
                for(user u : userlist){
                    i++;
                
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"bname\">");
      out.print( u.getName());
      out.write("</td>\n");
      out.write("            <td class=\"bdept\">");
      out.print( u.getDept());
      out.write("</td>\n");
      out.write("        <td class=\"bemail\">");
      out.print( u.getEmail());
      out.write("</td>\n");
      out.write("        <td class=\"bmobile\">");
      out.print( u.getMobile());
      out.write("</td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </tr>  \n");
      out.write("      ");

      }
      
      out.write("\n");
      out.write("      \n");
      out.write("    </tbody>\n");
      out.write("                            \n");
      out.write("    </table>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"home\">\n");
      out.write("          <a href=\"index.jsp\" style=\"color: white;\"><h5>Home</h5></a>\n");
      out.write("        </div> \n");
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
