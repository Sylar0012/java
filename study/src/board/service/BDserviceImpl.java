package board.service;

import java.sql.Connection;
import java.util.ArrayList;
import board.domain.board.BoardDao;
import board.dto.BoardListDto;

public class BDserviceImpl implements BDservice{
	private BoardDao boardDao;
	private Connection connection;
	
	public BDserviceImpl(BoardDao boardDao, Connection connection) {
		super();
		this.boardDao = boardDao;
		this.connection =  connection;
	}

	@Override
	public ArrayList<BoardListDto> 게시글목록보기() {
		return boardDao.BoardList();
	}

}
