<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
			<%	
				try{
				session = request.getSession();
				boolean approved = Boolean.TRUE == request.getAttribute("approved");
				if(approved) {
					//response.sendRedirect("Main.jsp");
					response.getWriter().print("you are approved");
				} else {
					session.setAttribute("approved", false);
					response.getWriter().print("not approved\n");
					response.getWriter().print(request.getAttribute("user") + "\n");
					response.getWriter().print(session.getId());
				}
			} finally {
			}
			%>
		<meta charset="UTF-8">
		<title>FlyAway</title>
	</head>

	<body>
		<div align="center">
			<div>
				<h1>Welcome to FlyAway!</h1>
				<h3>Get started immediately using the form below:</h3>
			</div>
			<div>
				<form action="Plan" method="post">
					<table>
						<tr>
							<td>Depart from: </td>
							<td>
								<select name="Source" id="locationDeparture">
								  <option value="default"></option>
								  <option value="Dubai">Dubai</option>
								  <option value="Larnaka">Larnaka</option>
								  <option value="New York">New York</option>
								  <option value="Addis Ababa">Addis Ababa</option>
								</select>
							</td>
							<td> Arrive at: </td>
							<td>
								<select name="Destination" id="locationArrival">
								  <option value="default"></option>
								  <option value="Dubai">Dubai</option>
								  <option value="Larnaka">Larnaka</option>
								  <option value="New York">New York</option>
								  <option value="Addis Ababa">Addis Ababa</option>
								</select>
							</td>
						</tr>
						<tr><td>Depart on: </td>
							<td><input name="Departure" type="date"/></td>
							<td> Arrive on: </td>
							<td><input name="Arrival" type="date"/></td>
						</tr>
						<tr><td>Number of passengers<input name="Passengers" type="number" value="1"></td>
							<td><input type="submit" value="Check for flights"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</body>
</html>