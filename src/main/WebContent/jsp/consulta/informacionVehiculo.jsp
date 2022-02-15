<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Información del Vehículo</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/informacionVehiculo.css">
</head>
<body>
    <main class="cuerpo">

        <div class="container_titulo">
            <h1 class="titulo">Información del Vehículo</h1>
        </div>

        <section class="nav">
            <h1 class="dato_principal">Bienvenido</h1>
            <form method="POST" action="LogOutController" class="nav_boton">
                <input type="submit" value="Salir" class="boton_back">
            </form>
        </section>

        <div class="container"> 
            <div class="principal">
                <section class="infoVehiculo">
                    <p class="infoVehiculo-item">Placa: </p>
                    <input type="text" value="${placa}" readonly>

                    <p class="infoVehiculo-item">Año: </p>
                    <input type="text" value="${anio}" readonly>

                    <p class="infoVehiculo-item">Marca: </p>
                    <input type="text" value="${marca}" readonly>

                    <p class="infoVehiculo-item">Modelo: </p>
                    <input type="text" value="${modelo}" readonly>
                    
                </section>
    
                <h3 class="val_pendientes">Valores Pendientes</h3>
    
                <section class="container__tabla">
                    <table class="tabla">
                        <tr>
                            <td class="encabezado td">Descripción del rubro</td>
                            <td class="encabezado td">Valor</td>
                            <td class="encabezado td">Año</td>
                        </tr>
                        <c:forEach items="${misDeudas}" var="deudas">
                            <tr>
                                <td class="td">Impuesto Rodaje</td>
                                <td class="td">${deudas.valor}</td>
                                <td class="td">${deudas.anio}</td>
                            </tr>
                        </c:forEach>   
                    </table>
                </section>
            </div>
                        
        </div>
    </main>
    
</body>
</html>