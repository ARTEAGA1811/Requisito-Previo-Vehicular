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
    <form method="get" action="RegistrarVehiculoController">
        Placa: <input type="text" placeholder="Placa" name="placa"> <br> Marca: <input type="text" placeholder="Marca" name="marca"> <br> Anio: <input type="text" placeholder="Anio" name="anio"> <br> Modelo: <input type="text" placeholder="Modelo" name="modelo">        <br> Chasis: <input type="text" placeholder="Chasis" name="chasis"> <br> Propietario: <input type="text" placeholder="Propietario" name="propietario"><br>
        <button type="submit">Guardar</button>
        <br>
    </form>
</div>
</body>
</html>