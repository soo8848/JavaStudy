package com.oopsw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//메인은 시작과 끝이 같았다. @Teset는 로컬에서 간단하게 테스트할떄 Before와 After가 있었다.
//이론적으로 서버는 공유이므로 이 코드를 여러번 호출할 수도 있다는 것이다!
//JSP는 서버 떠있는 동안에 이것저것 다 할 수 있다.
//Servlet은 서버가 떠있는 중에 최초소스를 등록할 수가 없다. -> 그래서 개발자 입장에서는 서버를 내렸다가 다시 올려야된다.
// ㄴ 껏다켜도 메모리에 올라간 상태가 아니다. 누가 요청을 해야지 그제서야 메모리에 올라간다.
// 강사님서버에 들어간상황: 생성자코드를 살짝 변경 이게 다이나믹 로딩이다.
// ㄴ 가지고 있는 원본과 다르니 서버입장에서는 메모리에 있는거 끌어 내리면서 죽기 직전에 마지막으로 실행되는 메소드가 destory()이다.
// 끌어는 내렸는데, 요청은 안왔음. 메모리에 구조 올리면 낭비라 끌어만 내림.
// ㄴ 서버가 죽는 이유) 1.소스가 바뀜  2. 일정시간 지났을떄 3. 서버가 꺼지기 직전에
// 생명주기 메소드 (라이프 사이클) 이라함.
@WebServlet("/user")//서블릿 3.0대에서 이름을 정의하는 문법.
public class UserServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
    private int count;
    //서버가 메모리에 자동으로 올라갔다 -> 생성자가 실행됐다.
    public UserServlet() {
    	System.out.println("update UserServlet()" + ++count);
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("inint()" + ++count);
	}

	public void destroy() {
		System.out.println("destroy()" +  ++count);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()" + ++count);
		PrintWriter out = response.getWriter();
		out.println("server message ok");
		out.flush(); //넣기만한거 보낼떄
		out.close(); //끝나기전에 내부에서 자동으로 flush해줌.
		
		// response 통해서 나가는 길을 찾아서 내가 메서드를 서버 메서드라고 문자열을 전달. 그래서 브라우저까지 메세드 내용이 뜬다. <- response까지 된것. 그래서 초창기 서블릿은 문법을 이해해야지만 응용할 수 있었다. 그리고 IO를 이해해야지 사용할 수 있었고. 익셉션의 의미를 알고 있어야 커버가 가능하다.
		// 여기까지 한거보니까 문법적으로는 서블릿이 할 수 있는거 JSP가 다할 수 있고~ 그 반대도 성립하고~
		
		// 객관적으로 JSP가 더 쉽지만 서블릿이 보안에 더 좋기 떄문에 서블릿을 써야한다.
		// ㄴ 서블릿은 보안도 좋고 재사용할수도 있다.
		// ㄴ 서블릿은 아무거나 넣을 수 없고 최초소스를 승인 받아야된다.
		///ㄴ jsp는 서버가 떠있는 동안에 소스를 넣고 빼고 할 수 있다.
		
		//html은 껍데기만 제공하고 JS로 처리하자.
		//서블릿과 jsp의 핵심: request 와 response
		//request의 역할:  서버에 일 시키는 것.
		//response의역할: 브라우저에 일시키는 것.
		
		//jsp입장에서는 자바코드는 서버에서 도는애 html코드는 브라우저에서 도는애이다. 그래서 jsp는 서버에서 도는 코드는 컴파일을 안해서 별로다. html코드는 쉽다.
		//Servlet입장에서는 꼴랑문자열 하나를 보내기 위해서 PW객체를 만들고 ptinln해주고 flush해주고 close해줘야 되는 등  귀찮다.
		 
		//코드 오류를 알 수 있는 컴파일이 있는게 좋은데 Servlet은 컴파일이 있는데 JSP는 없다. 그래서 request에는 서블릿이 더 좋다.		
		//request는 Servlet이 담당하고. reponse는 jsp가 담당하자~
	
		//JSP는 내부적으로 서블릿으로 변해서 컴파일을 한다.
		//현재로서는 우리 서버에서는 html이 서버에 있는게 아니니 servlet이 조작할 수 없다. 그래서 jsp를 통해 조작해야 한다.
		
		
		//문법을 문법대로 외우지말고 보면서 해석
	}
}
