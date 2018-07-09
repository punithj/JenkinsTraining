<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample Page</title>
</head>
<body>
	<form action="LoginServlet">

			Please enter your username 		
			<input type="text" id="un" name="un"/><br>		
		
			Please enter your password
			<input type="text" id="pw" name="pw"/>
			
			<input type="submit" id="submit" value="submit">			
		
	</form>
	<a id="fp" href="forgotPassword.jsp">Forgot Password?</a>
</body>
</html>