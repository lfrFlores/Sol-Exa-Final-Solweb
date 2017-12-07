<%@tag description="Página Layout" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 


	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Título</title>	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    
    
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   
    <link href="<c:url value="/resources/styles/styles.css" />" rel="stylesheet"/>
   <script src="<c:url value="/resources/js/jquery-latest.min.js" />"></script>
   <title>CSS MenuMaker</title>
   
</head>
<body>
	
		  <jsp:doBody/>

</body>
</html>