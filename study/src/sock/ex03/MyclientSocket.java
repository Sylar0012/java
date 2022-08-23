package sock.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.google.gson.Gson;

public class MyclientSocket {

	Socket socket;

	public void init() {
		try {
			socket = new Socket("localhost", 20000);

			BufferedWriter bw = 
					new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));

			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String KeyboardMsg = br.readLine();
				MyDto dto = new MyDto(1, "통신성공", KeyboardMsg);
				
				Gson gson = new Gson();
				String sendDate = gson.toJson(dto);
				
				MyDto receiveData = gson.fromJson(sendDate, MyDto.class);
				
	
				bw.write(receiveData.getDate()+"\n");
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
