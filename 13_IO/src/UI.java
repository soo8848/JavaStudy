import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {
//	private BufferedReader br; 이거 대신에 Scanner로 리팩토링
	private Scanner br;
	private FileWriter fileWriter; // 2.
	public UI() throws Exception{
//		br=new BufferedReader(new InputStreamReader(System.in));
		br=new Scanner(System.in);
		fileWriter = new FileWriter("out.txt", true); //3. FileWriter는 내부적으로 파일이없으면 새로 생성함. 단, 예외) 읽기모드일때는 제외.
			                                 // false는 기존 내용을 전부 지우고 새로 씀 (덮어쓰기)이다. true는 기존의 내용에서 이어 쓸 수 있게 해준다.
		while(true) {
			try {
				menu();
			} catch (IOException e) {
				e.printStackTrace(); // 에러 메세지 정도 출력 - 프로그램 지속
			} catch(Exception e) { // 예외정보를 유출하고 싶지 않아서 catch로 뒤에 있는 메소드 나 예외 정보를 미리 사전에 막는 것. 중간에 툭 끊키는 느낌. 코어api를 숨길떄
				System.out.println(e.getMessage()); 
				throw new Exception("new 예외, 다른 메세지 전달");
			}
		}//while
	}
	
	private void menu() throws Exception {
		System.out.print("Q를 입력하면 종료: ");
//		String m = br.readLine();
		String m=br.nextLine();
		if(m==null || "Q".equals(m)){
			fileWriter.close(); // 4. 파일의 메모리에 넣어놨다가 제일 마지막에만 .close()를 하면 직전에 flush가 실행되고 close가 실행되어 메모리에 있는걸 한번에 파일에 넣어줄 수 있다.
			throw new Exception("종료");
		}
		//1 그때 그때 저장한다. 2 생략하면 close할떄 호출된다-한꺼번에 저장
		fileWriter.write(m+"\n"); // write는 담기만 한다. 저장은 안함.
//		fileWriter.flush();  // 플러쉬는 담은거 저장하는 역할.
	}

	public static void main(String[] args) {
		try {
			new UI();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //마지막으로 무조건 돌아가는 구조 finally
			System.out.println("정상 종료");			
		}
	}
}
// 프로그램 열어놓으면 그 길 따라서 계속 간다. 프로그램이 끝나면 엄밀히말하면 그 길에 대한 권한이 닫히는 것. 즉 .close()되는 것이다. 