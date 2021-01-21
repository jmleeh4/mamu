<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
	
<jsp:include page="/WEB-INF/views/common/header.jsp"/>




<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

<!-- 달력 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-datepicker.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap-datepicker.js"></script>


<div class="container">
<br> 



<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Create Account</h4>
	<p class="text-center">Get started with your free account</p>
	<p>
		<a href="" class="btn btn-block btn-twitter"> <i class="fab fa-twitter"></i>   Login via Twitter</a>
		<a href="" class="btn btn-block btn-facebook"> <i class="fab fa-facebook-f"></i>   Login via facebook</a>
	</p>
	<p class="divider-text">
        <span class="bg-light">OR</span>
    </p>
	<form id = "enrollForm"
		  action = "${pageContext.request.contextPath}/member/memberEnroll.do"
		  method = "POST">
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input id="member_id" name="memberId" class="form-control" placeholder="Create ID" type="text">
    </div> <!-- form-group// -->
        <div class="check_font" id="id_check"></div>
    
    
	<div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" placeholder="Create password" type="password" name="memberPw">
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" placeholder="Repeat password" type="password">
    </div> <!-- form-group// -->         
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input name="memberName" class="form-control" placeholder="Full name" type="text">
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-envelope"></i> </span>
		 </div>
        <input name="email" class="form-control" placeholder="Email" type="email" >
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
		</div>
    	<input name="phoneNum" class="form-control" placeholder="Phone number" type="text">
    </div>
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input name="address" class="form-control" placeholder="Address" type="text">
    </div> <!-- form-group// -->



	<div class="form-group">
        <button type="submit" id="enroll_submit" class="btn btn-primary btn-block"> Create Account  </button>
    </div> <!-- form-group// -->      
    <p class="text-center">Have an account? <a href="">Log In</a> </p>                                                              
</form>
</article>
</div> <!-- card.// -->

</div> 
<!--container end.//-->

<br><br>


<script>

	$("#member_id").blur(function() {

		var memberId = $("#member_id").val();

		$.ajax({
			url: "${pageContext.request.contextPath}/member/idCheck.do",
			data : {
				memberId : memberId 
			},
			method : "GET",
			dataType : "json",
			success : function(data){
				console.log(data);
				if(data.isAvailable == false) {
					$("#id_check").text("사용중인 아이디입니다.");
					$("#id_check").css("color", "red");
					$("#enroll_submit").attr("disabled",true);
				}else{
					if(/^\w{4,}$/.test(memberId) == true) {
						$("#id_check").text("사용 가능한 아이디입니다.");
						$("#id_check").css("color", "blue");
						$("#enroll_submit").attr("disabled",false);
					}else if(member_id == ""){
						
						$('#id_check').text('아이디를 입력해주세요 :)');
						$('#id_check').css('color', 'red');
						$("#reg_submit").attr("disabled", true);				
						
					} else {
						$('#id_check').text("아이디는 최소 4자리이상이어야 합니다.");
						$('#id_check').css('color', 'red');
						$("#reg_submit").attr("disabled", true);
					}
						
				}
				
			}, error : function() {
				console.log("실패");
			}
			
		})
		
		
	})
	

	$(function() {
		$('#datePicker').datepicker({
			format: "yyyy-mm-dd"
		})
	});

</script>




<jsp:include page="/WEB-INF/views/common/footer.jsp"/>