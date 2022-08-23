package sock.th;

interface Game{
	void start();
}

class MyGame implements Game {

	@Override
	public void start() {
		System.out.println("게임시작");
		
	}
	
}

public class ThEx01 {
	
	public void run(Game game) {	
		game.start();
	}
	
	public static void main(String[] args) {
		ThEx01 th =  new ThEx01();
		th.run(new MyGame());
		
		
	}
}
