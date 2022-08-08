package ex22;


class Box<T> {
	T date;
}


public class GenericEx01 {

	static Box getDate(int num) {
		if(num==1) {
			return new Box<>();
		}else {
			return new Box<>();
		}
	}
	
	public static void main(String[] args) {
		
		Box <String>box1 = new Box<>();
		box1.date = "1";
		
		Box <Integer>box2 = new Box<>();
		box2.date = 1;
		
		Box<Integer> b1 = getDate(1);
		b1.date = 1;
		
		System.out.println(b1.date);
		
		Box<String> b2 = getDate(2);
		b2.date = "홍길동";
		
		System.out.println(b2.date);
	}
}
