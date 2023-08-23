
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<%@include file="header_link.jsp"%>
<link rel="stylesheet" href="css/style.css">

<style type="text/css">
	.badge-btn {
		padding: 4px 6px;
		border: 1px solid #ddcccc;
		display: flex;
		border-radius: 4px;
		cursor: pointer;
	}
</style>

</head>
<body class="bg-light">

		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3 mt-5">
					<div class="card">
						<div class="card-body">
							<div>
								<h1 class="badge badge-primary" style="font-size: xx-large;">
									  Login Page <span class="badge" style="font-size: x-large; margin-left: 10px; background-color: rgb(233,84,140)">User</span>				
								</h1>
															
								
								<c:if test="${not empty successMsg}">
									<div class="alert-div">
										<div class="alert alert-success alert-dismissible fade show" role="alert">
										  <strong>${successMsg}</strong>
										  
										  <hr>
										  <p class="mb-0">Close the message box by clicking X to right.</p>
										  
										  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
										    <span aria-hidden="true">&times;</span>
										  </button>
										</div>									
									</div>
									<c:remove var="successMsg"/>							
								</c:if>
								
								<c:if test="${not empty errorMsg}">
									<div class="alert-div">
										<div class="alert alert-danger alert-dismissible fade show" role="alert">
										  <strong>${errorMsg}</strong>
										  
										  <hr>
										  <p class="mb-0">Close the message box by clicking X to right.</p>										  
										  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
										    <span aria-hidden="true">&times;</span>
										  </button>
										</div>									
									</div>
									<c:remove var="errorMsg"/>							
								</c:if>
															
							</div>

							<form method="POST" action="user_login" autocomplete="off">
								
								<div class="form-group">
									<label for="email">Enter Email</label>
									<input type="text" name="email" id="email" value="aditya@gmail.com" class="form-control">
								</div>
								<div class="form-group">
									<label for="password">Enter Password</label>
									<input type="password" name="password" id="password" value="123456" class="form-control">
								</div>									
								
								<div class="bg-white rounded box-shadow border-top border-gray mb-0 pt-2">
									<button type="submit" class="btn btn-primary">Submit to login</button>						
								</div>
								
								<div class="media text-muted pt-3 mb-0">
					          		<img data-src="holder.js/32x32?theme=thumb&amp;bg=e83e8c&amp;fg=e83e8c&amp;size=1" alt="32x32" class="mr-2 rounded" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_18945cb716a%20text%20%7B%20fill%3A%23e83e8c%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_18945cb716a%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23e83e8c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2212.134963274002075%22%20y%3D%2217.09129664897919%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true" style="width: 32px; height: 32px;">
						          	<p class="media-body mb-0 small lh-125 border-bottom border-gray">
					          	  		<strong class="text-gray-dark" style="display: flex; gap: 15px;">@Other login's 
					          	  			<a class="nav-link mb-0 badge-btn" href="index.jsp">Home</a>
					          	  		</strong>
					            		
					            		<span style="display: flex; gap: 5px;">
						            		<a class="nav-link mb-0 pb-0" style="padding: 0;" href="doctor_login.jsp">Doctor</a> - 
						            		<a class="nav-link mb-0 pb-0" style="padding: 0;" href="admin_login.jsp">Admin</a>
					            		</span>
						          	</p>
						        </div>									
							</form>						
							
						</div>
					</div>
				</div>
			</div>
		</div>

	<%@include file="footer_link.jsp"%>
</body>
</html>