package board.domain.comments;

public class Comments {
	private int id;
	private String content;
	private int boardsId;
	private int membersId;
	
	
	public Comments() {
		
	}
	
	public Comments(int id, String content, int boardsId, int membersId) {
	
		this.id = id;
		this.content = content;
		this.boardsId = boardsId;
		this.membersId = membersId;
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
	public int getBoardsId() {
		return boardsId;
	}
	public void setBoardsId(int boardsId) {
		this.boardsId = boardsId;
	}
	public int getMembersId() {
		return membersId;
	}
	public void setMembersId(int membersId) {
		this.membersId = membersId;
	}
	
	

}
