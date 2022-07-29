//값 3개를 비교하여 가장 작은것을 출력되게 만들어라

package test;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("정수를 입력하세요 :");
		num1 = scan.nextInt();
		System.out.print("정수를 입력하세요 :");
		num2 = scan.nextInt();
		System.out.print("정수를 입력하세요 :");
		num3 = scan.nextInt();

		if (num2 < num1 && num3 < num1) {
			if (num2 < num3) {
				System.out.println("가장 작은수는 '" + num2 + "' 입니다. ");
			} else {
				System.out.println("가장 작은수는 '" + num3 + "' 입니다. ");
			}
		} else if (num1 < num2 && num3 < num2) {
			if (num1 < num3) {
				System.out.println("가장 작은수는 '" + num1 + "' 입니다. ");
			} else {
				System.out.println("가장 작은수는 '" + num3 + "' 입니다. ");
			}
		} else if (num1 < num3 && num2 < num3) {
			if (num1 < num2) {
				System.out.println("가장 작은수는 '" + num1 + "' 입니다. ");
			} else {
				System.out.println("가장 작은수는 '" + num2 + "' 입니다. ");
			}
		}

	}

}
