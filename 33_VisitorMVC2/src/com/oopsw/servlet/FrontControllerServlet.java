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
		//모든 요청을 처리 /controller?cmd=addMemberUI		
		request.setCharacterEncoding("utf-8");
		String cmd=request.getParameter("cmd");
		if(cmd==null || cmd.trim().length()==0)
			cmd="mainUI";
		//일할 Action찾아 온다.
		Action action=ActionFactory.getAction(cmd);		
		//결과 페이지로 이동한다.
		String url=action.execute(request);
		request.getRequestDispatcher("/"+url).forward(request, response);
	}	
}
