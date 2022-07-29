package ex06;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		int year;
		int month;
		int a =0; // 월 계산할때 씀
		int day =0;
		int total_days =0;
		String b= ""; // 요일 맞출때 씀
		Scanner scan = new Scanner(System.in);

		System.out.print("년도를 입력하세요 : ");
		year = scan.nextInt();
		System.out.print("월을 입력하세요 : ");
		month = scan.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = scan.nextInt();
		
		scan.close();

		total_days += (year - 1900) * 365;
		total_days += (year - 1900) / 4; // 윤년 횟수
		
		if (((year - 1900 > 0) && (year-1900) % 4 == 0) && (month == 2 || month == 1)) {
			total_days -= 1;
		}
		if (month == 1) {
			a = 0;
		}else if (month == 2) {
			a = 31;
		}else if (month == 3) {
			a = 59;
		}else if (month % 2 == 0) {
			a = (month / 2 - 1) * 31 + month / 2 * 30; 
		}else if (month % 2 == 1) {
			a = (month / 2-1) * 30 + month / 2  * 31; 
		}
		
		total_days += (a + day);
		//System.out.println(total_days);
		
		if(total_days % 7 == 0) {
			b = "일요일";
		}else if (total_days % 7 == 1) {
			b = "월요일";
		}else if (total_days % 7 == 2) {
			b = "화요일";
		}else if (total_days % 7 == 3) {
			b = "수요일";
		}else if (total_days % 7 == 4) {
			b = "목요일";
		}else if (total_days % 7 == 5) {	
			b = "금요일";
		}else if (total_days % 7 == 6) {
			b="토요일";
		}
		
		System.out.println(year +"년 "+month+"월 "+day+"일은 "+b + "입니다.");

	}

}


