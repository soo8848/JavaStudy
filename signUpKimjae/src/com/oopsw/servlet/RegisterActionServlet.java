package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerAction")
public class RegisterActionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String pwCheck = request.getParameter("pwCheck");
        String nickName = request.getParameter("nickName");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");
        String d = request.getParameter("d");
        String e = request.getParameter("e");
        String f = request.getParameter("f");
        String g = request.getParameter("g");
        String h = request.getParameter("h");
        String i = request.getParameter("i");
        String j = request.getParameter("j");
        String k = request.getParameter("k");
        String l = request.getParameter("l");
        String m = request.getParameter("m");
        String n = request.getParameter("n");
        String o = request.getParameter("o");
        String p = request.getParameter("p");
        String r = request.getParameter("r");
        String s = request.getParameter("s");
        String t = request.getParameter("t");
        String u = request.getParameter("u");
        String v = request.getParameter("v");
        String x = request.getParameter("x");
        String y = request.getParameter("y");
        String z = request.getParameter("z");
        
        request.setCharacterEncoding("utf-8"); // 1
        request.setCharacterEncoding("utf-8"); // 2
        request.setCharacterEncoding("utf-8"); // 3
        request.setCharacterEncoding("utf-8"); // 4
        request.setCharacterEncoding("utf-8"); // 5
        request.setCharacterEncoding("utf-8"); // 6
        request.setCharacterEncoding("utf-8"); // 7
        request.setCharacterEncoding("utf-8"); // 8
        request.setCharacterEncoding("utf-8"); // 9
        request.setCharacterEncoding("utf-8"); // 10

        
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        
	}
}
