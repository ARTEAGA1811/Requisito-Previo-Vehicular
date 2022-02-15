<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deudas del Vehículo</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/listaDeudas.css">
</head>
<body>
    <main class="cuerpo">

        <div class="container_titulo">
            <h1 class="titulo">Deudas del Vehículo</h1>
        </div>

        <section class="nav">
            <h1 class="dato_principal">Placa del vehículo: ${placa} </h1>
            
            <form method="POST" action="LogOutController" class="nav_boton">
                <input type="submit" value="Atrás" class="boton_back">
            </form>
            
        </section>

        <div class="container">
            <div class="principal">
              
                <div class="container_form">
					<a href="RedireccionController?redireccion=2&placa=${placa}" class="boton" class="boton">Nueva Deuda</a>
				</div>
                
                <h2 class="valores_pendientes">Valores pendientes</h2>

                <section class="container__tabla">
                    <table class="tabla">
                        <tr>
                            <td class="td encabezado">Descripción del rubro</td>
                            <td class="td encabezado">Valor</td>
                            <td class="td encabezado">Año</td>
                        </tr>
            
                        <c:forEach items="${deudas}" var="deuda">
                            <tr>
                                <td class="td">Impuesto Rodaje</td>
                                <td class="td">${deuda.valor}</td>
                                <td class="td">${deuda.anio}</td>
                            </tr>
                        </c:forEach>   
                    </table>
                </section>
            </div>
        </div>
    </main>
    
</body>
</html>