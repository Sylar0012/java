package ex09;

class Zealot{
	int power = 5;
	int hp = 100;
}

class Dragoon{
	int power = 10;
	int hp = 100;
}

class River{
	int power = 50;
	int hp = 100;
}

public class OverEx03 {
	// 질럿이 드라군을 공격
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp -= u1.power;
		System.out.println("드라군의 hp는 : "+u2.hp);
	}
	// 드라군이 질럿을 공격
	static void attack(Dragoon u2,Zealot u1) {
		u1.hp -= u2.power;
		System.out.println("질럿의 hp는 : "+u1.hp);
	}
	// 질럿이 리버를 공격
	static void attack(Zealot u1, River u3) {
		u3.hp -= u1.power;
		System.out.println("리버의 hp는 : "+u3.hp);
	}
	// 리버가 질럿을 공격
	static void attack(River u3,Zealot u1) {
		u1.hp -= u3.power;
		System.out.println("질럿의 hp는 : "+u1.hp);
	}
	// 드라군이 리버를 공격
	static void attack(Dragoon u2,River u3) {
		u3.hp -= u2.power;
		System.out.println("리버의 hp는 : "+u3.hp);
	}
	// 드라군이 질럿을 공격
	static void attack(River u3, Dragoon u2) {
		u2.hp -= u3.power;
		System.out.println("드라군의 hp는 : "+u2.hp);
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Dragoon d1 = new Dragoon();
		River l1 = new River();
		
		attack(z1,d1);
		attack(d1,z1);
		attack(z1,l1);
		attack(l1,z1);
		attack(l1,d1);
		attack(d1,l1);
	}
}
