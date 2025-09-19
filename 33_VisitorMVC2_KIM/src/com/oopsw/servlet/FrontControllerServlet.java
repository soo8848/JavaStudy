package com.oopsw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oopsw.action.Action;
import com.oopsw.action.ActionFactory;

/**
 * ������ ���� �ڵ��� ���� /controller�� .do �� .nhn�� ���δ�. �ֱٿ��� ���� �߼���.
 */
@WebServlet("/controller") // �̷������� �������� �ʴ´�. Ʈ��������
public class FrontControllerServlet extends HttpServlet {
	//1. ���񽺸� ����� �ϴ� �����
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		try {
//			System.out.println("�ƺ� ���ܴ�5�ʴ��");
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//�ٽ�: ��� ��û�� ó�� /controller?cmd=addMemberUI <-�޴� ��û �޾Ƽ�
		
		String cmd = request.getParameter("cmd");
		if(cmd==null || cmd.trim().length()==0)//cmd�� null�̰ų� ��������ĭ�� ���� ������ ������⸦ ������ ���̰� 0�ΰ��
			cmd="mainUI";
		//����Actionã�� �´�.
		Action action=ActionFactory.getAction(cmd); //�ٽ�: cmd�� �̻��� ���� �� ���� ����. cmd�� ���ؼ� action�� �Ѱ� �޴� ��.
		//���̳����� ���� ��� �������� �̵��Ѵ�.
		
		String url=action.execute(request);
		request.getRequestDispatcher("/"+url).forward(request, response);
		}
}
