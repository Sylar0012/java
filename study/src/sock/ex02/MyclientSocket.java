package sock.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyclientSocket {

	Socket socket;

	public void init() {
		try {
			socket = new Socket("localhost", 10000);

			BufferedWriter bw = 
					new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));

			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String KeyboardMsg = br.readLine();
				bw.write(KeyboardMsg+"\n");
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyclientSocket ms = new MyclientSocket();
		ms.init();

	}
}
