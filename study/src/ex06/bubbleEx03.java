package ex06;

import java.util.Arrays;

public class bubbleEx03 {

	public static void main(String[] args) {

	int[] arr = { 40, 30, 10, 8, 5, 50 };
	int n=1;	
	int k=arr.length;
		for (int i = 0; i<k-1; i++) {
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

		System.out.println("=== "+n+"번째 사이클 종료 ===");

		n++;
		for (int i = 0; i<k-1; i++) {
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
		System.out.println("=== "+n+"번째 사이클 종료 ===");

		n++;
		for (int i = 0; i<k-1; i++) {
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
		System.out.println("=== "+n+"번째 사이클 종료 ===");
	
		n++;
		for (int i = 0; i<k-1; i++) {
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
		System.out.println("=== "+n+"번째 사이클 종료 ===");


		for (int i = 0; i<k-1; i++) {
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
		System.out.println("=== "+n+"번째 사이클 종료 ===");
	
		System.out.println("== 정렬이 완료 되었습니다 ==");
		System.out.println(Arrays.toString(arr));

		}
	}

