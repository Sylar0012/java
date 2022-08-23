package sock.th;

class FakeThread{
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("페이크 쓰레드 : " + i );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
class RealThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("리얼 쓰레드 : " + i );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
public class ThEx03 {

	public static void main(String[] args) {
		FakeThread ft = new FakeThread();
		ft.run();
		
		Thread t1 = new Thread(new RealThread());
		t1.start();
		
		for (int i = 1; i < 11; i++) {
			System.out.println("메인 쓰레드 : " + i );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
