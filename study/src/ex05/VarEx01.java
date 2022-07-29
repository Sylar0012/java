package ex05;

public class VarEx01 {

	public static void main(String[] args) {
		int n1 = 10; // int는 4byte로 저장, 42억 9천개의 숫자 표현가능 ( 음수 포함 ) - 정수
		// int n2 = 3000000000; 42억 9천 안이지만 음수 양수 합쳐서 42억 9천개라 에러남 
		
		System.out.println(n1); 
		
		double d1 = 10.5; // 8byte. 경까지 표현가능(숫자가 아닌 경우의 수를 말함) . 정수 최대 21억까지만. - 실수
		
		System.out.println(d1);
		
		long lo1 = 3000000000L; // 8byte. 경개 까지 표현 가능 . 뒤에 L을 붙이면 30억을 lo1에 담을 수 있다.   - 정수 
		
		System.out.println(lo1);
		
		boolean b1 = true; // 1 or 0 을 저장 가능 => true or false . 1byte만 저장 가능.
		System.out.println(b1);
		
		System.out.println(10>5);
		System.out.println(10<5);
	}
	
}
