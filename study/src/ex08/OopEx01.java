package ex08;

class 앨리스 {
	private int 갈증 = 100; // 상태
	// private = 외부에서 접근불가능하게 만듬
	// 왜쓰냐 ? 상태에 직접적인 적근을 막기 위해. ( 실수를 줄여줌 )

	// getter ( 접근자 ) 
	int 갈증확인() {
		return 갈증;
		// 모든 상태를 직접적인 접근이 아닌 메서드를 통해서 접근해야 함.
	}

	// setter ( 설정자 )
	void 물마시기() {
		갈증 = 갈증 - 20;
	}
}

public class OopEx01 {

	public static void main(String[] args) {

		앨리스 e = new 앨리스();
		// e.갈증 = e.갈증 - 20; 상태를 바로 변경하면 안됨. 행위를 통해서 바꿔야 함.
		e.물마시기();
		System.out.println("엘리스의 갈증 지수는 : " + e.갈증확인());

	}
}
