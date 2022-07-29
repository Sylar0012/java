// 2 ~ 100 사이 있는 소수를 찾는 프로그램

package test;

public class test06 {
	
	public static void main(String[] args) {
	
		System.out.print("2~100 사이 정수는  ' 2 ' ' 3 ' ' 5 ' ' 7 ' ");
		for(int i = 2; i<101; i++) {
			if((i % 2 !=0 && i % 3 !=0)&&(i % 5 != 0 && i % 7 !=0) ) {
				System.out.print(" ' "+i+" ' ");
			}
		}
		System.out.print(" 입니다.");
	}

}
