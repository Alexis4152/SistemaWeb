<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title heres</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">


<%-- <script src="<c:url value="/resources/JavaScript/jquery-3.2.1.js" />"></script> --%>
	

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css"
	type="text/css">

<script
  src="https://code.jquery.com/jquery-3.2.1.js"
  integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
  crossorigin="anonymous"></script>
  
<script lenguaje="JavaScript" type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
	
	
	<script>
	 alert("Hola");
	
	 $(document).ready(function(){
		 $('#tablaSimple').DataTable();
	 });
	 
</script>
	
</head>
<body>
  <h3>${Bienvenida}</h3>
  
  <table id="tablaSimple">
	<thead>
		<tr>
			<th>Cabeza 1</th>
			<th>Cabeza 2</th>
			<th>Cabeza 3</th>
		</tr>
		</thead>
	</table>
</body>
</html>