package ex10;

class 유닛 {
	public int hp;
	public int power;

	public void attack(int power, int hp) {
		hp = hp - power;
		System.out.println("남은 hp : " + hp);
	}
}

class Zealot extends 유닛 {

	int hp = 100;
	int power = 5;

	public void attack() {
		return;
	}

}

class Dragoon extends 유닛 {
	int hp = 100;
	int power = 10;

	public void attack() {
		return;
	}
}

class River extends 유닛 {
	int hp = 100;
	int power = 50;

	public void attack() {
		return;
	}
}

public class OverEx03 {

	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Dragoon d1 = new Dragoon();
		River l1 = new River();

		z1.attack(z1.power, d1.hp);
		z1.attack(z1.power, l1.hp);
		d1.attack(d1.power, z1.hp);
		d1.attack(d1.power, l1.hp);
		l1.attack(l1.power, z1.hp);
		l1.attack(l1.power, d1.hp);
	}
}
