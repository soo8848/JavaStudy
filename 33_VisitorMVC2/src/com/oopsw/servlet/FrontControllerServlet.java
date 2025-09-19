package com.oopsw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oopsw.action.Action;
import com.oopsw.action.ActionFactory;

@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		//��� ��û�� ó�� /controller?cmd=addMemberUI		
		request.setCharacterEncoding("utf-8");
		String cmd=request.getParameter("cmd");
		if(cmd==null || cmd.trim().length()==0)
			cmd="mainUI";
		//���� Actionã�� �´�.
		Action action=ActionFactory.getAction(cmd);		
		//��� �������� �̵��Ѵ�.
		String url=action.execute(request);
		request.getRequestDispatcher("/"+url).forward(request, response);
	}	
}
