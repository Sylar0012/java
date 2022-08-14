package for_test;

public class ForEx03 {

	public static void main(String[] args) {
		for (int i = 6; i > 1; i--) {
			for (int j = 2; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 7; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
