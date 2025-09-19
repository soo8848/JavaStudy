public interface CustomerService {
	//1. 고객 등록
	void customerAdd(Customer customer);
	//2. 특정 고객의 포인트를 확인
	int pointCheck(int customerId);
	//3. 특정 고객의 포인트를 수정
	boolean pointUpdate(int point, int customerId);
	//4. 특정 고객의 정보를 삭제
	boolean coustomerDelete(int customerId);
}
