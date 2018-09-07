package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet ("/loginform")
public class Employee_form extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String firstname = req.getParameter("firstname");
		System.out.println(firstname);
		String lastname = req.getParameter("lastname");
		System.out.println(lastname);
		String email= req.getParameter("email");
		System.out.println(email);
		String address= req.getParameter("address");
		System.out.println(address);
		String gender = req.getParameter("gender");
		System.out.println(gender);
  	  req.setAttribute("firstname",firstname);
	  req.setAttribute("lastname",lastname);
	  req.setAttribute("email",email);
	  req.setAttribute("address",address);
	  req.setAttribute("gender",gender);
		
	    RequestDispatcher dispatcher=req.getRequestDispatcher("/frm.jsp");
	    dispatcher.forward(req, resp);
	
}
}
