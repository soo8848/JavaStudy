//전제조건: abstract - 구현부 X -> 메모리에 올릴필요없으니 생성자 X, -> static final
interface SuperD{
	String SUPER_NAME="SuperD"; //public static final 생략 가능
	void print();
	void methodD();
}
interface SuperF{
	void print(); //위의 print와 똑같으니 제외하고 재정의할 메소드는 3개다. '상속의 모호성 문제'는 이름때문이 아니라 구현부 떄문에 고로 충돌날일이없다.
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
		
	} // implements는 종류가 같으면 상속(extends)
	
}
public class InterfaceTest {
	public static void main(String[] args) { // 선언부만 따로 인터페이스라 한다.

	}
}
