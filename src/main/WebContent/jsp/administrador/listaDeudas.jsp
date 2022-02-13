<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Lista vehiculos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <link rel="stylesheet" href="estilo.css" />
</head>

<body>
	
    <div class="wrapper">
        <h1>Deudas vehiculo ${placa}</h1>
        <div class="boton">
            <a href="RegistrarVehiculoController">Nueva Deuda</a>
        </div>

        <table class="tabla">
            <tr>
                <td>Descripción del rubro</td>
                <td>Valor</td>
                <td>Anio</td>
            </tr>

            <c:forEach items="${deudas}" var="deuda">
                <tr>
                    <td>Impuesto Rodaje</td>
                    <td>${deuda.valor} </td>
                    <td>${deuda.anio}</td>
                </tr>
            </c:forEach>

        </table>


    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

</html>