<%@ page language="java" contentType="text/html; charset=utf-8"%>
<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<title>Food Menu - Produto</title>

<link rel="sortcut icon" href="../assets/favicon.ico"
	type="image/x-icon" />

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
</head>

<body>
	<%@page
		import="java.util.List, entity.Client, entity.Category, entity.Menu"%>
	<%
		Client clientLogged = (Client) session.getAttribute("clientLogged");
	Menu menu = (Menu) session.getAttribute("menu");
	@SuppressWarnings("unchecked")
	List<Category> categories = (List<Category>) session.getAttribute("categories");
	if (clientLogged == null) {
		response.sendRedirect("./login.jsp");
	} else {
	%>
	<div class="card card bg-danger">

		<div class="card-header card bg-danger mb-3">
			<ul class="nav justify-content-end">
				<li class="nav-item"><a class="nav-link btn btn-danger btn-lg"
					href="../ClientServlet?pageURL=products.jsp?&clientID=${clientLogged.getId()}">Voltar</a>
				</li>
			</ul>
		</div>

		<div class="card card-group bg-danger">
			<div class="card">
				<div class="card-body">
					<h2 class="card-title font-weight-bold">Sobre o produto:</h2>
					<br />
					<form class="needs-validation" novalidate
						action="../ProductServlet" method="post">
						<input type="hidden" name="clientID"
							value="${clientLogged.getId()}" /> <input type="hidden"
							name="menuID" value="${menu.getId()}" />
						<div class="form-group">
							<div class="form-group col-md-15 font-weight-bold">
								<label for="inputNameProduct">Nome</label> <input type="text"
									class="form-control" id="inputNameProduct" name="name"
									placeholder="Qual o nome deste produto?" required="required" />
								<div class="invalid-feedback">Por favor, informe o nome do
									produto.</div>
							</div>
							<div class="form-group col-md-15 font-weight-bold">
								<label for="inputPriceProduct">Preço</label> <input type="text"
									class="form-control" id="inputPriceProduct" name="price"
									placeholder="Qual o preço deste produto?" required="required" />
								<div class="invalid-feedback">Por favor, informe o preço
									do produto.</div>
							</div>
							<div class="form-group col-md-15 font-weight-bold">
								<label for="inputDescription">Descrição (Opcional)</label> <input
									type="text" class="form-control" id="inputDescription"
									name="description"
									placeholder="Faça uma descrição deste produto" />
							</div>

							<div class="form-group col-md-15 font-weight-bold">
								<label for="inputEspeciality">Qual a categoria deste
									produto?</label> <select class="custom-select" required="required" id="inputEspecialitySelect"
									name="category">
									<%
										if (categories != null) {
										for (Category categoryProduct : categories) {
									%>
									<option selected="selected"
										value="<%=categoryProduct.getId()%>"><%=categoryProduct.getName()%></option>
									<%
										}
									} else {
									%>
									<option selected="selected"></option>
									<%
										}
									%>
								</select>
								<div class="invalid-feedback">Por favor, informe a
									categoria deste produto.</div>
							</div>
						</div>

						<button type="submit" id="buttonSubmit"
							class="btn btn-danger btn-lg btn-block font-weight-bold">Cadastrar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<%
		}
	%>

	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.0/jquery.mask.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#inputPriceProduct").mask("99.99");
		});
	</script>
	<script>
		// Exemplo de JavaScript inicial para desativar envios de formulário, se houver campos inválidos.
		(function() {
			'use strict';
			window.addEventListener('load',
					function() {
						// Pega todos os formulários que nós queremos aplicar estilos de validação Bootstrap personalizados.
						var forms = document
								.getElementsByClassName('needs-validation');
						// Faz um loop neles e evita o envio
						var validation = Array.prototype.filter.call(forms,
								function(form) {
									form.addEventListener('submit', function(
											event) {
										if (form.checkValidity() === false) {
											event.preventDefault();
											event.stopPropagation();
										}
										form.classList.add('was-validated');
									}, false);
								});
					}, false);
		})();
	</script>
</body>
</html>