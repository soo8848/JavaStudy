package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.oopsw.model.MemberDAO;
import com.oopsw.model.MemberVO;

public class AddMemberAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		//애가 해주는 아주 중요한 역할: 입력받은 데이터를 DBMS에 등록
		String url="addMember.html"; //nul일떄 실패 메세지 페이지 <- 실패메세지 전달하는데 실패 페이지 만들려면 지금 우리는 그거 만들려면 시간이 오래걸리니까 그냥 회원가입 다시하라고 회원가입 페이지로 되돌리는 것 
		//등록에서 문제가 발생하면 예외를 발생
		String memberId=request.getParameter("memberId");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		
		// 너네가 안했던 방식 - 이미 DAO없는 상태에서 불러오는건 쉬운데 없는 상태에서 추론해서 필요한 코드를 불러오는건 힘들다. TDD방식을 사용한 것.
//		new MemberDAO().addMember(memberId, pw, name);  // 매개인자를 이렇게 박아넣는거 보다 DAO로 만드는게 가변성 측면에서 좋다.
		String resultName = new MemberDAO().addMember(new MemberVO(memberId, pw, name));
		if(resultName !=null) { // 성공시는 null이 아닐떄
			request.setAttribute("message", resultName);
			//url="login.html"; //그냥 로그인 할때랑 회원가입할때하는!로그인 페이지는 다르다. 
			url="login.jsp";
		}
		
//		request.getRequestDispatcher("")
		return url;
	}

}
