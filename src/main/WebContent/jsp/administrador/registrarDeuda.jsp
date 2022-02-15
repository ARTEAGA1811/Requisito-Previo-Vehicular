<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Deuda</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/registrarDeuda.css">
</head>
<body>
    <main class="cuerpo">
            <div class="container_titulo">
                <h1 class="titulo">Registrar Deuda</h1>
            </div>
    
            <section class="nav">
                <h1 class="dato_principal">Placa del vehículo ${placa} </h1>
                <form method="POST" action="LogOutController" class="nav_boton">
                    <input type="submit" value="Atrás" class="boton_back">
                </form>
            </section>

            <div class="container">
                <div class="principal">
                
                    <form method="POST" action="RegistrarDeudaController" class="form">

                        <span>Valor:</span>
                        <input type="text" name="valor"  class="item">


                        <span>Año:</span>
                        <input type="text" name="anio"  class="item">
                        
						<input type="text" name="placa" value="${placa}" style="visibility: hidden">
						<input type="text" name="id" value="${id}" style="visibility: hidden">
						
                        <input type="submit" value="Registrar" class="submit">
                    </form>
                </div>
            </div>
    </main>
</body>
</html>