package test07;

class Date {
	int year;
	int month1;
	int day;
	String month2;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth1() {
		return month1;
	}

	public void setMonth1(int month1) {
		this.month1 = month1;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth2() {
		return month2;
	}

	public void setMonth2(String month2) {
		this.month2 = month2;
	}
	
	public void print1() {
		System.out.printf("%d.%d.%d\n",getYear(),getMonth1(),getDay());
	}
	public void print2() {
		System.out.printf("%s %d, %d\n",getMonth2(),getDay(),getYear());
	}
}

public class test02 {

	public static void main(String[] args) {
		
		Date Date = new Date();
		
		Date.setDay(12);
		Date.setMonth1(7);
		Date.setMonth2("July");
		Date.setYear(2012);
		
		Date.print1();
		Date.print2();
		
	}
}
