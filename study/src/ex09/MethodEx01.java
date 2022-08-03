package ex09;
// 1. 메서드안 메서드 금지
// 2. static은 new할필요가 없음 ( 항상 떠있다 )
// 3. 메서드 하나에 두가지 일 시키지 마라
// 4. 리턴을 받으면 호출문이 결과값으로 바뀐다.


public class MethodEx01 {
	// 1. 더하기 빼기 메서드를 static으로 만들어서
	static int add(int a, int b) {
		// 2. 계산 수행 후 값을 리턴받고
		return a + b;
	}

	static int minus(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		// 3. 그 값을 minus 메서드에 대입하여 10을 빼라
		int a = add(10, 5); // 리턴을 하면 호출문이 결과값으로 변경됨.
		int b = minus(a,10);
		// 4. 출력
		System.out.println(b);
	}

}
