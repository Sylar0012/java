package test07;

import java.util.Scanner;

class Scerch {

	private String word;
	private int consonant;
	private int vowel;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getConsonant() {
		return consonant;
	}

	public void setConsonant(int consonant) {
		this.consonant = consonant;
	}

	public int getVowel() {
		return vowel;
	}

	public void setVowel(int vowel) {
		this.vowel = vowel;
	}

	void count() {
		int text = word.length() - 1;
		consonant = 0;
		vowel = word.length();
		
		String[] keyword = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
		for (int i = 0; i < 10; i++) {
			for (int j = text; j >= 0; j--)
				if (keyword[i].equals(word.substring(j, (j + 1))))
					consonant++;
		}
		vowel -= consonant;
	}
	void print() {
		System.out.println(getWord() + "안의 모음의 갯수는 '" + consonant + "'개 이며 자음의 갯수는 '" + vowel + "'개 입니다.");
	}

}

public class test06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scerch scerch = new Scerch();

		System.out.print("영단어중 자음 모음 갯수파악 : ");
		scerch.setWord(scan.next());
		scerch.count();
		scerch.print();

	}
}
