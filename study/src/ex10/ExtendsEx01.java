package ex10;

class 지구인 {
	int armCount = 2;
	int legCount = 2;
}

class 아시아인 extends 지구인 {
	String hiarColor = "검정";

}

class 한국인 extends 아시아인 {
	
	String faceColor = "황토";

}

public class ExtendsEx01 {

	public static void main(String[] args) {

		한국인 h1 = new 한국인(); // 한국인 아시아인 지구인
		System.out.println(h1.faceColor);
		System.out.println(h1.hiarColor);
		System.out.println(h1.armCount);
		System.out.println(h1.legCount);
		
		
		한국인 h2 = h1; 
		// h1과 h2를 같은 공간을 바라보고 있음. ( 레퍼런스 타입 ( 주소값을 저장함 ) )
		// ex 한국인 주솟값이 300 = > h1= 300; h1 = h2; h2 = 300; 그래서 같은곳을 가르킴.
		
		int num = 10;
		int num2 = num;
		// 각자 10을 저장함 ( 각자 공간이 있어서 )
		// num = 10 공간이 있고 num2를 지정하면 num의 주소가 아닌 num의 값을 num2공간에 저장한다 
		
		아시아인 a1= h2;
		
		지구인 han1 = new 한국인();
		
		지구인 han2 = new 아시아인();
		
		//아시아인 han3 = new 지구인();
		
	
	}
	

}
