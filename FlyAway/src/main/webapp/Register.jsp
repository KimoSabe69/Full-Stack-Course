<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registration: FlyAway</title>
	</head>
	
	<body>
		<div align="center">
			<h1>FlyAway Registration</h1>
			<form action="Register" method="post">
				<table>
					<tr><td>First Name:</td>	<td><input	type="text"	name="firstname"/></td></tr>
					<tr><td>Surname:</td>		<td><input	type="text"	name="surname"/></td></tr>
					<tr><td>E-mail:</td>		<td><input	type="text"	name="email"/></td></tr>
					<tr><td>Cell:</td>			<td><input	type="text"	name="cell"/></td></tr>
					<tr><td>Password:</td>		<td><input	type="password"	name="password"/></td></tr>
					<tr>
						<td><a href="Login.jsp">Already a user?</a></td>
						<td><input	type="submit"	value="Register"/></td>
					</tr>
				</table>
			</form>
		</div>	
	</body>
</html>