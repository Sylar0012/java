package ex09;

class 유닛{
	String getName( ) {return "";}
	int getPower() {return 0;}
	int getHp() {return 0;}
	void setHp(int hp) {}
}

class Zealot extends 유닛{
	String name = "질럿";
	int power = 5;
	int hp = 100;
	String getName( ) {return name;}
	int getPower() {return power;}
	int getHp() {return hp;}
	void setHp(int hp) {
		this.hp = hp;
	}	
}

class Dragoon extends 유닛{
	String name = "드라군";
	int power = 10;
	int hp = 100;
	String getName( ) {return name;}
	int getPower() {return power;}
	int getHp() {return hp;}
	void setHp(int hp) {
		this.hp = hp;
	}	
}



class River extends 유닛{
	String name = "리버";
	int power = 50;
	int hp = 100;
	String getName( ) {return name;}
	int getPower() {return power;}
	int getHp() {return hp;}
	void setHp(int hp) {
		this.hp = hp;
	}	
	
	
}

class DarkTempler extends 유닛{
	String name = "다크템플러";
	int power = 30;
	int hp = 100;
	String getName( ) {return name;}
	int getPower() {return power;}
	int getHp() {return hp;}
	void setHp(int hp) {
		this.hp = hp;
	}	
	
	
}
	
public class OverEx03 {
	
	static void attack(유닛 u1, 유닛 u2) {
		String n = u1.getName();
		u1.setHp(u1.getHp()-u2.getPower());
		System.out.println(u1.getName()+"의 남은 체력 : "+u1.getHp());
	}
	
	
	public static void main(String[] args) {
		유닛 z1 = new Zealot();
		유닛 d1 = new Dragoon();
		유닛 l1 = new River();
		유닛 d3 = new DarkTempler();
		
		attack(z1,d1);
		attack(z1,l1);
		attack(d1,z1);
		attack(d1,l1);
		attack(l1,z1);
		attack(l1,d1);
		attack(d3,d1);
		attack(d1,d3);
		
		

		
	}
}
