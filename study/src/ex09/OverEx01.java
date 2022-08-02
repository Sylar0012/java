package ex09;

// 문법 : 오버로딩 (같은 이름의 메서드를 만들수 있다)
// 하나의 메서드에 과적재 했다는 뜻

public class OverEx01 {
	static void hello() {
		System.out.println("hello()");
	}

	static void hello(int num) {
		System.out.println("hello(int num)");
	}

	static void hello(int sum, String str) {
		System.out.println("hello(int sum, String str");
	}
	
	static void hello(String str, int sum) {
		System.out.println("hello(String str, int sum)");
	}

	public static void main(String[] args) {
		hello();
		hello("안녕",10);
	}
}
