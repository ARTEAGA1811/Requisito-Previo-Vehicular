<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulta-Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/consulta_login.css">
</head>
<body>
    <main class="cuerpo">

        <div class="container_titulo">
            <h1 class="titulo">Requisito previo - Matriculación</h1>
        </div>

         
        <form method="POST" action="LoginController" class="form_login">
            <div class="container_img">
                <img src="${pageContext.request.contextPath}/resources/profile-user.svg" alt="icono persona" class="icono_persona">
            </div>
            <input type="text" placeholder="Usuario" name="txtUsuario" class="form_login--input">
            
            <div class="container_img">
                <img src="${pageContext.request.contextPath}/resources/padlock.png" alt="icono candado" class="icono_candado">
            </div>
            <input type="password" placeholder="Contraseña" name="txtClave" class="form_login--input">      
            
            <input type="submit" value="Entrar" class="form_login--submit">
        </form>


        <div class="container">

            <picture class="container_img--chapaXD">
                <img src="${pageContext.request.contextPath}/resources/imagen.png" alt="agente de transito">
            </picture>

            <section class="container_multas">    
                <h2 class="titulo-multas">Consulta de multas pendientes</h2>
                <p class="texto">Seleccione el tipo de búsqueda:</p>

                <form method="GET" action="ConsultarVehiculoController" class="form_busqueda">

                    <div class="container_rbtn">
                        <label class="radio-inline"> 
                            <input type="radio" name="rbtnRadio" checked value="placa"> Placa
                        </label> 
            
                        <label class="radio-inline"> 
                            <input type="radio" name="rbtnRadio" value="chasis">Chasis
                        </label>
                    </div>
                    
                    <div class="container_ingresoDato">
                        <p class="ingresarDato">Ingrese el dato</p>
                        <input type="text" name="valor_placa_chasis" class="input_dato">
                    </div>
                    
                    <input type="submit" value="Consultar" class="consultar_submit">
                </form>
            </section>
        
        </div>
    </main>
    
    
</body>
</html>