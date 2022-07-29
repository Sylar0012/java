package ex05;

//캐스팅 ( 매우 중요 )
public class CastEx01 {

	public static void main(String[] args) {
		
		int num = 10; // 4byte 10을 4byte공간을 확보한 num에 넣어라
		double d1 = num; // 묵시적 형 변환 (자연스러운 형변환 ) = up casting
		
		System.out.println(d1);
		
		double d2 = 20.5;
		// int num2 = d2; // 컴파일 오류 ( 툴이 잡아줌 ) 
		int num2 = (int)d2; // 명시적 형 변환 ( 자연스럽지 않음 ) = down casting
		System.out.println(num2); 

		float a = 10.5f;
		int b =a;
		
	}

}
