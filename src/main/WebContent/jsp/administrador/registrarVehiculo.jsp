<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Vehiculo</title>
</head>
<body>
	<h1>Registrar Vehiculo</h1>
	<div class="wrapper">
		<form method="POST" action="RegistrarVehiculoController">
			Placa: <input type="text" name="placa"> <br>
			Marca: <input type="text"  name="marca"> <br>
			Anio: <input type="text"  name="anio"> <br>
			Modelo: <input type="text" placeholder="Modelo" name="modelo">
			<br> Chasis: <input type="text" placeholder="Chasis" name="chasis"> 
			<br> Propietario: <input type="text" name="propietario">
			<br>
			<button type="submit">Guardar</button>
		</form>
	</div>
</body>
</html>