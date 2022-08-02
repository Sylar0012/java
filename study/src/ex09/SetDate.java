package ex09;

class Date {
	private int year;
	private String month;
	private int day;

	public Date() {
		month = "1월";
		day = 1;
		year = 2009;
	}
	public Date(int year, String month, int day) {
		serDate(year, month, day);
	}
	public Date(int year) {
		serDate(year, "1월",1);
	}
	
	public void serDate(int year, String month, int day) {
		this.month = month;
		this.day=day;
		this.year=year;
	}
}
	
public class SetDate {

	public static void main(String[] args) {
		Date date1=new Date(2009,"3월",2);
		Date date2=new Date(2010);
		Date date3=new Date();

	}
}
