public interface CustomerService {
	//1. �� ���
	void customerAdd(Customer customer);
	//2. Ư�� ���� ����Ʈ�� Ȯ��
	int pointCheck(int customerId);
	//3. Ư�� ���� ����Ʈ�� ����
	boolean pointUpdate(int point, int customerId);
	//4. Ư�� ���� ������ ����
	boolean coustomerDelete(int customerId);
}
