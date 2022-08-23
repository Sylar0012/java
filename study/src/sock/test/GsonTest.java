package sock.test;

import com.google.gson.Gson;

class User{
	private int id;
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class GsonTest {

	public static void main(String[] args) {
		Gson gson = new Gson();
		User user = new User(1, "ssar");
		String requestData = gson.toJson(user);
		System.out.println(requestData);
		
		User receiveData = gson.fromJson(requestData, User.class);
		System.out.println(receiveData.getName());
	}

}
