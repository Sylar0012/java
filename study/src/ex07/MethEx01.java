package ex07;

class 계산기{ // 메서드는 클래스 하위에 생성

	
	void 더하기(){
		System.out.println("더하기 메서드가 호출되었습니다.");
	
		// 누군가가 더하기 를 호출하면 실행됨.
	}
	int 빼기(int a, int b) { // ( ) 안에 있는 공간은 메모리에 안뜸. ( 메서드가 실행되기전에 실행될 필요가 없음 )
		
		return a-b; // 타입을 맞춰서 적어야함.

	}
	
	int 곱하기(int a, int b) {
		
		return a*b;
	}
	
	int 나누기(int a, int b) {
		
		return a/b;
	}
}

public class MethEx01 {

	public static void main(String[] args) {
		
		//더하기(); 실행안됨 ( 메모리에 없음 )
		
		// static 으로 띄울지 new로 띄울지는 프로그래머의 선택이다. ( 자기가 짜는데 누가 답을 못알려줌 )
		
		계산기 g = new 계산기();
		g.더하기();
		g.빼기(10, 5);
		// 10은 a에 대입, 5는 b에 대입 해당 라인이 실행될때 a와 b가 실행됨. 끝나면 메모리가 존재할 이유가 없으니 사라짐.
		// 빼기가 실행되면 int a, int b 에 할당된 메모리 값 (8byte) 가 뜨고 a 와 b에 값을 받은 후 메서드가 실행 될때 까지 heap에 남아있다.
		// 실행이 완료되면 heap에서 사라짐.
		
		//return 을 사용하면 메서드 호출의 결과가 해당 값으로 바뀜.
		
		int result = g.빼기(10, 5);
		
		System.out.println(result);
		
		int a = g.곱하기(50, 10);
		System.out.println(a);
		
		int b = g.나누기(50, 10);
		System.out.println(b);
	}
}
