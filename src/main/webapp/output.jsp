<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/">
		Company Name:        ${user.comName}</br>
		Company ID:          ${user.comId}</br>
		Number of Employees: ${user.emp}</br> 
		<input type="submit" value="Back">
	</form>
</body>
</html>