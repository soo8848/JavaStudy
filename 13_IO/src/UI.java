import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {
//	private BufferedReader br; �̰� ��ſ� Scanner�� �����丵
	private Scanner br;
	private FileWriter fileWriter; // 2.
	public UI() throws Exception{
//		br=new BufferedReader(new InputStreamReader(System.in));
		br=new Scanner(System.in);
		fileWriter = new FileWriter("out.txt", true); //3. FileWriter�� ���������� �����̾����� ���� ������. ��, ����) �б����϶��� ����.
			                                 // false�� ���� ������ ���� ����� ���� �� (�����)�̴�. true�� ������ ���뿡�� �̾� �� �� �ְ� ���ش�.
		while(true) {
			try {
				menu();
			} catch (IOException e) {
				e.printStackTrace(); // ���� �޼��� ���� ��� - ���α׷� ����
			} catch(Exception e) { // ���������� �����ϰ� ���� �ʾƼ� catch�� �ڿ� �ִ� �޼ҵ� �� ���� ������ �̸� ������ ���� ��. �߰��� �� ��Ű�� ����. �ھ�api�� ���拚
				System.out.println(e.getMessage()); 
				throw new Exception("new ����, �ٸ� �޼��� ����");
			}
		}//while
	}
	
	private void menu() throws Exception {
		System.out.print("Q�� �Է��ϸ� ����: ");
//		String m = br.readLine();
		String m=br.nextLine();
		if(m==null || "Q".equals(m)){
			fileWriter.close(); // 4. ������ �޸𸮿� �־���ٰ� ���� ���������� .close()�� �ϸ� ������ flush�� ����ǰ� close�� ����Ǿ� �޸𸮿� �ִ°� �ѹ��� ���Ͽ� �־��� �� �ִ�.
			throw new Exception("����");
		}
		//1 �׶� �׶� �����Ѵ�. 2 �����ϸ� close�ҋ� ȣ��ȴ�-�Ѳ����� ����
		fileWriter.write(m+"\n"); // write�� ��⸸ �Ѵ�. ������ ����.
//		fileWriter.flush();  // �÷����� ������ �����ϴ� ����.
	}

	public static void main(String[] args) {
		try {
			new UI();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //���������� ������ ���ư��� ���� finally
			System.out.println("���� ����");			
		}
	}
}
// ���α׷� ��������� �� �� ���� ��� ����. ���α׷��� ������ ���������ϸ� �� �濡 ���� ������ ������ ��. �� .close()�Ǵ� ���̴�. 