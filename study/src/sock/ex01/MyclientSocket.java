package sock.ex01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class MyclientSocket {
	
	Socket socket;
	
	public void init() {
		try {
			socket = new Socket("localhost", 10000);
			
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
					);
			
			bw.write("안녕하세요\n");
			bw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyclientSocket ms = new MyclientSocket();
		ms.init();
		
	}
}
