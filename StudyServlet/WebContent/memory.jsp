<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <h1> tomcat memory </h1>
    <h2>request</h2>
     브라우저에서 서버로 보낸 값: <%=request.getAttribute("r1") %> 
               클라이언트에서 온 값: <%=request.getParameter("cmd") %>
               
    <h2>session</h2>
    <%=session.getAttribute("s1") %>
    
    <h3>세션 해제</h3>
    <%if(session !=null) session.invalidate();%>

<h4>application</h4>
<%=application.getAttribute("info") %>
