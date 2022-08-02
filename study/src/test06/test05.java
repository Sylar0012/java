//p133 5번문제

package test06;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x;
		System.out.print("숫자 입력 : ");
		x = scan.nextDouble();
				
		if (x <= 0) {
			x = (x*x*x)-(9*x)+2;
			
		}else {
			x = (7*x)+2;
		}
		
		System.out.println(x);
	}
}
