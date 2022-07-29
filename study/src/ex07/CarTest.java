package ex07;

class Car{
	String color;
	int speed;
	int gear;
	void println() {
		System.out.println("( " + color + ", " + speed + ", "+gear+ " )");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 60;
		myCar.gear = 3;
		myCar.println();
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 40;
		yourCar.gear = 2;
		yourCar.println();
	}
}
