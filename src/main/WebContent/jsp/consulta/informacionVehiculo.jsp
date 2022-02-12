<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Información de Vehiculo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<link rel="stylesheet" href="estilo.css" />
</head>

<body>

	<div class="wrapper">
		<h1>Información del Vehiculo</h1>
		<div class="cont">
			<div>Placa: ${}</div>
			<div>Anio: ${}</div>
			<div>Marca: ${}</div>
			<div>Modelo: ${}</div>

		</div>
		<h3>Valores Pendientes</h3>
		<table class="tabla">
			<tr>
				<td>Descripción del rubro</td>
				<td>Valor</td>
				<td>Anio</td>
			</tr>

			<c:forEach items="${}" var="">
				<tr>
					<td>${}</td>
					<td>${}</td>
					<td>${}</td>
				</tr>
			</c:forEach>

		</table>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>

</html>