package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GongEx01 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=lKFRdPMO1JDHD1qo7AMW%2B%2FHYtMGjC4lKjWscxhmu1xncg8fFMwfssAr9%2FwVIala6fYuuXCtdMNUdYAobI73qWA%3D%3D&pageNo=1&numOfRows=100&dataType=JSON&base_date=20220822&base_time=1500&nx=98&ny=75");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			
			StringBuilder sb = new StringBuilder();
			String temp = "";
			
			while ( (temp=br.readLine()) != null) {
				sb.append(temp);
			}
			
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
