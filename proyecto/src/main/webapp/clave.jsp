<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .container{
 	position: relative;
 	width: 460px;
 	min-height: 400px;
 	background: rgba(255,255,255,0.1);
 	border-radius: 10px;
 	display: flex;
 	justify-content: center;
 	align-items: center;
 	backdrop-filter:blur(5px);
 	box-shadow: 0 25px 45px rgba(0,0,0,0.1);
 	border: 1px solid rgba(255,255,255,0.5);
 	border-right: 1px solid rgba(255,255,255,0.2);
 	border-bottom: 1px solid rgba(255,255,255,0.2);
 }

.form{
	position: relative;
	width: 100%;
	height: 100%;
	padding: 40px;
}

.form h2{
	position: relative;
	color: #fff;
	font-size: 24px;
	font-weight: 600;
	letter-spacing: 1px;
	margin-bottom: 40px;
}

.form h2::before{
	content: '';
	position: absolute;
	left: 0;
	bottom: -10px;
	width: 80px;
	height: 4px;
	background: #fff;
}

.form .inputBox
{
	width: 100%;
	text-align: center;
	margin-top: 20px;
}

.form .inputBox input
{
	width: 86%;
	background: rgba(255,255,255,0.2);
	border: none;
	outline: none;
	padding: 10px 20px;
	border-radius: 35px;
	border: 1px solid rgba(255,255,255,0.5);
 	border-right: 1px solid rgba(255,255,255,0.2);
 	border-bottom: 1px solid rgba(255,255,255,0.2);
 	font-size: 16px;
 	letter-spacing: 1px;
 	color: #fff;
 	box-shadow: 0 5px 15px rgba(0,0,0,0.05);
}


.form .inputBox input::placeholder{
	color: #fff;
}

.form .inputBox input[type="submit"]{
	background: #fff;
	color: #666;
	max-width: 200px;
	cursor: pointer;
	margin-bottom: 20px;
	font-weight: 600px;

}

.form .inputBox input[type="submit"]:hover{
	background: #eb80bf;
	color: #fff;

}

.forget{
	margin-top: 5px;
	color: #fff;
}
.forget a{
color: #fff;
font-weight: 600;
}
    </style>
</head>
<body>
    <div class="container">
        <div class="form">
            <h2>Recuperar contraseña</h2>
            <form action="Recupera" method="post" >
                <div class="inputBox">
                    <input type="text" placeholder="Correo electronico"/>
                </div>
                <div class="inputBox">
                    <input type="text" placeholder="Introduzca nueva contraseña"/>
                </div>
                <div class="inputBox">
                    <input type="text" placeholder="Introduzca la nueva contraseña"/>
                </div>
                <div class="inputBox">
                    <input type="submit" value="Enviar" />
                </div>
                <p class="forget">
                    Ya tienes una cuenta? <a href="index.html">Iniciar sesión</a>
                </p>
            </form>
        </div>
    </div>
</body>
</html>