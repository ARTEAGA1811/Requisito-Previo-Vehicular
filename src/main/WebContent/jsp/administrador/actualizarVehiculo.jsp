<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualizar</title>
</head>
<body>
<h1>Actualizar Vehiculo</h1>
<div class="wrapper">
    <form method="POST" action="ActualizarVehiculoController">
        Placa: <input type="text"  name="placa" value="${placa}" readonly> 
        <br> 
        Marca: <input type="text"  name="marca" value="${marca}">
        <br>
        Año: <input type="text"  name="anio" value="${anio}">
        <br> 
        Modelo: <input type="text" name="modelo" value="${modelo}">
        <br> 
        Chasis: <input type="text"  name="chasis" value="${chasis}">
        <br> Propietario: <input type="text" placeholder="Propietario" name="propietario" value="${propietario}">
        <br>

        <button type="submit">Actualizar</button>
        <br>
    </form>
</div>
</body>
</html>