//��������: abstract - ������ X -> �޸𸮿� �ø��ʿ������ ������ X, -> static final
interface SuperD{
	String SUPER_NAME="SuperD"; //public static final ���� ����
	void print();
	void methodD();
}
interface SuperF{
	void print(); //���� print�� �Ȱ����� �����ϰ� �������� �޼ҵ�� 3����. '����� ��ȣ�� ����'�� �̸������� �ƴ϶� ������ ������ ��� �浹�����̾���.
	void methodF();
}
class SubDF implements SuperD, SuperF{

	@Override
	public void methodF() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	} // implements�� ������ ������ ���(extends)
	
}
public class InterfaceTest {
	public static void main(String[] args) { // ����θ� ���� �������̽��� �Ѵ�.

	}
}
