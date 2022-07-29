package ex06;

public class ConEx03 {

	public static void main(String[] args) {

		int point = 91;

		if (point >= 90) {
			System.out.println("A 학점");
		} else if (point >= 80) {
			System.out.println("B 학점");
		} else if (point >= 70) {
			System.out.println("C 학점");
		} else if (point >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("F 학점");
		}
		// ConEx02 처럼 if를 많이 사용하면, 연산을 많이함 --> 처리속도 증가
		// else if를 사용하면 해당구간 까지만 실행하고 벗어남.
		
		
	}
}
