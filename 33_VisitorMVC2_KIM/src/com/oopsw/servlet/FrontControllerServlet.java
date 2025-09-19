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
 * 옛날에 만든 코드일 수록 /controller에 .do 나 .nhn을 붙인다. 최근에는 뺴는 추세다.
 */
@WebServlet("/controller") // 이런파일은 존재하지 않는다. 트릭같은거
public class FrontControllerServlet extends HttpServlet {
	//1. 서비스만 남기고 싹다 지우기
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		try {
//			System.out.println("아빠 안잔다5초대기");
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//핵심: 모든 요청을 처리 /controller?cmd=addMemberUI <-메뉴 요청 받아서
		
		String cmd = request.getParameter("cmd");
		if(cmd==null || cmd.trim().length()==0)//cmd가 null이거나 띄워쓰기빈칸만 들어가는 경우등의 띄워쓰기를 제거한 길이가 0인경우
			cmd="mainUI";
		//일할Action찾아 온다.
		Action action=ActionFactory.getAction(cmd); //핵심: cmd에 이상한 값이 들어갈 일이 없다. cmd를 통해서 action을 넘겨 받는 것.
		//일이끝나고 나면 결과 페이지로 이동한다.
		
		String url=action.execute(request);
		request.getRequestDispatcher("/"+url).forward(request, response);
		}
}
