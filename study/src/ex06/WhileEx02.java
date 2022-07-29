package ex06;

public class WhileEx02 {

	public static void main(String[] args) {
		// 무한 루프를 돌면서 1,2,3,4,5,6 ~~~ 번호를 출력하는 프로그램을 만들어라.
		// 단, 숫자가 10 이출력되면 멈춰라.
		int i = 1;
		
		while(true) {
			System.out.println(i);
			
			
			if (i == 10)
				break; 
			i++;
		}
		
	}

	}
