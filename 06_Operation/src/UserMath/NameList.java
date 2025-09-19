package UserMath;

public class NameList {
	private String[] names;
	private int count;
	public NameList(){
		this(5); //자신 또는 부모의 생성자를 호출, 1줄 1번만 가능
//		names=new String[5]; // 중복코드를 줄이기 위해 this(5)로 대체
	}
	
	public NameList(int length) {	//사실은 생성자는 매개인자 많은 것 부터 구현 권장
		names=new String[length];
	}
	public void add(String name) { // 원래는 넣는거부터 코딩 잘 안함. 등록된거 확인하는거 부터 먼저함.
		if(count == names.length) return;
		for (int i = 0; i < count; i++) {
			if(names[i].equals(name)) return; // 나중엔 예외에서 처리 가장 좋다.
		}
		names[count++]=name;
	}
	@Override
	public String toString() {
		String message="";
		for(int i=0; i<count; i++)
			message += names[i]+" ";
		return message;
	}
}
