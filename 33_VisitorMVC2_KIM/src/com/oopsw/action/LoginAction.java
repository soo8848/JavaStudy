package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oopsw.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		String url="login.html"; // 실패하면 돌아오는 용. jsp는 회원가입 후 들어가는 창. 애는 평소에 쓸려는 창. 미묘한 차이.
		
		String memberId=request.getParameter("memberId");
		String pw=request.getParameter("pw");
		
		String resultName=new MemberDAO().login(memberId, pw);
		
		if(resultName !=null){ // 이번에는 로그인을 적극적으로한 상황 그러므로 session으로 유지
			HttpSession session=request.getSession(true);
			//서버에 저장할 거: 로그인 상태 체크 항목, 기타 필요한 정보,
			session.setAttribute("loginOK", memberId); // 나 로그인 했어~ 프라이머리키
			session.setAttribute("loginName", resultName); // 내 정보 수정하기
			// 이렇게 하나씩 말고 여러개 저장하면 안될까?
//			session.setAttribute("info", new MemberVO(memberId, resultName)); // 장바구니 같은 경우에 여기에 컬렉션 넣으면됨.
			url="getVisitors.jsp";
			
		}
		
		return null;
	}

}
