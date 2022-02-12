<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="estilo.css" />
</head>

<body>

	<div class="topnav">
		<div class="texto">Requisito previo - Matriculación</div>
		<div class="login-container">
			<form method="get" action="LoginController">
				<input type="text" placeholder="Usuario" name="Usuario"> <input
					type="text" placeholder="Contraseña" name="clave">
				<button type="submit">Login</button>
			</form>
		</div>
	</div>
	<div class="wrapper">
		<h2>Consulta de multas pendiente</h2>
		<p>Seleccione tipo de Búsqueda:</p>
		<form method="get" action="ConsultarVehiculoController">
			<label class="radio-inline"> <input type="radio"
				name="optradio" checked>Placa
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">Chasis
			</label>
			<p>Ingrese Dato</p>
			<input type="text" name="placa">
			<button type="submit">Consultar</button>
			<br>
		</form>
	</div>

	</div>

</body>

</html>
