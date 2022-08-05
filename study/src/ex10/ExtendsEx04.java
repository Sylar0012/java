package ex10;

class 햄버거 {
	String name = "햄버거";
	
	String getName() {
		return "하하하";
	}
}

class 더블치즈햄버거 extends 햄버거{
	String name = "더블치즈햄버거";
	
	String getName() {
		return name;
	}
}

public class ExtendsEx04 {
	
	public static void main(String[] args) {
		햄버거 s =new 더블치즈햄버거();
		System.out.println(s.name);
		System.out.println(s.getName());
	}
}
