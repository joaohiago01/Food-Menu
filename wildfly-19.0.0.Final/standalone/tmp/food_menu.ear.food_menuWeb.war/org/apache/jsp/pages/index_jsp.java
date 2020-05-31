/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: WildFly Full 19.0.0.Final (WildFly Core 11.0.0.Final) - 2.0.30.Final
 * Generated at: 2020-05-25 13:02:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.Restaurant;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("entity.Restaurant");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JBWEB004248: JSPs only permit GET POST or HEAD");
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
      response.addHeader("X-Powered-By", "JSP/2.3");
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
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("\r\n");
      out.write("<title>Food Menu</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"sortcut icon\" href=\"../assets/favicon.ico\"\r\n");
      out.write("\ttype=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		@SuppressWarnings("unchecked")
	List<Restaurant> restaurants = (List<Restaurant>) request.getAttribute("restaurants");
	
      out.write("\r\n");
      out.write("\t<div class=\"card bg-danger mb-3\">\r\n");
      out.write("\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t<ul class=\"nav justify-content-end\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link btn btn-danger btn-lg\"\r\n");
      out.write("\t\t\t\t\thref=\"./pages/user_register.jsp\">Restaurante</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link btn btn-danger btn-lg\"\r\n");
      out.write("\t\t\t\t\thref=\"./pages/login.jsp\">Entrar</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"card-body\">\r\n");
      out.write("\t\t<h4 class=\"card-title font-weight-bold col-sm-2\">Restaurantes</h4>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write("\t\t\t<form class=\"form-inline\">\r\n");
      out.write("\t\t\t\t<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"Pesquisar restaurante\" aria-label=\"Pesquisar\" />\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-outline-danger my-2 my-sm-0\" type=\"submit\">Pesquisar</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t");

				if (restaurants == null || restaurants.isEmpty()) {
			
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"card-title\">Nenhum restaurante encontrado</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				} else {
				for (Restaurant restaurant : restaurants) {
			
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t<form class=\"card-body\" method=\"get\"\r\n");
      out.write("\t\t\t\t\t\taction=\"../RestaurantServlet?restaurantID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${restaurant.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(restaurant.getName());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(restaurant.getDescription());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-danger btn-lg btn-block font-weight-bold\">Acessar</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				}
			}
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
