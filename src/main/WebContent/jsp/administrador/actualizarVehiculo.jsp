<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualizar</title>
</head>
<body>
<h1>Actualizar Vehiculo</h1>
<div class="wrapper">
    <form method="get" action="ActualizarVehiculoController">
        Placa: <input type="text" placeholder="Placa" name="placa" readonly> 
        <br> 
        Marca: <input type="text" placeholder="Marca" name="marca">
        <br>
        Año: <input type="text" placeholder="Anio" name="anio">
        <br> 
        Modelo: <input type="text" placeholder="Modelo"name="modelo">
        <br> 
        Chasis: <input type="text" placeholder="Chasis" name="chasis">
        <br> Propietario: <input type="text" placeholder="Propietario" name="propietario"><br>

        <button type="submit">Actualizar</button>
        <br>
    </form>
</div>
</body>
</html>