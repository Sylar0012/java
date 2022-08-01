// 각변의 길이가 100보다 작은 삼각형 중에서 a^2 + b^2 = c^2 를 만족하는 삼각형이 몇개 있는지 구해라

package test;

public class test07 {

	public static void main(String[] args) {
		int j = 0;
		int k = 0;
		for (int a = 1; a <=100; a++) {
			for (int b = 1; b <= 100; b++) {
				for (int c = 1; c <= 100; c++) {
					k = a * a + b * b;
					if (k == c && a<=b) {

						j++;
					}
					
				}
			}
		}
		System.out.println(j);
		
		
	}
}
