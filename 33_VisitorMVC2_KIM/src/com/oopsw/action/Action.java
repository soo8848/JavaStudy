package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
//1. 아직 뭘 만들지 모르니 interface로 Action 선언
public interface Action {
	/**사용자가 입력한 모든 정보를 전달하고, 실행 결과 이동할 페이지 리턴(핵심은 리턴)*/
	//Action목적: HttpServletReqeust request넘기기
	String execute(HttpServletRequest request) //execute 메서드, 반환타입String <- 브라우저 요청 값인 url이 String이라서.
			throws ServletException, IOException; // 이 두개의 익셉션을 넘기면 서버는! 멈추지 않는다는 의미를 전달
}