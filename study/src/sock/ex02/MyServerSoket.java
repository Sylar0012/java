package sock.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSoket {

	ServerSocket serverSocket;

	public void init() {
		System.out.println("서버 시작 ---------------");
		try {
			serverSocket = new ServerSocket(10000);

			Socket socket = serverSocket.accept();

			System.out.println("클라이언트 연결 됨");

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		
			while (true) {
				String msg = br.readLine();
				System.out.println("받은 메세지 : " + msg);
				
				if(msg.equals("사이코::bye")) {
					break;
				}
			}
			System.out.println("통신종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyServerSoket ms = new MyServerSoket();
		ms.init();
	}
}
