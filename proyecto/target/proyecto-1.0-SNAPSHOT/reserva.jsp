<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
          html,body{
         overflow-x: hidden;
         overflow-y: hidden;
        }
    body {
        font-family:'Poppins', sans-serif;
    }
    .fondo {
            position: relative;
        }
   header {
            background: rgba(0,0,0,0.7);
            width: 100%;
            position: fixed;
            z-index: 100;
        }

        nav {
        float: left;
        }

        nav ul {
        list-style: none;
        overflow: hidden; 
        }

        nav ul li {
        float: left;
        font-family: Arial, sans-serif;
        font-size: 16px;
        }
        nav ul li a {
        display: block;
        padding: 10px;
        color: #fff;
        text-decoration: none;
        }
        nav ul li:hover {
        background: #eca023;
        }
    .banner{
        min-height:100vh;
        background:linear-gradient(rgba(0,0,0,0.5), rgba(0,0,0,0.5)),url("fondo.jpeg") center/cover no-repeat;
        display: flex;
        flex-direction:column;
        justify-content:center;
        align-items: center;
        color:#ffff;
        padding-bottom:20px;
    }

    .card-img {
        background: url("tres.jpg") center/cover no-repeat;
    }

    .banner h2 {
        padding-bottom:7px;
        margin-bottom:10px;
        
    }

    .card-contenido {
        background:#fff;
        height:380px;
    }

    .card-contenido h3 {
        text-align:center;
        color: #000;
        padding: 25px 0 10px 0;
        font-size: 26px;
        font-weight:500;
    }

    .form-row{
        display:flex;
        width: 90%;
        margin: 0 auto;
    }
    form select, form input {
        display:block;
        width:100%;
        margin:15px 12px;
        padding: 5px;
        font-family:'Poppins', sans-serif;
        outline:none;
        border: none;
        border-bottom: 1px solid #eee;
        font-weight:300;
    }

    form input[type = text], 
    form input[type = number], 
    form input[type = date],
    form input[type = time],
    form input::placeholder,
    select{

    color: #5f5e5e;
    }

    form input[type = submit] {
        color: #fff;
        background: rgb(209, 7, 175);
        padding: 12px 0;
        border-radius: 4px;
        cursor:pointer;
    }

    form input[type = submit]:hover{
        opacity: 0.9;
    }



    @media(max-width:992px){
        .card-contenedor {
        
            grid-template-columns: 100%;
            
            }

            .card-img{
                height:330px;
            }
        }




    </style>
</head>
<body>
    <header>
        <nav>
            <ul>
            <li><a href="inicio.jsp">Inicio</a></li>
            <li><a href="#">Nosotros</a></li>
            <li><a href="carta.html">Carta</a></l>
            <li><a href="reserva.jsp">Reserva</a></li>
            <li><a href="#">Contacto</a></li>
            <li><a href="VerMisReservas">Ver mis Reservas</a></li>
            <li><a href="#" id="cerrarSesionLink">Cerrar Sesi&oacute;n</a></li>
         </ul>
        </nav>
    </header>
    <section class="banner fondo">
        <h2>RESERVA TU MESA</h2>
            <div class = "card-contenedor">
                <div class= "card-img">

                </div>
                <div class="card-contenido">
                    <h3>Reserva</h3>
                    <form id="reservar-mesa" action="Reserva" method="post">
                        <div class="form-row"> 
                            <input type="date" id="fecha" name="fecha">
                            <input type="time" id="hora" name="hora" min="10:00" max="24:00" required>
                        </div>

                        <div class="form-row">
                            <input type="text" placeholder="Nombre completo" id="nombre" name="nombre">
                            <input type="text" placeholder="Telefono" id="telefono" name="telefono">
                        </div>

                        <div class="form-row">
                            <input type="number" placeholder="Personas por mesa" id="personas" name="personas" min="1">
                            <input type="text" placeholder="Email" id="email" name="email">
                        </div>
                        <div class="form-row">
                            <input type="submit" value="RESERVAR MESA">
                        </div>
                        <div id="mensajeVacio" style="display: none; color: red;padding-left:25%;">
                            Rellene todos los campos
                        </div>
                        <div id="mensajeError" style="display: none; color: red;padding-left: 20px;">
                            La fecha tiene que ser igual o superior a la actual
                        </div>
                        <div id="mensaje" style="display: none; color: green;padding-left: 15%;">
                            La reserva ha sido a&ntildeadida con exito.
                        </div>
                    </form>

                </div>
            </div>
        
    </section>
</body>

</html>
<script>
    window.onload = function() {
            var params = new URLSearchParams(window.location.search);
            var error = params.get('error');
            var reserva = params.get('reserva');
            if (error === 'fecha') {
                // Mostrar el mensaje de error
                mostrarMensajeError();
            } else if(error === 'vacio'){
                mostrarMensajeErrorVacio() 
            }else if (reserva === 'aceptada') {
                mostrarMensaje();
            }
    };

    function mostrarMensajeError() {
        // Obtener el elemento del mensaje de error
        var mensajeError = document.getElementById("mensajeError");
        // Mostrar el mensaje de error
        mensajeError.style.display = "block";
    }
    function mostrarMensajeErrorVacio() {
        // Obtener el elemento del mensaje de error
        var mensajeError = document.getElementById("mensajeVacio");
        // Mostrar el mensaje de error
        mensajeError.style.display = "block";
    }
    function mostrarMensaje() {
        // Obtener el elemento del mensaje de error
        var mensaje = document.getElementById("mensaje");
        // Mostrar el mensaje de error
        mensaje.style.display = "block";
    }

    
    function borrarTodasLasCookies() {
    var cookies = document.cookie.split(";"); // Obtener todas las cookies
    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var igualPos = cookie.indexOf("="); // Encontrar el índice del signo igual
        var nombre = igualPos > -1 ? cookie.substr(0, igualPos) : cookie; // Obtener el nombre de la cookie
        document.cookie = nombre + "=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;"; // Configurar la fecha de expiración en el pasado
    }
}

function cerrarSesion() {
   
    borrarTodasLasCookies(); // Borra todas las cookies
    // Aquí puedes redirigir al usuario a la página de inicio de sesión u otra página deseada
    window.location.href = "index.html"; // Redirige a la página de inicio de sesión
}

document.getElementById("cerrarSesionLink").addEventListener("click", cerrarSesion);
</script>