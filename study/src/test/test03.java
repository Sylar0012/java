package test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double weight, height, b;
		double c = 49.2;

		System.out.print("키를 입력 하세요 : ");
		height = scan.nextDouble();

		System.out.print("몸무게를 입력 하세요 : ");
		weight = scan.nextDouble();
		c = c + (height - 145) * 0.6;
		b = (height - 100) * 0.9;
		if (b < c * 0.9) {
			System.out.println("저체중");
		} else if (b > c * 1.1) {
			System.out.println("과체중");
		} else {
			System.out.println("평균");
		}

	}

}
