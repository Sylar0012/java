package sock.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//쓰는거
public class MyServerSoket {

	ServerSocket serverSocket;
	BufferedReader br, keyboard;
	BufferedWriter bw;

	class ReadThread implements Runnable {

		@Override
		public void run() {
			try {
			while (true) {
				
					String msg = br.readLine();
					System.out.println("받은 메세지 :" + msg);

					if (msg.equals("사이코::bye")) {
						break;
					}
			
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public void init() {
		System.out.println("서버 시작 ---------------");
		try {
			serverSocket = new ServerSocket(10000);

			Socket socket = serverSocket.accept();

			System.out.println("클라이언트 연결 됨");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			keyboard = new BufferedReader(new InputStreamReader(System.in));
			// 메인 스레드는 메세지 읽기만 함.
			Thread t1 = new Thread(new ReadThread());
			t1.start();

			// 메인 스레드는 메세지를 전송만 함
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
		MyServerSoket ms = new MyServerSoket();
		ms.init();
	}

}
