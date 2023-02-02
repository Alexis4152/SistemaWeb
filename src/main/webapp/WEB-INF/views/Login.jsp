<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema web</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">		
</head>
<body>
<h1>Login</h1>
  <h3>${Bienvenida}</h3>
  
 <div class="container"> 
         
    <div class="row">
    
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
     
        <div class="card card-signin my-5">
         
 
          <div class="p-3 mb-2 bg-light text-dark"> <!-- FONDO DEL CONTENEDOR DEL LOGIN -->
            <form name="form" action="<c:url value='/Principal/Login'/>"
                    method="POST">
            <form class="form-signin">
              <div class="form-label-group">
              
                <input type="text" id="Username" class="form-control" placeholder="Usuario" name='username'>
                <br>
              </div>
              <div class="form-label-group">
                <input type="password" id="Pass" class="form-control" placeholder="Contraseña" name='password'>
             <br>
              </div>
		    <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" id="main">Iniciar sesión</button>
		   </form>
              <hr class="my-8">
               </form>
               <h5 id=respuestalogin"></h5>
          </div>
        </div>
      </div>
    </div>
  </div>
    
</body>
</html>