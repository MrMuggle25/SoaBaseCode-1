<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.container {
	position: relative;
	width: 50%;
	max-width:960px;
	text-align:center;
}

.image {
	position:relative;
	display: inline-block;
	max-width: 150px;
	max-height: 150px;
	width: auto;
	height: auto;
	
}

.overlay {
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	max-width: 150px;
	max-height: 150px;
	height: auto;
	width: auto;
	opacity: 0;
	transition: .5s ease;
	background-color: #008CBA;
	max-height: 150px;
}

.container:hover .overlay {
	opacity: 1;
}

.text {
	color: white;
	font-size: 20px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	-ms-transform: translate(-50%, -50%);
}

.container {
	height: 100%;
	min-height: 100%;
}

.first {
	float: left;
	width: 20%;
	height: 30%;
	background-color: red;
}

.second {
	float: left;
	width: 20%;
	height: 70%;
	background-color: green;
}

.third {
	float: right;
	width: 80%;
	height: 80%;
	background-color: blue;
}

.fourth {
	float: right;
	width: 40%;
	height: 20%;
	background-color: #DDDDDD;
}

</style>
<title>JAVA BASE CODE BETA 1.0</title>
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="lib/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/media-queries.css" />
<meta name="viewport" content="width=device-width" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>

	<h2>Alliance Training Effectiveness System (ATES)</h2>
	<p>Select role.</p>

	<div class="container">
		<div class="first">
			<img src="<c:url value='../lib/avatar.png'/>" alt="Avatar"
				class="image">
			<div class="overlay">
				<div class="text">Participant</div>
			</div>
		</div>
		<div class="second">
			<img src="<c:url value='../lib/avatar.png'/>" alt="Avatar"
				class="image">
			<div class="overlay">
				<div class="text">Specialist</div>
			</div>
		</div>
		<div class="third">
			<img src="<c:url value='../lib/avatar.png'/>" alt="Avatar"
				class="image">
			<div class="overlay">
				<div class="text">Facilitator</div>
			</div>
		</div>
		<div class="fourth">
			<img src="<c:url value='../lib/avatar.png'/>" alt="Avatar"
				class="image">
			<div class="overlay">
				<div class="text">Supervisor</div>
			</div>
		</div>

	</div>
	​

</body>
<script src="lib/js/jquery-1.10.1.min.js"></script>
<script src="lib/js/bootstrap.min.js"></script>
<script src="js/common.js"></script>
<script src="lib/js/jquery.blockUI.js"></script>
</html>
