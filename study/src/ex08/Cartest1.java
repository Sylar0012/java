package ex08;

class Car {
	private String color; // 색상
	private int speed; // 속도
	private int gear; // 기어
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	// 알트 + 쉬프트 + s 이후에 r 하면 단축키 
	
	
	void print() {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed);
		System.out.println("gear : "+gear);
	}
}

public class Cartest1 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		myCar.print();
		// 설정은 setter
		System.out.println();
		/*
		 * System.out.println("현재 자동차의 색상은 "+ myCar.getColor());
		 * System.out.println("현재 자동차의 속도는 "+ myCar.getSpeed());
		 * System.out.println("현재 자동차의 기어는 "+ myCar.getGear());
		 */
		// 출력은 getter
	}
}
