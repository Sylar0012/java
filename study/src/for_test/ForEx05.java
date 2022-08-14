package for_test;

public class ForEx05 {

	public static void main(String[] args) {
		for (int i = 9; i > 0; i -= 2) {
			for (int k = 9; k > i; k -= 2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
