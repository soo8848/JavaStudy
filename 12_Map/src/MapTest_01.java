import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest_01 {
	public static void main(String[] args) {
		// VM정보를 확인하고 싶음.
		Properties pro = System.getProperties(); // 특정 환경정보. 기본적인 api 이해 -> 관련된
													// api 얻어오는 연습
		// System.out.println(pro.keySet());
		Set<Object> keys = pro.keySet();

		for (Object key : keys) {
			System.out.println(key.toString() + "=" +
		    System.getProperty(key.toString()));
		} // foreach 향상된 for문
			// 위의 줄처럼 쓰는게 귀찮더라
			// 1.5
		Map<String, String> map = System.getenv();
		for (String key : map.keySet())
		     System.out.println(key + "=>" + System.getProperty(key));
	}
}
