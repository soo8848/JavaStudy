package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public interface Action {
	/**����� �Է��� ��� ������ ����, ���� ��� �̵��� ������ ���� */
	String execute(HttpServletRequest request)
			throws ServletException, IOException;
}