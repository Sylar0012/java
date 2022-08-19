package board.dto;

public class BoardTitleDto {
	private int id;
	private String title;
	private String username;
	private int count;
	
	public BoardTitleDto() {
		
	}
	
	public BoardTitleDto(int id, String title, String username, int count) {
		this.id = id;
		this.title = title;
		this.username = username;
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
