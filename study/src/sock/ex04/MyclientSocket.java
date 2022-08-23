package sock.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyclientSocket {

	Socket socket;
	BufferedWriter bw;
	BufferedReader br, keyboard;

	class ReadThread implements Runnable {

		@Override
		public void run() {

			while (true) {
				try {
					String msg = br.readLine();
					System.out.println("받은 메세지 :" + msg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void init() {
		try {
			socket = new Socket("localhost", 10000);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 읽기 쓰레드는 읽기만 한다.
			keyboard = new BufferedReader(new InputStreamReader(System.in));

			Thread t1 = new Thread(new ReadThread());
			t1.start();

			// 메인쓰레드 쓰기만 함.
			while (true) {
				String keyboardMsg = keyboard.readLine();
				bw.write(keyboardMsg + "\n");
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyclientSocket mc = new MyclientSocket();
		mc.init();

	}
}
