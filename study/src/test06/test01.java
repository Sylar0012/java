// 3개의 숫자를 받은 후 크기순으로 정렬하는 프로그램을 if-else로 만들어라

package test06;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("정수를 입력하세요 :");
		num1 = scan.nextInt();
		System.out.print("정수를 입력하세요 :");
		num2 = scan.nextInt();
		System.out.print("정수를 입력하세요 :");
		num3 = scan.nextInt();

		if ((num2 < num1) && (num3 < num1)) {
			System.out.print(num1 + " ");
			if (num2 < num3) {
				System.out.print(num3 + " ");
				System.out.print(num2);
			} else {
				System.out.print(num2 + " ");
				System.out.print(num3);
			}
		} else if ((num3 < num2) && (num1 < num2)) {
			System.out.print(num2 + " ");
			if (num1 < num3) {
				System.out.print(num3 + " ");
				System.out.print(num1);
			} else {
				System.out.print(num1 + " ");
				System.out.print(num3);
			}
		} else if ((num1 < num3) && (num2 < num3)) {
			System.out.print(num2 + " ");
			if (num2 < num3) {
				System.out.print(num3 + " ");
				System.out.print(num2);
			} else {
				System.out.print(num2 + " ");
				System.out.print(num3);
			}
		}

	}
}
