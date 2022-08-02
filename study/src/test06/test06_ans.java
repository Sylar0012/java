
package test06;

public class test06_ans {

	public static void main(String[] args) {

		// 2와 100 사이에 있는 모든 소수를 찾는 프로그램 만들기

		// int k = 7;

		// 2~6
		// k%2==0 소수가 아님
		// k%3==0 소수가 아님
		// k%4==0 소수가 아님
		// k%5==0 소수가 아님
		// k%6==0 소수가 아님
		
		// k=2, j는 0번
		// k=3, j는 1번
		// k=4, j는 2번
		// k=5, j는 3번
		System.out.println("2~100까지의 숫자중 소수는 ");
		for (int k = 2; k <= 100; k++) {
			int checkSum=0;
			for (int j=2; j<k; j++) { 
				if(k % j == 0) { // 소수가 아니다
					checkSum ++;
									
				}
			}
			if(checkSum == 0)
				System.out.print(k+" ");
		}
		System.out.println("\n입니다.");
		// 1사이클 k = 2
		
		// 2사이클 k = 3 
		// k % 2 == 0 true는 소수가 아님, false는 소수 ( false )
 
		// 3사이클 k = 4
		// k % 2 == 0 true
		// k % 3 == 0 false
		
		// 4사이클 k=5
		// k % 2 == 0 false
		// k % 3 == 0 false
		// K % 4 == 0 false
	}

}
