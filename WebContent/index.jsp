<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="alok" uri="/WEB-INF/alok.tld"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Tags</title>
</head>
<body>
	<form action="test.alok" method="post">
		<table align="center">
			<tr>
				<td><h2>Enter Name:</h2></td>
				<td><input type="text" name="fname" /></td>
				<td><alok:error property="fname" /></td>
			</tr>
			<tr>
				<td><h2>Enter Email:</h2></td>
				<td><input type="text" name="email" /></td>
				<td><alok:error property="email" /></td>
			</tr>
			<tr>
				<td align="center" colspan="3"><input type="submit"
					value="TEST" /></td>
			</tr>
		</table>
	</form>
</body>
</html>