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
        .fondo {
            background-image: url('./restaurante.jpg') #000;
            height: 100%;
            width: 100%;
            position: relative;
        }

        .centrado{
            position: absolute;
            top: 30%;
            width: 100%;
            text-align: center;
            font-size: 18px;
        }
        img{
            width: 100%;
            height: auto;
            opacity: 0.2;
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
            <li><a href="#" id="cerrarSesionLink">Cerrar Sesi&oacute;n</a></li>
         </ul>
        </nav>
    </header>

    <div class="fondo">
        <div class="centrado">
            <h1>BIENVENIDOS A NUESTRO RESTAURANTE</h1>
        </div>
        <img src="./restaurante.jpg" alt="" width="100%" height="100%">
    </div>
</body>
</html>
<script>
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