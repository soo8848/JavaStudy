package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.oopsw.model.MemberDAO;
import com.oopsw.model.MemberVO;

public class AddMemberAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		//�ְ� ���ִ� ���� �߿��� ����: �Է¹��� �����͸� DBMS�� ���
		String url="addMember.html"; //nul�ϋ� ���� �޼��� ������ <- ���и޼��� �����ϴµ� ���� ������ ������� ���� �츮�� �װ� ������� �ð��� �����ɸ��ϱ� �׳� ȸ������ �ٽ��϶�� ȸ������ �������� �ǵ����� �� 
		//��Ͽ��� ������ �߻��ϸ� ���ܸ� �߻�
		String memberId=request.getParameter("memberId");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		
		// �ʳװ� ���ߴ� ��� - �̹� DAO���� ���¿��� �ҷ����°� ��� ���� ���¿��� �߷��ؼ� �ʿ��� �ڵ带 �ҷ����°� �����. TDD����� ����� ��.
//		new MemberDAO().addMember(memberId, pw, name);  // �Ű����ڸ� �̷��� �ھƳִ°� ���� DAO�� ����°� ������ ���鿡�� ����.
		String resultName = new MemberDAO().addMember(new MemberVO(memberId, pw, name));
		if(resultName !=null) { // �����ô� null�� �ƴҋ�
			request.setAttribute("message", resultName);
			//url="login.html"; //�׳� �α��� �Ҷ��� ȸ�������Ҷ��ϴ�!�α��� �������� �ٸ���. 
			url="login.jsp";
		}
		
//		request.getRequestDispatcher("")
		return url;
	}

}
