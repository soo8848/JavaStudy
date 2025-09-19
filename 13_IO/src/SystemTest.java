import java.io.FileNotFoundException;
import java.io.PrintStream;
// 막간의 꿀팁 시간
public class SystemTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream("sys.txt")); // 내부에서 한글이 안깨지게 처리해준다. 나중에 모니터에 계속 write하게 되면 과부화가 걸리니 다른 파일로 write한 시간을 기록(로그)해놓거나 write에 쿨타임을 부여한다.
		System.out.println("시스템에서 기본 출력을-모니터에 해놓은거");
	}
}
