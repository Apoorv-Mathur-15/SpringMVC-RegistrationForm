/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-29 08:31:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t    <meta name=\"description\" content=\"Colorlib Templates\">\r\n");
      out.write("\t    <meta name=\"author\" content=\"Colorlib\">\r\n");
      out.write("\t    <meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"login/images/Main.png\" type=\"image/x-icon\">\r\n");
      out.write("\t    <title>New Registration</title>\r\n");
      out.write("\t\r\n");
      out.write("\t    <link href=\"NewRegistration/vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\t    <link href=\"NewRegistration/vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("\t    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t    <link href=\"NewRegistration/vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\t    <link href=\"NewRegistration/vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\t\r\n");
      out.write("\t    <link href=\"NewRegistration/css/main.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\t\t<!-- <link href=\"webjars/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">   -->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <!-- \r\n");
      out.write("    <div class=\"w3-content w3-section\" style=\"align-items: center;\">\r\n");
      out.write("        <img class=\"mySlides\" src=\"img/background.png\" style=\"width:100%\">\r\n");
      out.write("        <img class=\"mySlides\" src=\"img/background2.png\" style=\"width:100%\">\r\n");
      out.write("        <img class=\"mySlides\" src=\"img/background3.png\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        var myIndex = 0;\r\n");
      out.write("        carousel();\r\n");
      out.write("\r\n");
      out.write("        function carousel() {\r\n");
      out.write("            var i;\r\n");
      out.write("            var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("            for (i = 0; i < x.length; i++) {\r\n");
      out.write("                x[i].style.display = \"none\";\r\n");
      out.write("            }\r\n");
      out.write("            myIndex++;\r\n");
      out.write("            if (myIndex > x.length) {\r\n");
      out.write("                myIndex = 1\r\n");
      out.write("            }\r\n");
      out.write("            x[myIndex - 1].style.display = \"block\";\r\n");
      out.write("            setTimeout(carousel, 2000); // Change image every 4 seconds\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <table border=\"0\" width='480px' cellpadding='0' cellspacing='0' align=\"center\">\r\n");
      out.write("        <center><tr><td><h2>New Registration</h2></td></tr></center>\r\n");
      out.write("        <form action=\"/NewRegistration\" method=\"POST\">\r\n");
      out.write("            <table border=\"0\" width='480px' align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align='center'>Name:</td>\r\n");
      out.write("                    <td><input type='text' name='name'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align='center'>Enrollment Number:</td>\r\n");
      out.write("                    <td><input type='text' name='enrollment'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align='center'>Email Address:</td>\r\n");
      out.write("                    <td><input type='email' name='email'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align='center'>Phone Number:</td>\r\n");
      out.write("                    <td><input type='text' name='phone_number'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align='center'>WhatsApp Number:</td>\r\n");
      out.write("                    <td><input type='text' name='whatsapp_number'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align='center'>College:</td>\r\n");
      out.write("                    <td><input type='text' name='college'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align='center'><button class=\"btn btn-success\" type=\"submit\">Submit</button></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        </table>\r\n");
      out.write("    </table> -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w680\">\r\n");
      out.write("            <div class=\"card card-4\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h2 class=\"title\">Registration Form</h2>\r\n");
      out.write("                    <form action=\"/NewRegistration\" method=\"POST\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <label class=\"label\">name</label>\r\n");
      out.write("                            <input class=\"input--style-4\" type=\"text\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <label class=\"label\">enrollment number</label>\r\n");
      out.write("                            <input class=\"input--style-4\" type=\"text\" name=\"enrollment\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <label class=\"label\">phone number</label>\r\n");
      out.write("                            <input class=\"input--style-4\" type=\"text\" name=\"phone_number\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <label class=\"label\">whatsapp number</label>\r\n");
      out.write("                            <input class=\"input--style-4\" type=\"text\" name=\"whatsapp_number\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <label class=\"label\">Email</label>\r\n");
      out.write("                            <input class=\"input--style-4\" type=\"email\" name=\"email\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <label class=\"label\">college</label>\r\n");
      out.write("                            <input class=\"input--style-4\" type=\"text\" name=\"college\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"p-t-15\">\r\n");
      out.write("                            <button class=\"btn btn--radius-2 btn--blue\" type=\"submit\">Submit</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Jquery JS-->\r\n");
      out.write("    <script src=\"NewRegistration/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Vendor JS-->\r\n");
      out.write("    <script src=\"NewRegistration/vendor/select2/select2.min.js\"></script>\r\n");
      out.write("    <script src=\"NewRegistration/vendor/datepicker/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"NewRegistration/vendor/datepicker/daterangepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"NewRegistration/js/global.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- <script src=\"webjars/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"webjars/bootstrap/4.4.1/js/bootstrap.min.js\"></script>  -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
