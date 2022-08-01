package ex06;

public class ArrayEx01 {
	
	public static void main(String[] args) {
		int[] arr = new int[3]; // 12바이트가 heap에 뜸 ( 3개의 공간을 확보 ), 레퍼런스 자료 ( heap에 뜸 )
		// arr 에 저장되는 주소 = > *0( * = 포인터. 주소값을 의미 )
		// = new int [3] => 3개의 공간을 쓰겠다. ( 숫자 안적으면 에러남. 몇개 잡을지 몰라서 )
		// 배열은 항상 첫 시작번지를 엑세스함.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] 이라고 치면 공간이 없어서 읽을 수가 없다함. 런타임 인셉션은 잡기 힘듬 ( 실행되다가 갑자기 오류남. 런타임 오류 ) 
		// 잡으려면 모든 경우의 수를 모조리 다 잡아야하기 때문에 힘들다.

		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		// length 변수 호출
	}
}
