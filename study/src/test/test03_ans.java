package test;

public class test03_ans {
	
	static double 표준체중계산(int height) {
		double standardWeight = (height - 100) *0.9;

		return standardWeight; 
		// static void 에 return이 안들어가는 이유는 void는 리턴을 못함. 
	}
	static void 체중비교및출력(double standardWeight, double weight) {
		if(weight > standardWeight) {
			System.out.println("과체중");
		}else if(weight < standardWeight) {
			System.out.println("저체중");
		}else {
			System.out.println("표준체중");
		}
			
	}


	public static void main(String[] args) {
		int height=150;
		double weight=70;
		 
	double standardWeight = 표준체중계산(height) ;
		
		
		체중비교및출력(standardWeight,weight);
		


	}

}
