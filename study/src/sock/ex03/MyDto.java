package sock.ex03;

public class MyDto {
	private int code;        // 코드가 1이면 통신성공, -1이면 실패
	private String msg;    // 통신이 어떻게 됬는지 설명
	private String date;    // 실제 데이터를 담는공간
	
	public MyDto() {
		// TODO Auto-generated constructor stub
	}

	public MyDto(int code, String msg, String date) {
		this.code = code;
		this.msg = msg;
		this.date = date;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
