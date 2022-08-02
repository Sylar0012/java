package ex08;

class Car3 {
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

	@Override
	public String toString() {
		return "Car3 [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}

}

public class Cartest3 {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		// 설정은 setter
		
		System.out.println(myCar.toString());
	}
}
