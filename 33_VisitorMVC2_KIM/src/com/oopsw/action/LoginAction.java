package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oopsw.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		String url="login.html"; // �����ϸ� ���ƿ��� ��. jsp�� ȸ������ �� ���� â. �ִ� ��ҿ� ������ â. �̹��� ����.
		
		String memberId=request.getParameter("memberId");
		String pw=request.getParameter("pw");
		
		String resultName=new MemberDAO().login(memberId, pw);
		
		if(resultName !=null){ // �̹����� �α����� ������������ ��Ȳ �׷��Ƿ� session���� ����
			HttpSession session=request.getSession(true);
			//������ ������ ��: �α��� ���� üũ �׸�, ��Ÿ �ʿ��� ����,
			session.setAttribute("loginOK", memberId); // �� �α��� �߾�~ �����̸Ӹ�Ű
			session.setAttribute("loginName", resultName); // �� ���� �����ϱ�
			// �̷��� �ϳ��� ���� ������ �����ϸ� �ȵɱ�?
//			session.setAttribute("info", new MemberVO(memberId, resultName)); // ��ٱ��� ���� ��쿡 ���⿡ �÷��� �������.
			url="getVisitors.jsp";
			
		}
		
		return null;
	}

}
