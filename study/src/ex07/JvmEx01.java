package ex07;

class Person {
	static String name = "엘리스";

	int 목마름 = 100; // max값

	void 물마시기() {
		목마름 = 목마름 - 10;

	}

	void 달리기(int speed) {
		if (speed < 10) {
			목마름 = 목마름 + 10;
		} else if (speed < 20) {
			목마름 = 목마름 + 20;
		} else {
			목마름 = 목마름 + 30;
		}
	}
}

public class JvmEx01 {

	static String name = "JvmEx01";
    // static은 클래스별로 나눠져 있어서 같은 이름의 변수가 존재할 수 있다.
	public static void main(String[] args) {
		System.out.println(JvmEx01.name);
		System.out.println(Person.name);
		// class명을 직접 입력해서 들고온다.
		
		Person p = new Person(); // p는 main의 지역변수다 . ( Person의 주소를 담고있음 )
		p.물마시기();
		p.물마시기();
		p.물마시기();
		System.out.println(p.목마름);
		p.달리기(10);
		System.out.println(p.목마름);
		
		// main 이라는 메서드가 실행 되면, 스택공간에 데이터를 저장하기 전에 하나의 통에 코드를 모두 담는다. 
		// 그 후에 순서대로 하나씩 코드를 실행한다. 이것을 q가 비어진다고 한다.
		
		//stack은 메서드별로 따로 지정됨.
	}
}
