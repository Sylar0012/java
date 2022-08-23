package sock.th;

interface Game2{
	void start();
}

class aaaaaaa implements Game2{

	@Override
	public void start() {
		System.out.println("게임시작");
	}
	
}

public class ThEx02 {
	
	public void run(Game2 game2) {	
		game2.start();
	}
	
	public static void main(String[] args) {
		
		ThEx02 th =  new ThEx02();
		th.run(new aaaaaaa());
		
	}
}
