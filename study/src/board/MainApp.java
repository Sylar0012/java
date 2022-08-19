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
		BoardDao boardDao = new BoardDao(conn);
		CommentsDao comments = new CommentsDao(conn);

		ArrayList<BoardListDto> BoardDto = boardDao.BoardList();
		for (int i = 0; i < BoardDto.size(); i++) {
			System.out.print(BoardDto.get(i).getId() + " ");
			System.out.print(BoardDto.get(i).getTitle() + " ");
			System.out.print(BoardDto.get(i).getUsername() + " ");
			System.out.print(BoardDto.get(i).getCount() + "\n");

		}

	}

}
