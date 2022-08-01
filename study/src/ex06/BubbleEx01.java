package ex06;

public class BubbleEx01 {

	public static void main(String[] args) {

		/*
		 * int [] arr = {30, 10, 20}; // arr[0] = 30 arr[1] = 10 arr[2] =20
		 * 
		 * // 버블정렬 -> 30 10 20 > 10 30 20> [0, 1 비교] > 10 20 30 [1, 2 비교] > 이후 [0 1] [1
		 * 2] 비교하고 맞으면 출력
		 */
		int[] arr = { 40, 30, 10, 8, 5 };

		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];	
			arr[1] = arr[2];
			arr[2] = temp;

		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;

		}
		if (arr[3] > arr[4]) {
			int temp;
			temp = arr[3];
			arr[3] = arr[4];
			arr[4] = temp;

		}

		System.out.println("=== 1번째 사이클 종료 ===");
		System.out.println("\t" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + "\n");
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;

		}
		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;

		}

		System.out.println("=== 2번째 사이클 종료 ===");
		System.out.println("\t" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + "\n");
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;

		}

		System.out.println("=== 3번째 사이클 종료 ===");
		System.out.println("\t" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + "\n");
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		System.out.println("=== 4번째 사이클 종료 ===");
		System.out.println("\t" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + "\n");
		System.out.println("== 정렬이 완료 되었습니다 ==");
		System.out.println("\t" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
		// 노가다를 하는 이유 = 해당 코드의 작동방식을 이해해야 코드를 간결하게 짤 수 있다.
		// 노가다 하면서 해야함.
	}

}
