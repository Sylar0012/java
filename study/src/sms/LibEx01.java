package sms;

import java.util.Random;

public class LibEx01 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(5)+1; // 난수의 범위는 1 ~ 5까지
		System.out.println(n);
	}
}
