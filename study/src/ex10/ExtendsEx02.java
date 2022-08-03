package ex10;

class Animal{
	int num1 = 10;
}

class Dog extends Animal{ // 상속은 두개가 안됨.( 부모는 하나 )
	int num2 = 20;
}

public class ExtendsEx02 {
	
	public static void main(String[] args) {
		//Dog d1 = new Dog();// ->Dog, Animal
		Animal d1 = new Dog();// Dog, ->Animal
		System.out.println(d1.num1);
	
	}

}
