/**�����
 * �䱸����: �ڵ��� ����
 * ��� �� - �⺻ �� + �����
 * �ְ�� �� - ��޸� + ��������
 * */
public class SwitchTest {
	public static void main(String[] args) {
		String baseModel="�ڵ���";
		
		String sunroof=" �����";
		String navigation=" ���� ����";
		
		String basicModel = baseModel;
		String premiumModel = basicModel + sunroof;
		String topModel = basicModel + sunroof + navigation;
		
		String selectedModel = topModel;
		String carResult = "";

		switch (selectedModel) {
		case "�ڵ���":
			carResult = "�⺻ ��";
			break;
		case "�ڵ��� �����":
			carResult = "��� ��";
			break;
		case "�ڵ��� ����� ���� ����":
			carResult = "�ְ�� ��";
			break;
		}
		
        System.out.println("������ �� ����: " + selectedModel);
        System.out.println("�� ���� ���: " + carResult);
	}
}
