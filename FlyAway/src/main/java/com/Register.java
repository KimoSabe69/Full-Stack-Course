package com;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
    	super();
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
		HttpSession session = request.getSession(true);
		String firstname = request.getParameter("firstname");
		String surname = request.getParameter("surname");
		String email = request.getParameter("email");
		String cell = request.getParameter("cell");
		String password = request.getParameter("password");
		
		User member = new User(firstname, surname, email, cell, password);
		
		UserDAO register = new UserDAO();
		String message = register.insert(member);
		if (register.getApproved()) {
			System.out.println(session.getId());
			response.sendRedirect("Main.jsp");
			session.setAttribute("approved", true);
			session.setAttribute("user", email);
			response.getWriter().print(session.getId());
			response.getWriter().print("poes face");
			
		} else {
			response.getWriter().print(message);
			response.sendRedirect("Register.jsp");
			response.getWriter().print(session.getId());
		}
		
	}

}
