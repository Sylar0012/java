package ex10;

class 햄벅 {
	String name="햄버거";

	
	public 햄벅(String name) {
		this.name = name;
	}
	
	
}

class 더블치즈햄벅 extends 햄벅 {
	public 더블치즈햄벅() {
		super(""); // 안적어도 있는 코드
		System.out.println(1);
	}
}

public class ConEx02 {

	public static void main(String[] args) {
		더블치즈햄벅 s = new 더블치즈햄벅();

	}

}
