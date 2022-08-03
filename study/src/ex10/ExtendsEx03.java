package ex10;

class 동물{
	void sound() {
		System.out.println("동물소리");
	}
}

class 강아지 extends 동물{
	void sound() {
		System.out.println("강아지 소리");
	}// 자식이 sound 메서드를 재정의 함. ( 부모의 메서드 무효화됨 )
}

class 고양이 extends 동물{
	
}

public class ExtendsEx03 {

	public static void main(String[] args) {
		동물 u1 = new 강아지();// 동물을 가르키고 있으나 강아지가 sound 메서드를 재정의 해서 강아지의 sound가 출력된 모습
		u1.sound();
		
		동물 u2 = new 고양이();
		u2.sound();
		
	}
}
