// 3개의 숫자를 받은 후 크기순으로 정렬하는 프로그램을 if-else로 만들어라

package test06;

import java.util.Arrays;

public class test01_ans {
	public static void main(String[] args) {

		int[] n = {30,20,10};
	
		// 사이클 2회
		for(int i = 0; i<2; i++) {
			if(n[0]>n[1]) {
				int temp;
				temp=n[0];
				n[0]=n[1];
				n[1]=temp;
				//스왑코드
				}
				if(n[1]>n[2]) {
					int temp;
					temp=n[1];
					n[1]=n[2];
					n[2]=temp;
				}			
		}
		for(int i = 0; i<3; i++)
			System.out.println(n[i]);
		
		
	}
}
