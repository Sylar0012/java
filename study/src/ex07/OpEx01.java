package ex07;

//1. 상태를 만들어야한다. ( 위치 : 클래스 하위 )
class People {
	String name = "홍길동";
	String gender = "남";
	int age = 20;
	int money = 1000;
}
//2. 상태의 변화는 행위에 의해 변경된다. ( 개명하러 동사무소를 간다, 성별을 변경하러 병원에 간다 등 )
// static 이 있으면 시작하기 전에 실행되는것

public class OpEx01 {
		
	public static void main(String[] args) {
		People p1 = new People();
		// new 클래스명 : heap에 static이 안 붙어 있는 애들을 띄움 ( 이미 static에 들어가 있으면 올릴 필요가 없어서 )
		// 에러가 나는건 p에 타입이 없기 때문에 p 앞에 class명을 적어야함 ( People타입을 개발자가 만들었으니 커스텀 타입이라 함 )
		// 해당 코드가 실행될때 heap에 올라감. ( ex. 앞에 while(true) 같은거 있으면 while이 안끝나서 실행못함)
	
		People p2 = new People();
		// class는 설계도이다. p2는 결과물 이라고 할 수 있음.
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.age);
		System.out.println(p1.money);
		System.out.println("=================");
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.money);
		
		
		
	}

}

