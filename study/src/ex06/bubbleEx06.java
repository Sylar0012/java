package ex06;

import java.util.Arrays;

public class bubbleEx06 {
	public static void main(String[] args) {
		int[] arr = {8, 5, 1,3,9,45,4,2,0 };
		int n = 1;
		int j = arr.length;

		for (int i = 0; i < j-1; i++) {
			for (int k = 0; k < j-1; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp;
					temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
				
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println(n + "번째 정렬 완료 ------");
			n++;

		}
	}
}