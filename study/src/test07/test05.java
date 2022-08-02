package test07;

import java.util.Scanner;

class Reverse {

	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	void print() {
		int a = word.length() - 1;

		for (int i = a; i >= 0; i--)
			System.out.print(word.substring(i, (i + 1)));
	}

}

public class test05 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		Reverse reverse = new Reverse();
		
		System.out.print("영단어를 역순으로 배치 : ");
		reverse.setWord(scan.next());
		reverse.print();

		

	}
}
