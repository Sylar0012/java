package ex08;

class Car2 {
	private String color; // 색상
	private int speed; // 속도
	private int gear; // 기어

//getter ( 접근자 )
	String getColor() {
		return color;
	}

//setter ( 설정자 )
	void setColor(String color) {
		this.color = color;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getGear() {
		return gear;
	}

	void setGear(int gear) {
		this.gear = gear;
	}

}

public class Cartest2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		// 설정은 setter
		
		System.out.println("현재 자동차의 색상은 "+ myCar.getColor());
		System.out.println("현재 자동차의 속도는 "+ myCar.getSpeed());
		System.out.println("현재 자동차의 기어는 "+ myCar.getGear());
		// 출력은 getter
	}
}
