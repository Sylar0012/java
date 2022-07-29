package test;

import java.util.Scanner;

public class text10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = 0, b = 1, c;
		int i;
		System.out.print("피보나치 수열을 몇번째 항까지 출력해드릴까여?");
		i = scan.nextInt();
		
		System.out.print(a+ " "+b+" ");
		
		for(int j = 0; j <= i; j++ ) {
			
			c = a + b;
			a = b;
			b = c;
			System.out.print(c+ " ");
		}

	}

}
