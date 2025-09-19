package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MemoryServlet
 */
@WebServlet("/memory")
public class MemoryServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd=request.getParameter("cmd");
		
		//cmd의 값을 구분해서 메모리에 저장하고 싶은거예요.
		request.setAttribute("r1", cmd);
		
		//세션이 없을 때 새로 만들겠다는 옵션
		HttpSession session = request.getSession(true); // 로그인을하거나, 쇼핑몰에서 오늘본 상품 정보                                     매개인자가 있는 세션은 확실히 세션을 만들어라 라는 뜻
		session.setAttribute("s1", "session "+ cmd);
		
		ServletContext application = request.getServletContext();//서블릿컨텍스트는 상징적으로 application이라고함.
		if(application.getAttribute("info") == null) {
			application.setAttribute("info", "공유데이터");
		}
		
		request.getRequestDispatcher("memory.jsp").forward(request, response);
	}

}
