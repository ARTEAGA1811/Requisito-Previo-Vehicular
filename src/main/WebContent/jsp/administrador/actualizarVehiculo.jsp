<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Actualizar Vehículo</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/actualizarVehiculo.css">
</head>
<body>
    <main class="cuerpo">
        <div class="container_titulo">
            <h1 class="titulo">Actualizar Vehículo</h1>
        </div>

        <section class="nav">
            <h1 class="dato_principal">Placa del vehículo: ${placa} </h1>
            
            <form method="POST" action="ListarVehiculoController" class="nav_boton">
                <input type="submit" value="Atrás" class="boton_back">
            </form>
        </section>

        <div class="container">
            <div class="principal">
                <form method="POST" action="ActualizarVehiculoController" class="form">

                    <span>Año:</span>
                    <input type="text" name="anio" value="${anio}" class="item">

                    <span>Modelo:</span>
                    <input type="text" name="modelo" value="${modelo}" class="item">

                    <span>Marca:</span>
                    <input type="text" name="marca" value="${marca}" class="item">

                    <span>Chasis:</span>
                    <input type="text" name="chasis" value="${chasis}" class="item">

                    <span>Propietario:</span>
                    <input type="text" name="propietario" value="${propietario}" class="item">
                    
                    <input type="text" name="placa" value="${placa}" style="visibility: hidden">
                    

                    <input type="submit" value="Actualizar" class="submit">

                </form>    
            </div>
        </div>
  
    </main>
</body>
</html>