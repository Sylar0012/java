package test07;

import java.util.Scanner;

class Login {
	private String id;
	private String pass;
	private String UesrId;
	private String UesrPass;
	private int checkSome;
	

	public String getUesrId() {
		return UesrId;
	}

	public void setUesrId(String uesrId) {
		UesrId = uesrId;
	}

	public String getUesrPass() {
		return UesrPass;
	}

	public void setUesrPass(String uesrPass) {
		UesrPass = uesrPass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public int getCheckSome() {
		return checkSome;
	}
	
	public void setCheckSome(int checkSome) {
		this.checkSome = checkSome;
	}
	
	public void 아이디확인(){
		if(id.equals(UesrId))
			checkSome++;	
	}
	
	public void 비밀번호확인(){
		if(pass.equals(UesrPass))
			checkSome++;	
	}
	
	public void 로그인() {
		if(checkSome == 2) {
			System.out.println("환영합니다"+UesrId+"님!");
		}else {
			System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
		}
	}
	
	
}

public class test07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		
		login.setId("abcd");
		login.setPass("abcd");
		
		System.out.print("아이디를 입력 해 주세요 : ");
		login.setUesrId(scan.next());
		System.out.print("비밀번호를 입력 해 주세요 : ");
		login.setUesrPass(scan.next());
		login.아이디확인();
		login.비밀번호확인();
		login.로그인();
		
	}
}
