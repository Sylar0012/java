package board.domain.comments;

public class Comments {
	private int id;
	private String content;
	private int memberId;
	private int boardId;
	
	public  Comments() {
		
	}
	
	public Comments(int id, String content, int memberId, int boardId) {
		super();
		this.id = id;
		this.content = content;
		this.memberId = memberId;
		this.boardId = boardId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	
	
	
}
