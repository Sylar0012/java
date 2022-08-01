package ex06;

import java.util.Arrays;

public class bubbleEx02 {

	public static void main(String[] args) {

		int[] arr = { 40, 30, 10, 8, 50,5 };

		
		//사이클 단순화
		for (int i = 0; i<5; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
		System.out.println("=== 1번째 사이클 종료 ===");
		
		
		for (int i = 0; i<4; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=== 2번째 사이클 종료 ===");


		for (int i = 0; i<3; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=== 3번째 사이클 종료 ===");

		
		for (int i = 0; i<2; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=== 4번째 사이클 종료 ===");

		
		for (int i = 0; i<1; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=== 5번째 사이클 종료 ===");
	
		System.out.println("== 정렬이 완료 되었습니다 ==");
		System.out.println(Arrays.toString(arr));

	}

}
