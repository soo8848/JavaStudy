package UserMath;

public class NameListTset {
	public static void main(String[] args) {
	    NameList list = new NameList(3);
	    list.add("ȫ�浿");
	    list.add("�̼���");
	    list.add("ȫ�浿"); // 3������ ���´ٴ� ��Ȳ�� üũ�� �ȵȴ�.?
	    list.add("������");
	    list.add("�������");
	    System.out.println(list); //list.toString()
	}
}
