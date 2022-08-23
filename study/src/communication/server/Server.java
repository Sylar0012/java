package communication.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class Server {
	ServerSocket serverSocket;
	
	public void init() {
		System.out.println("서버 시작 --");
		
		try {
			URL url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=lKFRdPMO1JDHD1qo7AMW%2B%2FHYtMGjC4lKjWscxhmu1xncg8fFMwfssAr9%2FwVIala6fYuuXCtdMNUdYAobI73qWA%3D%3D&pageNo=1&numOfRows=100&dataType=JSON&base_date=20220822&base_time=1500&nx=98&ny=75");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
			serverSocket = new ServerSocket(50000);
			
			Socket socket = serverSocket.accept();

			System.out.println("클라이언트 연결 됨");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			
			while (true) {
				String msg = br.readLine();
				System.out.println("받은 메세지 : " + msg);
				
				if(msg.equals("사이코::bye")) {
					break;
				}
			}
			System.out.println("통신종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server s = new Server();
		s.init();
	}
}
