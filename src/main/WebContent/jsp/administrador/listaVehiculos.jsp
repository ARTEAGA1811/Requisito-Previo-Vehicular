<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Vehículos</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/listaVehiculos.css">
</head>
<body>
    <main class="cuerpo">
        <div class="container_titulo">
            <h1 class="titulo">Información del Vehículo</h1>
        </div>

        <section class="nav">
            <h1 class="dato_principal">Bienvenido ${nombreAdmin} </h1>
            <form method="POST" action="LogOutController" class="nav_boton">
                <input type="submit" value="Salir" class="boton_back">
            </form>
        </section>
        
        <div class="container">
            <div class="principal">
                
				<div class="container_form">
					<a href="RedireccionController?redireccion=0" class="boton">Registrar Vehículo</a>
				</div>
                <section class="container__tabla">
                    <table class="tabla">
                        <tr>
                            <td class="encabezado td">Placa</td>
                            <td class="encabezado td">Propietario</td>
                            <td class="encabezado td">Año</td>
                            <td class="encabezado td">Acciones</td>
                        </tr>
            
                        <c:forEach items="${vehiculos}" var="vehiculo">
                            <tr>
                                <td class="td">${vehiculo.placa}</td>
                                <td class="td">${vehiculo.propietario}</td>
                                <td class="td">${vehiculo.anio}</td>
                                <td class="td acciones"><a href="ListarDeudaController?idVehiculo=${vehiculo.id}&placa=${vehiculo.placa}">Ver deudas</a> || <a href="RedireccionController?placa=${vehiculo.placa}&redireccion=1">Actualizar</a> || <a href="EliminarVehiculoController?idVehiculo=${vehiculo.id}">Eliminar</a></td>
                            </tr>
                        </c:forEach>
            
                    </table>
                </section>    
            </div>
        </div>
    </main>
</body>
</html>