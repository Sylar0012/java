package ex07;

class Car{ // 설계도 ( 오브젝트 ), 클래스명은 주로 구체적인것들을 사용한다 ( car가 아닌 소나타 같은거 )
	String color;
	int speed;
	int gear;
	// 값을 안넣으면 다양한것을 찍어 낼 수 있다.
	void println() {
		System.out.println("( " + color + ", " + speed + ", "+gear+ " )");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // 인스턴스화가 되었다 ( 오브젝트 )
		myCar.color = "red"; // 상태
		myCar.speed = 60;  // 상태
		myCar.gear = 3;     // 상태
		myCar.println();
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 40;
		yourCar.gear = 2;
		yourCar.println();
		
		myCar.gear ++;
		yourCar.gear --;
		myCar.println();
		yourCar.println();
		
	}
}
