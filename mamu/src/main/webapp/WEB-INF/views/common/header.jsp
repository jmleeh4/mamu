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
  		  
  	<!-- 약관동의 css -->
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/enrollStyle.css"/>
		  
	<!-- 회원가입 css -->
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	

    
    
  	<!-- addFlashAttribute message -->
  	<c:if test="${ not empty msg }">
            <script>
                alert("${ msg }");
            </script>
	</c:if>

	<title>MamuProject</title>
	
</head>

<body>

	  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">선영이바보 풉</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="">로그인</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/member/agreement.do">회원가입</a>
          </li>
        </ul>
      </div>
    </div>
 </nav>