<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form
			action="${pageContext.request.contextPath}/modulename/addFacilitator" method="GET">
			Training ID : <input type="text" name="trainingID" /><br /> 
			UserID : <input type="text" name="userID" /><br /> 
			<button type="submit">Add</button>
		</form>
</body>
</html>