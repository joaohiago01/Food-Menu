/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: WildFly Full 19.0.0.Final (WildFly Core 11.0.0.Final) - 2.0.30.Final
 * Generated at: 2020-05-30 17:40:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Category;
import java.util.List;
import java.util.List;
import entity.Client;
import entity.Category;

public final class categories_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("entity.Category");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("entity.Client");
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://unpkg.com/feather-icons\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Food Menu - Categorias</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"sortcut icon\" href=\"../assets/favicon.ico\"\r\n");
      out.write("\ttype=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		Client clientLogged = (Client) session.getAttribute("clientLogged");
	@SuppressWarnings("unchecked")
	List<Category> categories = (List<Category>) session.getAttribute("categories");
	if (clientLogged == null) {
		response.sendRedirect("./login.jsp");
	} else {
	
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-danger bg-danger\">\r\n");
      out.write("\t\t<a class=\"navbar-brand text-light font-weight-bold\"\r\n");
      out.write("\t\t\thref=\"../ClientServlet?pageURL=main.jsp?&clientID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Food\r\n");
      out.write("\t\t\tMenu</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\"\r\n");
      out.write("\t\t\taria-expanded=\"false\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link text-light font-weight-bold\"\r\n");
      out.write("\t\t\t\t\thref=\"../ClientServlet?pageURL=profile.jsp?&clientID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Perfil\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link text-light font-weight-bold\"\r\n");
      out.write("\t\t\t\t\thref=\"../ClientServlet?pageURL=restaurant_edit.jsp?&clientID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Restaurante</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown text-light\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle text-light font-weight-bold\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\tCardápio </a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu bg-danger\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item text-light font-weight-bold\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"../ClientServlet?pageURL=categories.jsp?&clientID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Categorias</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item text-light font-weight-bold\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"../ClientServlet?pageURL=products.jsp?&clientID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Produtos</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link text-light font-weight-bold\"\r\n");
      out.write("\t\t\t\t\thref=\"../ClientServlet?pageURL=login.jsp\">Sair</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"card-body\">\r\n");
      out.write("\t\t<div class=\"form-row col-sm-6 font-weight-bold\">\r\n");
      out.write("\t\t\t<a\r\n");
      out.write("\t\t\t\thref=\"../ClientServlet?pageURL=category_register.jsp?&clientID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" data-toggle=\"tooltip\" data-placement=\"bottom\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Adicionar nova categoria\">\r\n");
      out.write("\t\t\t\t\t<i data-feather=\"plus\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t");

				if (categories == null || categories.isEmpty()) {
			
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"card-title\">Nenhuma categoria encontrada</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				} else {
				for (Category categoryProduct : categories) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(categoryProduct.getName());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t<br /> <br />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				}
			}
			}
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfeather.replace()\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"[rel='tooltip']\").tooltip('show');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction popup() {\r\n");
      out.write("\t\t\t$('[id*=\"modalExcluir\"]').modal('show');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
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
