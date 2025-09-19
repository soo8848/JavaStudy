package com.oopsw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginAction")
public class LoginActionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
//		response.getWriter().append("loginAciton: ").append(id);
//		response.getWriter().append("Served at: ").append(request.getContextPath()); // 애 지우고 id 넣기.
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}