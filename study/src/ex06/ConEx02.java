package ex06;

public class ConEx02 {

	public static void main(String[] args) {
		
		int point = 71;
		
		if (point >= 90 ) {
			System.out.println("A 학점");
		}
		
		if (point >=80 && point < 90 ) {
			System.out.println("B 학점");
		}
		
		if (point >=70 && point < 80) {
			System.out.println("C 학점");
		}
		
		if (point >=60 && point < 70) {
			System.out.println("D 학점");
		}
		
		if (point < 60) {
			System.out.println("F 학점");
		}
		
		
	}
}
