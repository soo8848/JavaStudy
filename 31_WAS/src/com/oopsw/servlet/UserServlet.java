package com.oopsw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//������ ���۰� ���� ���Ҵ�. @Teset�� ���ÿ��� �����ϰ� �׽�Ʈ�ҋ� Before�� After�� �־���.
//�̷������� ������ �����̹Ƿ� �� �ڵ带 ������ ȣ���� ���� �ִٴ� ���̴�!
//JSP�� ���� ���ִ� ���ȿ� �̰����� �� �� �� �ִ�.
//Servlet�� ������ ���ִ� �߿� ���ʼҽ��� ����� ���� ����. -> �׷��� ������ ���忡���� ������ ���ȴٰ� �ٽ� �÷��ߵȴ�.
// �� �����ѵ� �޸𸮿� �ö� ���°� �ƴϴ�. ���� ��û�� �ؾ��� �������� �޸𸮿� �ö󰣴�.
// ����Լ����� ����Ȳ: �������ڵ带 ��¦ ���� �̰� ���̳��� �ε��̴�.
// �� ������ �ִ� ������ �ٸ��� �������忡���� �޸𸮿� �ִ°� ���� �����鼭 �ױ� ������ ���������� ����Ǵ� �޼ҵ尡 destory()�̴�.
// ����� ���ȴµ�, ��û�� �ȿ���. �޸𸮿� ���� �ø��� ����� ��� ����.
// �� ������ �״� ����) 1.�ҽ��� �ٲ�  2. �����ð� �������� 3. ������ ������ ������
// �����ֱ� �޼ҵ� (������ ����Ŭ) �̶���.
@WebServlet("/user")//���� 3.0�뿡�� �̸��� �����ϴ� ����.
public class UserServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
    private int count;
    //������ �޸𸮿� �ڵ����� �ö󰬴� -> �����ڰ� ����ƴ�.
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
		out.flush(); //�ֱ⸸�Ѱ� ������
		out.close(); //���������� ���ο��� �ڵ����� flush����.
		
		// response ���ؼ� ������ ���� ã�Ƽ� ���� �޼��带 ���� �޼����� ���ڿ��� ����. �׷��� ���������� �޼��� ������ ���. <- response���� �Ȱ�. �׷��� ��â�� ������ ������ �����ؾ����� ������ �� �־���. �׸��� IO�� �����ؾ��� ����� �� �־���. �ͼ����� �ǹ̸� �˰� �־�� Ŀ���� �����ϴ�.
		// ������� �Ѱź��ϱ� ���������δ� ������ �� �� �ִ°� JSP�� ���� �� �ְ�~ �� �ݴ뵵 �����ϰ�~
		
		// ���������� JSP�� �� ������ ������ ���ȿ� �� ���� ������ ������ ����Ѵ�.
		// �� ������ ���ȵ� ���� �����Ҽ��� �ִ�.
		// �� ������ �ƹ��ų� ���� �� ���� ���ʼҽ��� ���� �޾ƾߵȴ�.
		///�� jsp�� ������ ���ִ� ���ȿ� �ҽ��� �ְ� ���� �� �� �ִ�.
		
		//html�� �����⸸ �����ϰ� JS�� ó������.
		//������ jsp�� �ٽ�: request �� response
		//request�� ����:  ������ �� ��Ű�� ��.
		//response�ǿ���: �������� �Ͻ�Ű�� ��.
		
		//jsp���忡���� �ڹ��ڵ�� �������� ���¾� html�ڵ�� ���������� ���¾��̴�. �׷��� jsp�� �������� ���� �ڵ�� �������� ���ؼ� ���δ�. html�ڵ�� ����.
		//Servlet���忡���� �ö����ڿ� �ϳ��� ������ ���ؼ� PW��ü�� ����� ptinln���ְ� flush���ְ� close����� �Ǵ� ��  ������.
		 
		//�ڵ� ������ �� �� �ִ� �������� �ִ°� ������ Servlet�� �������� �ִµ� JSP�� ����. �׷��� request���� ������ �� ����.		
		//request�� Servlet�� ����ϰ�. reponse�� jsp�� �������~
	
		//JSP�� ���������� �������� ���ؼ� �������� �Ѵ�.
		//����μ��� �츮 ���������� html�� ������ �ִ°� �ƴϴ� servlet�� ������ �� ����. �׷��� jsp�� ���� �����ؾ� �Ѵ�.
		
		
		//������ ������� �ܿ������� ���鼭 �ؼ�
	}
}
