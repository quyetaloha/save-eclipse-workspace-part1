/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-11-12 16:12:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DangNhap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("\r\n");
      out.write("   <!--  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E0F8F7\">\r\n");
      out.write("<form action=\"DangNhap\" method=\"post\">\r\n");
      out.write(" <div align=\"center\">\r\n");
      out.write(" \t <h1>ÄÄng Nháº­p</h1>\r\n");
      out.write("\t <table>\r\n");
      out.write("\t <tr>\r\n");
      out.write("\t <td>Account</td>\r\n");
      out.write("\t <td><input type=\"text\" name=\"account\"></td>\r\n");
      out.write("\t <td rowspan=2>\r\n");
      out.write("\t <button style=\"height: 48px\" type=\"submit\">ÄÄng Nháº­p</button>\r\n");
      out.write("\t </td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t <tr>\r\n");
      out.write("\t <td>Password</td>\r\n");
      out.write("\t <td><input type=\"password\" name=\"password\"></td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t \r\n");
      out.write("\t </table>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("-->\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("<style>\n");
      out.write("<!--\n");
      out.write("\tbody {\r\n");
      out.write("\t  margin: 0;\r\n");
      out.write("\t  padding: 0;\r\n");
      out.write("\t  background-color: #17a2b8;\r\n");
      out.write("\t  height: 100vh;\r\n");
      out.write("\t}\r\n");
      out.write("\t#login .container #login-row #login-column #login-box {\r\n");
      out.write("\t  margin-top: 120px;\r\n");
      out.write("\t  max-width: 600px;\r\n");
      out.write("\t  height: 320px;\r\n");
      out.write("\t  border: 1px solid #9C9C9C;\r\n");
      out.write("\t  background-color: #EAEAEA;\r\n");
      out.write("\t}\r\n");
      out.write("\t#login .container #login-row #login-column #login-box #login-form {\r\n");
      out.write("\t  padding: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#login .container #login-row #login-column #login-box #login-form #register-link {\r\n");
      out.write("\t  margin-top: -85px;\r\n");
      out.write("\t \r\n");
      out.write("\t}\r\n");
      out.write("\t\n");
      out.write("-->\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"login\">\r\n");
      out.write("        <h3 class=\"text-center text-white pt-5\">Login form</h3>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\r\n");
      out.write("                <div id=\"login-column\" class=\"col-md-6\">\r\n");
      out.write("                    <div id=\"login-box\" class=\"col-md-12\">\r\n");
      out.write("                        <form id=\"login-form\" class=\"form\" action=\"DangNhap\" method=\"post\">\r\n");
      out.write("                            <h3 class=\"text-center text-info\">Login</h3>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"username\" class=\"text-info\">Username:</label><br>\r\n");
      out.write("                                <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"password\" class=\"text-info\">Password:</label><br>\r\n");
      out.write("                                <input type=\"text\" name=\"password\" id=\"password\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"vertical-align: middle;\" class=\"form-group\">\r\n");
      out.write("                               \r\n");
      out.write("                                <input style=\"margin-left: 95px;\"  type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
