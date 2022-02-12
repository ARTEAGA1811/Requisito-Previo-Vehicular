<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Informaci�n de Vehiculo</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">
	
	<link rel="stylesheet" href="estilo.css" />
</head>

<body>
	<div class="wrapper">
		<h1>Informaci�n del Vehiculo</h1>
		<div class="cont">
			<p>Placa: ${placa}</p>
			<br>
			<p>Anio: ${anio}</p>
			<br>
			<p>Marca: ${marca}</p>
			<br>
			<p>Modelo: ${modelo}</p>
			

		</div>
		<h3>Valores Pendientes</h3>
		<table class="tabla">
			<tr>
				<td>Descripci�n del rubro</td>
				<td>Valor</td>
				<td>Anio</td>
			</tr>

			<c:forEach items="${misDeudas}" var="deudas">
				<tr>
					<td>Impuesto Rodaje</td>
					<td>${deudas.valor}</td>
					<td>${deudas.anio}</td>
				</tr>
			</c:forEach>

		</table>
		
		<form method="POST" action="LogOutController">
			<input type="submit" value="Cerrar"></input>
		</form>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>

</html>