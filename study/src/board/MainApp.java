package board;

import java.sql.Connection;
import java.util.ArrayList;

import board.domain.board.Board;
import board.domain.board.BoardDao;
import board.domain.comments.Comments;
import board.domain.comments.CommentsDao;
import board.dto.BoardListDto;
import product.db.DBconnection;

public class MainApp {

	public static void main(String[] args) {

		Connection conn = DBconnection.connection();
		BoardDao boardListDao = new BoardDao(conn);
		CommentsDao  comments = new CommentsDao(conn);
		
		
//		ArrayList<BoardListDto> BoardListDto = boardListDao.BoardList();
//
//		for (int i = 0; i < BoardListDto.size(); i++) {
//			System.out.print(BoardListDto.get(i).getId() + " ");
//			System.out.print(BoardListDto.get(i).getTitle() + " ");
//			System.out.print(BoardListDto.get(i).getUsername() + " ");
//			System.out.print(BoardListDto.get(i).getCount() + "\n");
//
//		}
		
		ArrayList<Comments> comm = comments.findAll();
		
		for (int i = 0; i < comm.size(); i++) {
			System.out.print(comm.get(i).getId()+ " ");
			System.out.print(comm.get(i).getContent()+ " ");
			System.out.print(comm.get(i).getMemberId()+ " ");
			System.out.print(comm.get(i).getBoardId()+ "\n");
			
		}
		comments.deleteById(1);
		
	}

}
