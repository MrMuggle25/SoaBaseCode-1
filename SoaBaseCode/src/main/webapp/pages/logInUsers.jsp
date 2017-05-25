<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	    <meta name="description" content="">
	    <meta name="author" content="">
	    <link rel="icon" href="../css/alliance_icon.ico">
		<title>Login</title>

		<!-- Bootstrap core CSS -->
	    <link href="../lib/cssProject/bootstrap.min.css" rel="stylesheet">
	    <link href="../lib/jsProject/ie10-viewport-bug-workaround.css" rel="stylesheet">
	    <link href="../css/cssLogIn.css" rel="stylesheet">
	    <script src="../lib/jsProject/ie-emulation-modes-warning.js"></script>
	</head>
	<header class="header">
		<img src="../css/header_logo.png" class="logo">
	</header>
	<body>
		<div class="panel panel-primary">
            <div class="panel-heading">
              	<h3 class="panel-title">Administrator Login</h3>
            </div>
            <div class="panel-body">
              	<form class="form-signin" action="${pageContext.request.contextPath}/modulename/login"
			method="GET">
			        <input type="text" id="username" class="form-control" name="username" placeholder="ID Number" required autofocus>
			        <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Password" required>
			        <div class="checkbox">
				        <label class="text">
				            <input type="checkbox" value="remember-me"> Remember me
				        </label>
			        </div>
		        	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	      		</form>
            </div>
        </div>
    	<script src="ie10-viewport-bug-workaround.js"></script>
    	<script>
    		var username=request.getParameter("username");
    		if(username!=null && username.length()>0){
    			session.setAttribute("username", username);
    		}
    	</script>
	</body>
</html>