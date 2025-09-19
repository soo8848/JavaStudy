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
		
		//cmd�� ���� �����ؼ� �޸𸮿� �����ϰ� �����ſ���.
		request.setAttribute("r1", cmd);
		
		//������ ���� �� ���� ����ڴٴ� �ɼ�
		HttpSession session = request.getSession(true); // �α������ϰų�, ���θ����� ���ú� ��ǰ ����                                     �Ű����ڰ� �ִ� ������ Ȯ���� ������ ������ ��� ��
		session.setAttribute("s1", "session "+ cmd);
		
		ServletContext application = request.getServletContext();//�������ؽ�Ʈ�� ��¡������ application�̶����.
		if(application.getAttribute("info") == null) {
			application.setAttribute("info", "����������");
		}
		
		request.getRequestDispatcher("memory.jsp").forward(request, response);
	}

}
