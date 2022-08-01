package ex07;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int uesr1, uesr2, uesr3;
		int com1, com2, com3;
		int stcut;
		int ballcut;

		com1 = random.nextInt(9) + 1;
		com2 = random.nextInt(9) + 1;
		com3 = random.nextInt(9) + 1;
		if (com1 != com2 && com1 != com3 && com2 != com3) {
			System.out.println(com1+ " "+com2 + " "+com3);
		}

		while (true) {

			System.out.println("3개의 숫자를 띄어쓰기로 구분 하여 써 주세요");
			System.out.print(">");
			uesr1 = scan.nextInt();
			uesr2 = scan.nextInt();
			uesr3 = scan.nextInt();

			if (com1 == uesr1 && com2 == uesr2 && com3 == uesr3) {
				System.out.println("3 스트라이크 정답입니다.");
				System.out.println("게임 종료");
				break;
			}

			// 1스트라이크 2볼
			if (com1 == uesr1 && com2 == uesr3 && com3 == uesr2)
				System.out.println("1스트라이트 2볼 입니다.");
			else if (com1 == uesr3 && com2 == uesr2 && com3 == uesr1)
				System.out.println("1스트라이트 2볼 입니다.");
			else if (com1 == uesr2 && com2 == uesr1 && com3 == uesr3)
				System.out.println("1스트라이트 2볼 입니다.");

			// 2스트라이크 1볼
			if (com1 == uesr1 && com2 == uesr2 && com3 == uesr1)
				System.out.println("2스트라이트 1볼 입니다.");
			else if (com1 == uesr1 && com2 == uesr2 && com3 == uesr2)
				System.out.println("2스트라이트 1볼 입니다.");
			else if (com1 == uesr1 && com2 == uesr1 && com3 == uesr3)
				System.out.println("2스트라이트 1볼 입니다.");
			else if (com1 == uesr1 && com2 == uesr3 && com3 == uesr3)
				System.out.println("2스트라이트 1볼 입니다.");
			else if (com1 == uesr2 && com2 == uesr2 && com3 == uesr3)
				System.out.println("2스트라이트 1볼 입니다.");
			else if (com1 == uesr3 && com2 == uesr2 && com3 == uesr3)
				System.out.println("2스트라이트 1볼 입니다.");

			// 3볼
			if (com1 == uesr2 && com2 == uesr3 && com3 == uesr1)
				System.out.println("3볼 입니다.");
			else if (com1 == uesr3 && com2 == uesr1 && com3 == uesr2)
				System.out.println("3볼 입니다.");
			//2볼
			if (com1==uesr1 && com2==uesr2)
				if(com3==uesr1)
					System.out.println("2볼 입니다");
				else if (com3==uesr2)
					System.out.println("2볼 입니다");
			if (com2==uesr2 && com3==uesr3)
				if(com1==uesr2)
					System.out.println("2볼 입니다");
				else if (com1==uesr3)
					System.out.println("2볼 입니다");
			if (com1==uesr1 && com3==uesr3)
				if(com2==uesr1)
					System.out.println("2볼 입니다");
				else if (com2==uesr3)
					System.out.println("2볼 입니다");
			//1볼
			if(com1==uesr1)
				if(com2==uesr3 && com3 == uesr2)
					System.out.println("1볼 입니다");
			if(com2==uesr2)
				if(com1==uesr3 && com3 == uesr1)
					System.out.println("1볼 입니다");
			if(com3==uesr3)
				if(com1==uesr2 && com2 == uesr1)
					System.out.println("1볼 입니다");

			// 아웃
			if (!(com1 == uesr1 || com2 == uesr2 || com3 == uesr3))
				if(!(com1 == uesr2 || com2 == uesr3 || com3 == uesr1))
					if(!(com1 == uesr3 || com2 == uesr1 || com3 == uesr2))
						System.out.println("3아웃입니다");

			// 1스트라이크 2아웃
			if (com1 == uesr1 && com2 != uesr2 && com3 != uesr3)
				System.out.println("1스트라이크 2아웃 입니다.");
			else if (com1 != uesr1 && com2 == uesr2 && com3 != uesr3)
				System.out.println("1스트라이크 2아웃 입니다.");
			else if (com1 != uesr1 && com2 != uesr2 && com3 == uesr3)
				System.out.println("1스트라이크 2아웃 입니다.");

			// 2스트라이크 1아웃
			if (com1 == uesr1 && com2 == uesr2 && com3 != uesr3)
				System.out.println("2스트라이크 1아웃 입니다.");
			else if (com1 != uesr1 && com2 == uesr2 && com3 == uesr3)
				System.out.println("2스트라이크 1아웃 입니다.");

		}
	}
}
