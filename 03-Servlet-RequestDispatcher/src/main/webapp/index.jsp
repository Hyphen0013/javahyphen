<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Login Page</title>
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
		</head>
	<body class="bg-light">
		
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3 mt-5">
					<div class="card">
						<div class="card-body">
							<h1 class="badge badge-primary" style="font-size: xx-large;">
								  Login Form<span class="badge badge-light" style="font-size: x-large; margin-left: 10px;">user</span>
								  <span class="sr-only">unread messages</span>							
							</h1>
							<form method="POST" action="login" autocomplete="off">
								
								<div class="form-group">
									<label>Enter Email</label>
									<input type="text" name="user_email" class="form-control" value="demo@gmail.com" data-description="dummyUsername" autocomplete="false">
								</div>
								
								<div class="form-group">
									<label>Enter Password</label>
									<input type="password" name="password" value="demo" class="form-control">
								</div>	
								
								<button type="submit" class="btn btn-primary">Submit</button>																					
								
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"></script>
	</body>
</html>