<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<html>
<head>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  	<meta name="description" content="">
  	<meta name="author" content="">
  	
  	
  	<!-- jquery -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    
    
  	
	<!-- Bootstrap core CSS -->
  	<link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" 
  		  rel="stylesheet">
  	<!-- Custom styles for this template -->
  	<link href="${pageContext.request.contextPath}/resources/css/shop-homepage.css" 
  		  rel="stylesheet">
  		  
  	<!-- addFlashAttribute message -->
  	<c:if test="${ not empty msg }">
            <script>
                alert("${ msg }");
            </script>
	</c:if>

	<title>MamuProject</title>
	
</head>

<body>