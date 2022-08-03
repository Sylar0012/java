package ex10;

abstract class 유닛 {
	public void hp() {
		return;
	}

	public void power() {
		return;
	}

	public void attack() {
		return;
	}

	public void elseHp() {
		return;
	}
}

class Zealot extends 유닛 {
	public void hp() {
		int hp = 100;
		System.out.println(hp);
	}

	public void power() {
		int power = 5;
	}
	
}

class Dragoon extends 유닛 {
	public void hp() {
		int hp = 100;
	}

	public void power() {
		int power = 10;
	}
}

class River extends 유닛 {
	public void hp() {
		int hp = 100;
	}

	public void power() {
		int power = 50;
	}
}
	

public class OverEx03 {

	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Dragoon d1 = new Dragoon();
		River l1 = new River();

		z1.hp();
	}
}
