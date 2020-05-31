/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: WildFly Full 19.0.0.Final (WildFly Core 11.0.0.Final) - 2.0.30.Final
 * Generated at: 2020-05-30 20:43:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import entity.Category;
import entity.Client;
import entity.Category;
import java.util.List;

public final class product_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("entity.Product");
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
      out.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://unpkg.com/feather-icons\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-2.2.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Food Menu - Produtos</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"sortcut icon\" href=\"../assets/favicon.ico\"\r\n");
      out.write("\ttype=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");

		Product product = (Product) session.getAttribute("product");
	if (product == null) {
		response.sendRedirect("./products.jsp");
	} else {
		Client clientLogged = (Client) session.getAttribute("clientLogged");
		@SuppressWarnings("unchecked")
		List<Category> categories = (List<Category>) session.getAttribute("categories");
		if (clientLogged == null) {
			response.sendRedirect("./login.jsp");
		} else {
	
      out.write("\r\n");
      out.write("\t<div class=\"card card bg-danger\">\r\n");
      out.write("\t\t<div class=\"card-header card bg-danger mb-3\">\r\n");
      out.write("\t\t\t<ul class=\"nav justify-content-end\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link btn btn-danger btn-lg\"\r\n");
      out.write("\t\t\t\t\thref=\"products.jsp\">Voltar</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"card card-group bg-danger\">\r\n");
      out.write("\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"card-title font-weight-bold\">Sobre o produto:</h2>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group col-md-15 font-weight-bold\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"popup();return false;\" data-placement=\"bottom\"\r\n");
      out.write("\t\t\t\t\t\t\ttitle=\"Remova este produto\" data-target=\"#modalExcluir\">\r\n");
      out.write("\t\t\t\t\t\t\t<i data-feather=\"trash-2\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"modal fade\" id=\"modalExcluir\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\t\trole=\"dialog\" aria-labelledby=\"ModalExcluir\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"../ProductServlet\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"pageURL\" value=\"products.jsp\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"_method\" value=\"delete\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"clientID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"menuID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"productID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"ModalExcluir\">Deseja\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trealmente excluir o produto?</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-label=\"Fechar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Fechar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger\">Excluir</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form class=\"needs-validation\" novalidate\r\n");
      out.write("\t\t\t\t\t\taction=\"../ProductServlet\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"pageURL\" value=\"products.jsp\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"hidden\" name=\"clientID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientLogged.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"menuID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"hidden\" name=\"categoryID\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getCategory().getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"productID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=hidden name=_method value=PUT />\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-15 font-weight-bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputNameProduct\">Nome</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"inputNameProduct\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Qual o nome deste produto?\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getName());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"invalid-feedback\">Por favor, informe o nome do\r\n");
      out.write("\t\t\t\t\t\t\t\t\tproduto.</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-15 font-weight-bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputPriceProduct\">Preço</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"inputPriceProduct\" name=\"price\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Qual o preço deste produto?\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getPrice());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"invalid-feedback\">Por favor, informe o preço\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdo produto.</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-15 font-weight-bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputDescription\">Descrição (Opcional)</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"inputDescription\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"description\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Faça uma descrição deste produto\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getDescription());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-15 font-weight-bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputEspeciality\">Qual a categoria deste\r\n");
      out.write("\t\t\t\t\t\t\t\t\tproduto?</label> <select class=\"custom-select\" required=\"required\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"category\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (product.getCategory() != null) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(product.getCategory().getId());
      out.write('"');
      out.write('>');
      out.print(product.getCategory().getName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										} else {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									if (categories != null) {
										for (Category category : categories) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(category.getId());
      out.write('"');
      out.write('>');
      out.print(category.getName());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"invalid-feedback\">Por favor, informe a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcategoria deste produto.</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-danger btn-lg btn-block font-weight-bold\">Salvar\r\n");
      out.write("\t\t\t\t\t\t\tMudanças</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

		}
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.0/jquery.mask.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#inputPriceProduct\").mask(\"99.99\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
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
      out.write("\t<script>\r\n");
      out.write("\t\t// Exemplo de JavaScript inicial para desativar envios de formulário, se houver campos inválidos.\r\n");
      out.write("\t\t(function() {\r\n");
      out.write("\t\t\t'use strict';\r\n");
      out.write("\t\t\twindow.addEventListener('load',\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t// Pega todos os formulários que nós queremos aplicar estilos de validação Bootstrap personalizados.\r\n");
      out.write("\t\t\t\t\t\tvar forms = document\r\n");
      out.write("\t\t\t\t\t\t\t\t.getElementsByClassName('needs-validation');\r\n");
      out.write("\t\t\t\t\t\t// Faz um loop neles e evita o envio\r\n");
      out.write("\t\t\t\t\t\tvar validation = Array.prototype.filter.call(forms,\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction(form) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tform.addEventListener('submit', function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tevent) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (form.checkValidity() === false) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tevent.stopPropagation();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tform.classList.add('was-validated');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}, false);\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}, false);\r\n");
      out.write("\t\t})();\r\n");
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
