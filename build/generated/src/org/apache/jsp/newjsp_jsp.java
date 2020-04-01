package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<?php\n");
      out.write("  // Create database connection\n");
      out.write("  $db = mysqli_connect(\"localhost\", \"root\", \"\", \"image_upload\");\n");
      out.write("\n");
      out.write("  // Initialize message variable\n");
      out.write("  $msg = \"\";\n");
      out.write("\n");
      out.write("  // If upload button is clicked ...\n");
      out.write("  if (isset($_POST['upload'])) {\n");
      out.write("  \t// Get image name\n");
      out.write("  \t$image = $_FILES['image']['name'];\n");
      out.write("  \t// Get text\n");
      out.write("  \t$image_text = mysqli_real_escape_string($db, $_POST['image_text']);\n");
      out.write("\n");
      out.write("  \t// image file directory\n");
      out.write("  \t$target = \"images/\".basename($image);\n");
      out.write("\n");
      out.write("  \t$sql = \"INSERT INTO images (image, image_text) VALUES ('$image', '$image_text')\";\n");
      out.write("  \t// execute query\n");
      out.write("  \tmysqli_query($db, $sql);\n");
      out.write("\n");
      out.write("  \tif (move_uploaded_file($_FILES['image']['tmp_name'], $target)) {\n");
      out.write("  \t\t$msg = \"Image uploaded successfully\";\n");
      out.write("  \t}else{\n");
      out.write("  \t\t$msg = \"Failed to upload image\";\n");
      out.write("  \t}\n");
      out.write("  }\n");
      out.write("  $result = mysqli_query($db, \"SELECT * FROM images\");\n");
      out.write("?>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <h1>djcskskjm</h1>\n");
      out.write("    </body>\n");
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
