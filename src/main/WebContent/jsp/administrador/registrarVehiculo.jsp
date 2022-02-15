<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Vehículo</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/registrarVehiculo.css">
</head>
<body>
    <main class="cuerpo">
        <div class="container_titulo">
            <h1 class="titulo">Registrar Vehículo</h1>
        </div>

        <section class="nav">
        
            <form method="POST" action="ListarVehiculoController" class="nav_boton">
                <input type="submit" value="Atrás" class="boton_back">
            </form>
        </section>

        <div class="container">
            <div class="principal">
                <form method="POST" action="RegistrarVehiculoController" class="form">

                    <span>Placa:</span>
                    <input type="text" name="placa"  class="item">

                    <span>Año:</span>
                    <input type="text" name="anio"  class="item">

                    <span>Modelo:</span>
                    <input type="text" name="modelo"  class="item">

                    <span>Marca:</span>
                    <input type="text" name="marca"  class="item">

                    <span>Chasis:</span>
                    <input type="text" name="chasis"  class="item">

                    <span>Propietario:</span>
                    <input type="text" name="propietario" class="item">

                    <input type="submit" value="Registrar" class="submit">
                </form>    
            </div>
        </div>
            
   
    </main>
</body>
</html>