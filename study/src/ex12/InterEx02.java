package ex12;

interface Callable{
	void 음식해();
}

class 라면 implements Callable{
	void 물올리기(){}
	void 가스에냄비올리기(){}
	void 불켜기() {}
	void 스프면넣기() {}
	@Override
	public void 음식해() {
		물올리기();
		가스에냄비올리기();
		불켜기();
		스프면넣기();
		System.out.println("라면 완성");
	}
}
class 김치찌게 implements Callable{
	void 물올리기(){}
	void 가스에냄비올리기(){}
	void 불켜기() {}
	void 김치넣기() {}
	void 두부넣기() {}
	@Override
	public void 음식해() {
		물올리기();
		가스에냄비올리기();
		불켜기();
		김치넣기();
		두부넣기();
		System.out.println("김치찌개 완성");
	}

}

public class InterEx02 {
	
	public static void main(String[] args) {
		라면 l1 = new 라면();
		김치찌게 l2 = new 김치찌게();
		l1.음식해();
		l2.음식해();
	}
}
