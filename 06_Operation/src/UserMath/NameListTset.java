package UserMath;

public class NameListTset {
	public static void main(String[] args) {
	    NameList list = new NameList(3);
	    list.add("홍길동");
	    list.add("이순신");
	    list.add("홍길동"); // 3개까지 들어온다는 상황이 체크가 안된다.?
	    list.add("전혜영");
	    list.add("세종대왕");
	    System.out.println(list); //list.toString()
	}
}
