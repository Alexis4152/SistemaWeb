<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.js"
	integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css"
	type="text/css">

<script lenguaje="JavaScript" type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
	
<script>

alert("Soy alert")


$(document).ready(function(){
	
	llenartabla()
	
	$('#btnAgregar').on('click', function(){
		
		document.getElementById('modalAgregar').style.display = 'block'
		
	});
	

    $('#btnCerrar').on('click', function(){
		
		document.getElementById('modalAgregar').style.display = 'none'
		
	});
    
    $('#btnGuardar').on('click', function(){
		
		var trabajador = {
				nombre:$('#nombre').val(),
				edad:$('#edad').val(),
				salario:$('#salario').val(),
				fechaIngreso:$('#fecha').val()
		}
		
		console.log(trabajador.nombre)
		console.log(trabajador.edad)
		console.log(trabajador.salario)
		console.log(trabajador.fechaIngreso)
		
		$.ajax({
			type:"POST",
			url:"/Curso2/Trabajadores/insertTrabajadores",
			data:JSON.stringify(trabajador),
			dataType:"JSON",
			contentType: "application/json",
			success: function(response){
				alert(response.code)
				alert(response.message)
				alert(response.content)
				document.getElementById('modalAgregar').style.display = 'none'
				llenartabla()
			},
		});
	});
	
	$(document).on('click', '#deleteBtn', function(){
		
		var id = $(this).attr("value");
		 
		var trabajador = {
				idTrabajador:id
		}
		
		$.ajax({
			type:"POST",
			url:"/Curso2/Trabajadores/deleteTrabajadores",
			data:JSON.stringify(trabajador),
			dataType:"JSON",
			contentType: "application/json",
			success: function(response){
				alert(response.code)
				alert(response.message)
				alert(response.content)
				llenartabla()
			},
		});
				
	});
    
    
});


function llenartabla(){
	// AJAX - PARA PETICIONES ASINCRONAS
	// AJAX - CONSUMIR SERVICIOS
	
	/*
		private BigDecimal idTrabajador;
	private String nombre;
	private Integer edad;
	private Double salario;
	private Date fechaIngreso;
	
	*/
	$.ajax({
		type:"GET",
		url:"/Curso2/Trabajadores/getTrabajadores",
		dataType:"json",
		success: function(response){
			var table = $('#tablaTrabajadores').DataTable(); // SE CREA UNA VARIABLE, SE LE ASIGNA LA DATATABLE CON ID tablaSimple
			table.destroy(); // SE DESTRUYE LA TABLA
			$('#tablaTrabajadores').DataTable({
				data:response,
				responsive:true,
				columns: [
					{
						
						data:"idTrabajador",
						"searchable":false,
						"visible":false
					},
					{
						data:"nombre"
					},
					{
						data:"edad"
					},
					{
						data:"salario"
					},
					{
						data:"fechaIngreso"
					},
					{
						orderable: false,
                        searchable: false,
                        className: "text-center",
                        data: function (row, type, set) {
                            return '<a id="deleteBtn" class="btn btn-outline-danger" value="' + row.idTrabajador + '" ></a>';  //https://datatables.net/forums/discussion/59005/how-to-get-the-data-result-from-ajax-for-a-specific-row
                        },
					},
				],
			});
		},
	});
}


</script>	
	
	
</hexad>
<body>




  <br>
    <br>
      <br>



<div class="container">
  <div class="row">
    <div class="col">
     <button id="btnAgregar" type="button" class="btn btn-primary">Agregar</button>
    </div>
  </div>
  
  <br>
  
  
  
  <div class="row">
   <div class="col">
     <table id="tablaTrabajadores"
					class="table table-striped table-hover dt-responsive display nowrap"
					cellspacing="0">

<thead>

 <tr>
 
   <th>Id</th>
   <th>Nombre</th>
   <th>Edad</th>
   <th>Salario</th>
   <th>Ingreso</th>
 
 </tr>
   
  

</thead>

<!-- <tbody>
   <tr>
   <td>Alexis</td>
   <td>27</td>
   <td>Hombre</td>
  </tr>
   
   
</tbody>  -->


</table>
    </div>
  
  </div>
  
  
</div>



<div class="modal" tabindex="-1" id="modalAgregar">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Agregar trabajador</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Nombre</span>
  <input id="nombre" type="text" class="form-control"  aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Edad</span>
  <input id="edad" type="text" class="form-control"  aria-label="Username" aria-describedby="basic-addon1">
</div>
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Salario</span>
  <input id="salario" type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Fecha de ingreso</span>
  <input id="fecha" type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1">
</div>
      </div>
      <div class="modal-footer">
        <button id="btnCerrar" type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button id="btnGuardar" type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>