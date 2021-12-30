<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login: FlyAway</title>
	</head>
	
	<body>
		<div align="center">
			<h1>FlyAway Login</h1>
			<form action="Login" method="post">
				<table>
					<tr><td>Email:</td>			<td><input	type="text"	name="email"/></td></tr>
					<tr><td>Password:</td>		<td><input	type="password"	name="password"/></td></tr>
					<tr>
						<td><a href="Register.jsp">Not a user?</a></td>
						<td><input	type="submit"	value="Login"/></td>
					</tr>
				</table>
			</form>
		</div>	
	</body>
</html>