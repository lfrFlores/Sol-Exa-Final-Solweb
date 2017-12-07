<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>

<t:layout>
    <jsp:body>
    <div class="container">	
				<br><br>
				
		
			<form:form method="post" commandName="desastre">
	    	<div class="row">
		    	<div class="col-lg-1">
		    	</div>
	    		
	    		<div class="col-lg-5">
	    		<div>
					<form:label path="fecha">Fecha</form:label>
					<form:input id="fecha" path="fecha" cssClass="form-control"/>
					<form:errors path="fecha"></form:errors>
				</div>	
	    		</div>
	    	
	    	</div>
	    	
	    	<div class="row">
	    	<div class="col-lg-1">
		    	</div>
	    		<div class="col-lg-10">
	    		<div>
					<form:label path="tipo">Tipo</form:label>
					<form:input  path="tipo" cssClass="form-control"/>
					<form:errors path="tipo"></form:errors>
				</div>	
				
				
	    		</div>
	    	
	    		
	    	</div>
	    	
	    	
	    	<div class="col-lg-5">
	    		<div>
					<form:label path="distrito">Distrito</form:label>
					<form:input id="distrito" path="distrito" cssClass="form-control"/>
					<form:errors path="distrito"></form:errors>
				</div>	
	    		</div>
	    		
	    		<div class="col-lg-5">
	    		<div>
					<form:label path="numDam">Num Dam</form:label>
					<form:input id="numDam" path="numDam" cssClass="form-control"/>
					<form:errors path="numDam"></form:errors>
				</div>	
	    		</div>
	    				
				<br>
				<div class="row">
			<div class="col-lg-8">
			</div>
			<div class="col-lg-2">
				<div align = "right">			     
				<a href="<c:url value="/desastre"/>"class="btn btn-info btn-lg">Cancelar </a>
				</div>
				</div>
			<div class="col-lg-2">
			<div >		
											    	 
									</div>
									
									
									
									
									
		    						 		     
									    		        	
				<input type="submit" value="Guardar" class="btn btn-success  btn-lg"/>
				
				
				 			
			</div>	
			</div>
			
			
			</div>	
			<br>
			</form:form>
	    	</div>
	    	</div>
	    	<div class="col-lg-1">		      	
	    	</div>
	    	</div>
	    </div>	
	    
	    <style>
	    label, textarea{
	    color: black;
	    }
	    </style>	
    </jsp:body>
</t:layout>