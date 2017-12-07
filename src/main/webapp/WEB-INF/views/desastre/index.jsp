<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>

<t:layout>	
    <jsp:body>  
    <!-- Buscar -->
      <link href="<c:url value="/resources/styles/buscar.css" />" rel="stylesheet"/>
       <div class= "container">
   		
			<div  class="panel panel-default" style="filter:alpha(opacity=50); opacity:0.9;">			
			<br>
			<div class="row">
				<div class="col-lg-3">
					<div class="row">
						<div class="col-lg-6">
							<div align="right">
					    		<a  href="<c:url value="/desastre/agregar"/>" class="btn btn-success">Agregar  <span class="glyphicon glyphicon-plus"></span></a>
					    	</div>
						</div>
					</div>
				</div>					
			</div>			
			
    	<br>
    	<h1> Lista de Desastres</h1>
    		<div >
				<table class="table table-bordered" id="tabla">
					<thead>
						<tr>
							<th>Fecha</th>
							<th>Tipo</th>
							<th>Distrito </th>
							<th>Numero de Damnificados</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach var = "de" items="${desastres}">
							<tr>
							
								<td><c:out value = "${de.fecha}"/></td>
								<td><c:out value = "${de.tipo}"/></td>
								
								<td><c:out value = "${de.distrito}"/></td>
								
								<td><c:out value = "${de.numDam}"/></td>
								
								
								
							</tr>
			      	</c:forEach>
				</tbody>
			</table>
    	</div>
    	
    </div>
   </div>
<style>
	.table td,th {
			 text-align: center;   
			}
	.panel.panel-default{
	  	background-color: sky-blue;
	} 
    
   
</style>
    </jsp:body>
</t:layout>