package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
//1. ���� �� ������ �𸣴� interface�� Action ����
public interface Action {
	/**����ڰ� �Է��� ��� ������ �����ϰ�, ���� ��� �̵��� ������ ����(�ٽ��� ����)*/
	//Action����: HttpServletReqeust request�ѱ��
	String execute(HttpServletRequest request) //execute �޼���, ��ȯŸ��String <- ������ ��û ���� url�� String�̶�.
			throws ServletException, IOException; // �� �ΰ��� �ͼ����� �ѱ�� ������! ������ �ʴ´ٴ� �ǹ̸� ����
}