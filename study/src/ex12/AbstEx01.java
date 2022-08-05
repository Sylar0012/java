package ex12;

abstract class Animal{
	abstract void sound();
	
	void move() {
		System.out.println("달린다");
	}
}

	

class Dog extends Animal{
	

	@Override
	void sound() {
		System.out.println("멍멍");
		
	}

}

class Cat extends Animal{
	

	@Override
	void sound() {
		System.out.println("야옹");
		
	}

}

public class AbstEx01 {
	
	public static void main(String[] args) {
		
	}

}
