import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/** ����� */
// ���� ������ �޼ҵ带 �A������ ������ ���� �ؼ� �޼ҵ�(); �� ���� �ҷ��;ߵ�. ����) ���⼭  ������ �� �޼ҵ�� static�� ������ �ȵ�.
public class IOTest_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fileWriter = new FileWriter("out.txt", true);

		while (true) {
			String message = null;
			try {
				message = bufferedReader.readLine();
			} catch (BufferOverflowException e) {
				e.printStackTrace();
			}
			if ("Q".equals(message)){
				break;
			}

//			System.out.println(message); while�� �ȿ� println�� ���� �ȵȴ�.
			fileWriter.write(message);
			fileWriter.flush();
		}
		bufferedReader.close();
		fileWriter.close();
	}
}
