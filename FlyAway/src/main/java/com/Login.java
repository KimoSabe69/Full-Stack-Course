package com;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Member member = new Member(email, password);
		
		UserDAO login = new UserDAO();
		String message = login.verify(member);
		ResultSet results = login.getResults();
		try {
			results.next();
			String name = results.getString("Firstname");
			response.getWriter().print("\nLogged in as " + name + "\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().print("\nCould not fetch ID\n");
			
		}
		
		response.getWriter().print(message + "\n");
		//response.getWriter().print("\nLogged in as " + results.getString("Firstname"));
		//response.getWriter().print("\nLogged in as " + name);
		
		
		
		//String result = login.insert(member);
		//response.getWriter().print(result);
		
		
	}

}
