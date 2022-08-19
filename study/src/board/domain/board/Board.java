package board.domain.board;

public class Board {
	private int id;
	private String title;
	private String content;
	private int memberId;
	
	public  Board() {
		
	}
	
	public Board(int id, String title, String content, int memberId) {
	
		this.id = id;
		this.title = title;
		this.content = content;
		this.memberId = memberId;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	
	
}
