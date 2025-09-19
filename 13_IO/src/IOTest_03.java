import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/** 김재욱 */
// 메인 밖으로 메소드를 뺸다음에 생성자 선언 해서 메소드(); 로 따로 불러와야됨. 주의) 여기서  밖으로 뺀 메소드는 static이 붙으면 안됨.
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

//			System.out.println(message); while문 안에 println이 들어가면 안된다.
			fileWriter.write(message);
			fileWriter.flush();
		}
		bufferedReader.close();
		fileWriter.close();
	}
}
