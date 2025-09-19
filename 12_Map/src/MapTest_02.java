import java.util.HashMap;
import java.util.Map;

public class MapTest_02 {
	public static void main(String[] args) {
		
	//요구사항: 1~3등까지 학생의 정보-(학번, 이름 등)를 학인하고 싶어요.
	Map<String, String> m1=new HashMap<>();
	m1.put("1등", "홍길동");
	m1.put("2등", "이순신");
	m1.put("3등", "세종대왕");
	m1.put("3등", "전혜영");
	System.out.println(m1);
	
	Map<Integer, Student> m2=new HashMap<>();
	m2.put(1, new Student("200101001","전혜영"));
	System.out.println(m2);
	}
}
