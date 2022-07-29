package test;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b;
		String c;
		System.out.print("숫자를 입력하세요");
		a = scan.nextInt();
		System.out.print("숫자를 입력하세요");
		b = scan.nextInt();
		System.out.print("부호를 입력하세요 (+, -, *, / )");
		c = scan.next();
		switch (c) {

		case "+":
			System.out.println(a + " + " + b + " = " + a + b);
			break;

		case "-":
			System.out.println(a + " - " + b + " = " + (a - b));
			break;
			
		case "*":
			System.out.println(a + " * " + b + " = " + (a * b));
			break;
			
		case "/":
			if ((b != 0) && a<b) {
				System.out.println(a + " / " + b + " = " + (a / b));
			}
			break;
		default:
			System.out.println("부호 또는 숫자를 잘못 입력하셨습니다");
		}
	}
}
