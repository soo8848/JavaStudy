package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oopsw.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		String url="login.html"; //�޼���
		
		String memberId=request.getParameter("memberId");
		String pw=request.getParameter("pw");
		
		String resultName=new MemberDAO().login(memberId, pw);
		
		if(resultName !=null){
			HttpSession session=request.getSession(true);
			//�α��� ���� üũ , ��Ÿ �ʿ��� ���� ����
			session.setAttribute("loginOK", memberId);
			session.setAttribute("loginName", resultName);
//			session.setAttribute("info", new MemberVO(memberId, resultName));
			url="getVisitors.jsp";
		}		
		
		return url;
	}

}
