package board;

import java.sql.Connection;
import java.util.ArrayList;

import board.domain.boards.BoardsDao;
import board.domain.comments.CommentsDao;
import board.domain.members.MembersDao;
import board.dto.BoardTitleDto;
import product.db.DBconnection;

public class MyApp {
	
	public static void main(String[] args) {
		Connection conn = DBconnection.connection();
		
		BoardsDao boardsDao = new BoardsDao(conn);
		CommentsDao commentsDao = new CommentsDao(conn);
		MembersDao membersDao = new MembersDao(conn);
		
		int BoardTitleDto = 2;
			ArrayList<BoardTitleDto> boardTitleDto = boardsDao.BoardsList(2);
		
		for(int i =2;i <boardTitleDto.size(); i++) {
			System.out.print(boardTitleDto.get(0).getId()+"\t");
			System.out.print(boardTitleDto.get(0).getTitle()+"\t");
			System.out.print(boardTitleDto.get(0).getUsername()+"\t");
			System.out.println(boardTitleDto.get(0).getCount());
		}
		
		
		
		
		
	}

}
