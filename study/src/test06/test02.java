// 영단어를 받았을때 모음과 자음을 구분하는 프로그램을 만들어라

package test06;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// a i u e o
		Scanner scan = new Scanner(System.in);

		String word;

		System.out.print("알파벳를 입력시 자음 모음 구분해 드립니다 : ");

		word = scan.next();

		switch (word) {

		case "a":
			word.equals("a");
			System.out.println(word + "는 모음 입니다.");
			break;

		case "e":
			word.equals("e");
			System.out.println(word + "는 모음 입니다.");
			break;
		case "i":
			word.equals("i");
			System.out.println(word + "는 모음 입니다.");
			break;
		case "o":
			word.equals("o");
			System.out.println(word + "는 모음 입니다.");
			break;
		case "u":
			word.equals("u");
			System.out.println(word + "는 모음 입니다.");
			break;
		default:
			System.out.println(word + "는 자음 입니다.");
			break;
		}

	}

}
