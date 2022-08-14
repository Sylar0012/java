package for_test;

public class ForEx07 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i += 2) {
			for (int k = 9; k > i; k -= 2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 7; i > 0; i -= 2) {
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