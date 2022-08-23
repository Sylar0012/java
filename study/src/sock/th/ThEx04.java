package sock.th;

class real implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 21; i++) {
			System.out.println("리얼 쓰레드 : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
public class ThEx04 {
	
	public static void main(String[] args) {
		
	
	Thread t1 = new Thread(new real());
	t1.start();
	
	
	for (int i = 1; i < 21; i++) {
		System.out.println("메인 쓰레드 : "+i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	}

}
