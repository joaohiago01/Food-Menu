<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<script src="https://code.jquery.com/jquery-2.2.4.js"></script>

<title>Food Menu - Restaurante</title>

<link rel="sortcut icon" href="../assets/favicon.ico"
	type="image/x-icon" />

</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-danger bg-danger">
		<a class="navbar-brand text-light font-weight-bold" href="main.jsp">Food
			Menu</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item"><a
					class="nav-link text-light font-weight-bold" href="profile.jsp">Perfil</a></li>
				<li class="nav-item"><a
					class="nav-link text-light font-weight-bold"
					href="restaurant_edit.jsp">Restaurante</a></li>
				<li class="nav-item dropdown text-light"><a
					class="nav-link dropdown-toggle text-light font-weight-bold"
					href="#" id="navbarDropdownMenuLink" role="button"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						Card�pio </a>
					<div class="dropdown-menu bg-danger"
						aria-labelledby="navbarDropdownMenuLink">
						<form action="../CategoryProductServlet" method="get">
							<input class="dropdown-item text-light font-weight-bold"
								type="submit" value="Categorias" />
						</form>
						<form action="../ProductServlet" method="get">
							<input class="dropdown-item text-light font-weight-bold"
								type="submit" value="Produtos" />
						</form>
					</div></li>
				<li class="nav-item"><a
					class="nav-link text-light font-weight-bold" href="login.jsp">Sair</a></li>
			</ul>
		</div>
	</nav>

	<div class="card card-group bg-danger">
		<div class="card">
			<div class="card-body">
				<%@page import="entity.Restaurant" language="java"%>

				<%
					Restaurant restaurant = (Restaurant) request.getSession().getAttribute("restaurant");
				%>
				<h2 class="card-title font-weight-bold">Sobre o restaurante:</h2>
				<br />
				<form class="needs-validation" novalidate method="post"
					action="../RestaurantServlet">
					<input type="hidden" name="_method" value="PUT" />
					<div class="form-group">
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputCnpj">CNPJ</label> <input type="text"
								class="form-control" id="inputCnpj"
								placeholder="Qual o CPNJ do restaurante?" required="required"
								value="<%restaurant.getCnpj();%>" />
							<div class="invalid-feedback">Por favor, informe o cnpj do
								restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputNameRestaurant">Nome do Restaurante</label> <input
								type="text" class="form-control" id="inputNameRestaurant"
								placeholder="Qual o nome do restaurante?" required="required"
								value="<%restaurant.getName();%>" min="3" max="60" />
							<div class="invalid-feedback">Por favor, informe o nome do
								restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputDescription">Descri��o (Opcional)</label> <input
								type="text" class="form-control" id="inputDescription"
								value="<%restaurant.getDescription();%>"
								placeholder="Fa�a uma descri��o do seu restaurante" />
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputPhone">Telefone</label> <input type="text"
								class="form-control" id="inputPhone"
								placeholder="Qual � o telefone do restaurante?"
								required="required" value="<%restaurant.getPhone();%>" />
							<div class="invalid-feedback">Por favor, informe o telefone
								do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputCep">CEP</label> <input type="text"
								class="form-control" id="inputCep"
								placeholder="CEP do restaurante" required="required"
								value="<%restaurant.getCep();%>" />
							<div class="invalid-feedback">Por favor, informe o CEP do
								restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputCity">Cidade</label> <input type="text"
								class="form-control" id="inputCity"
								placeholder="Cidade do restaurante" required="required"
								value="<%restaurant.getCity();%>" />
							<div class="invalid-feedback">Por favor, informe a cidade
								do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputState">Estado</label> <input type="text"
								class="form-control" id="inputState"
								placeholder="UF do restaurante" required="required"
								value="<%restaurant.getState();%>" />
							<div class="invalid-feedback">Por favor, informe o estado
								do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputDistrict">Bairro</label> <input type="text"
								class="form-control" id="inputDistrict"
								placeholder="Bairro do restaurante" required="required"
								value="<%restaurant.getDistrict();%>" />
							<div class="invalid-feedback">Por favor, informe o bairro
								do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputAddress">Endere�o</label> <input type="text"
								class="form-control" id="inputAdress"
								placeholder="Qual o endere�o do restaurante?"
								required="required" value="<%restaurant.getAddress();%>" />
							<div class="invalid-feedback">Por favor, informe o endere�o
								do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputNumber">N�mero</label> <input type="number"
								class="form-control" id="inputNumber"
								placeholder="N�mero do endere�o" required="required"
								value="<%restaurant.getNumber();%>" />
							<div class="invalid-feedback">Por favor, informe o n�mero
								do endere�o do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputAddtion">Complemento (Opcional)</label> <input
								type="text" class="form-control" id="inputAddtion"
								value="<%restaurant.getAddition();%>"
								placeholder="Complemento do endere�o" />
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputTimeBegin">Hor�rio de Abertura</label> <input
								type="text" class="form-control" id="inputTimeBegin"
								placeholder="Qual hor�rio seu estabelecimento abre?"
								required="required" value="<%restaurant.getTime_open();%>" />
							<div class="invalid-feedback">Por favor, informe o hor�rio
								de abertura do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputTimeEnd">Hor�rio de Encerramento</label> <input
								type="text" class="form-control" id="inputTimeEnd"
								placeholder="Qual hor�rio seu estabelecimento fecha?"
								required="required" value="<%restaurant.getTime_close();%>" />
							<div class="invalid-feedback">Por favor, informe o hor�rio
								de encerramento do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">

							<label for="inputDays">Quais dias o restaurante funciona?</label>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck1" name="monday"
									<%if (restaurant.isMonday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck1">Segunda-Feira</label>
							</div>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck2" name="tuesday"
									<%if (restaurant.isTuesday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck2">Ter�a-Feira</label>
							</div>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck3" name="wednesday"
									<%if (restaurant.isWednesday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck3">Quarta-Feira</label>
							</div>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck4" name="thursday"
									<%if (restaurant.isThursday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck4">Quinta-Feira</label>
							</div>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck5" name="friday"
									<%if (restaurant.isFriday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck5">Sexta-Feira</label>
							</div>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck6" name="saturday"
									<%if (restaurant.isSaturday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck6">Sab�do</label>
							</div>
							<div class="custom-control custom-checkbox custom-control-inline">
								<input type="checkbox" class="custom-control-input"
									id="customCheck7" name="sunday"
									<%if (restaurant.isSunday_open())%> checked="checked" /> <label
									class="custom-control-label" for="customCheck7">Domingo</label>
							</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputEspeciality">Qual a especialidade
								principal do restaurante?</label> <select class="custom-select">
								<option selected="selected">
									<%
										
									%>
								</option>
							</select>
							<div class="invalid-feedback">Por favor, informe a
								especialidade do restaurante.</div>
						</div>
						<div class="form-group col-md-15 font-weight-bold">
							<label for="inputDelivery">O restaurante possui servi�o
								de entrega?</label>
							<div class="custom-control custom-radio custom-control-inline">
								<input type="radio" id="customRadioDeliveryYes"
									name="customRadioDelivery" class="custom-control-input"
									<%if (restaurant.isDelivery())%> checked="checked" /><label
									class="custom-control-label" for="customRadioDeliveryYes">Sim</label>
							</div>
							<div class="custom-control custom-radio custom-control-inline">
								<input type="radio" id="customRadioDeliveryNo"
									name="customRadioDelivery" class="custom-control-input"
									<%if (!restaurant.isDelivery())%> checked="checked" /><label
									class="custom-control-label" for="customRadioDeliveryNo">N�o</label>
							</div>
						</div>
					</div>

					<button type="submit"
						class="btn btn-danger btn-lg btn-block font-weight-bold">
						Salvar Mudan�as</button>
				</form>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.0/jquery.mask.js"></script>
	<script type="text/javascript"
		src="https://github.com/igorescobar/jQuery-Mask-Plugin/blob/master/dist/jquery.mask.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#inputCnpj").mask("99.999.999/9999-99");
		});
		$(document).ready(function() {
			$("#inputCep").mask("99.999-999");
		});
		$(document).ready(function() {
			$("#inputPhone").mask("(00) 0000-00009");
		});
		$("#inputTimeBegin").mask("00:00");
		$("#inputTimeEnd").mask("00:00");
	</script>
	<script>
		// Exemplo de JavaScript inicial para desativar envios de formul�rio, se houver campos inv�lidos.
		(function() {
			'use strict';
			window.addEventListener('load',
					function() {
						// Pega todos os formul�rios que n�s queremos aplicar estilos de valida��o Bootstrap personalizados.
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