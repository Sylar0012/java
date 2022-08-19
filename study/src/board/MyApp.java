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
		
		for(int j= 1; j<4; j++) {
			ArrayList<BoardTitleDto> boardTitleDto = boardsDao.BoardsList(j);
		
		for(int i =2;i <boardTitleDto.size(); i++) {
			System.out.print(boardTitleDto.get(i).getId()+"\t");
			System.out.print(boardTitleDto.get(i).getTitle()+"\t");
			System.out.print(boardTitleDto.get(i).getUsername()+"\t");
			System.out.println(boardTitleDto.get(i).getCount());
		}
		}
		
		
		
		
	}

}
