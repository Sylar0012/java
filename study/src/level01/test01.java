
// 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
// 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.



package level01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int user;
		int a=0;
		System.out.print("숫자를 입력 하세요 : ");
		user = scan.nextInt();
		
		for(int i =1; i<=500; i++) {
			 if (user == 1){
					break;	
			 }else if(user%2 == 0) {
				user = user/2;
			}else if(user%2 == 1){
				user = user*3 +1;
			}else	if(i == 500) {
				System.out.println("-1");
			}
			a=i;
		}				
		System.out.println(a+"회 만에 완료");	
	}

}
