<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="lib/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/media-queries.css" />
<meta name="viewport" content="width=device-width" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form role="form">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password">
			</div>
			<div class="form-group">
				<label for="exampleInputFile">File input</label> <input type="file"
					id="exampleInputFile">
				<p class="help-block">Example block-level help text here.</p>
			</div>
			<div class="checkbox">
				<label> <input type="checkbox"> Check me out
				</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	<div>
		<!-- <table>
			<c:forEach items="${personList}" var="person">
				<tr>
					<td><b>${person.id} - ${person.age} - ${person.name}</b></td>
				</tr>
			</c:forEach>

			============ HOHOHO +==============
			<form
				action="${pageContext.request.contextPath}/modulename/person/update"
				method="GET">
				<button type="submit">Show</button>
			</form>


			${myString}
		</table>


		<form
			action="${pageContext.request.contextPath}/modulename/person/search"
			method="GET">
			Search by: <select name="sel">
				<option value='all'>All
				<option value='1'>Id
				<option value='2'>Age
				<option value='3'>Name
			</select><br> <input type="text" name="toSearch"><br>

			<button type="submit">Search</button>
		</form>

		======================INSERT NI =======================

		<form
			action="${pageContext.request.contextPath}/modulename/person/insert"
			method="GET">
			ID : <input type="text" name="id" /><br /> NAME : <input
				type="text" name="name" /><br /> AGE : <input type="text"
				name="age" /><br />
			<button type="submit">Insert Me</button>
		</form>

		======================UPDATE NI =======================

		<form
			action="${pageContext.request.contextPath}/modulename/person/update"
			method="GET">
			ID : <input type="text" name="id" /><br /> NAME : <input
				type="text" name="name" /><br /> AGE : <input type="text"
				name="age" /><br />
			<button type="submit">Update Me</button>
		</form>

	</div> -->
</body>
<script src="lib/js/jquery-1.10.1.min.js"></script>
<script src="lib/js/bootstrap.min.js"></script>
<script src="js/common.js"></script>
<script src="lib/js/jquery.blockUI.js"></script>
</html>