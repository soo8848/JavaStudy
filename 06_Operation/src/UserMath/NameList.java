package UserMath;

public class NameList {
	private String[] names;
	private int count;
	public NameList(){
		this(5); //�ڽ� �Ǵ� �θ��� �����ڸ� ȣ��, 1�� 1���� ����
//		names=new String[5]; // �ߺ��ڵ带 ���̱� ���� this(5)�� ��ü
	}
	
	public NameList(int length) {	//����� �����ڴ� �Ű����� ���� �� ���� ���� ����
		names=new String[length];
	}
	public void add(String name) { // ������ �ִ°ź��� �ڵ� �� ����. ��ϵȰ� Ȯ���ϴ°� ���� ������.
		if(count == names.length) return;
		for (int i = 0; i < count; i++) {
			if(names[i].equals(name)) return; // ���߿� ���ܿ��� ó�� ���� ����.
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
