package com.ssafy.running.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.BoardDao;
import com.ssafy.running.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {
	private BoardDao boardDao;

	@Autowired
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public void writeBoard(Board board) {
		boardDao.insertBoard(board);
	}

	@Override
	public List<Board> getBoardList(HashMap<String, String> params) {
		return boardDao.selectList(params);
	}

	@Override
	public Board getBoard(int id) {
		this.updateViewCnt(id); // 서비스 단에서만 부른다
		return boardDao.selectOne(id);
	}

	@Override
	public boolean modifyBoard(Board board) {
		Board originBoard = boardDao.selectOne(board.getId());
//		originBoard.setWriter(board.getWriter());
		originBoard.setTitle(board.getTitle());
		originBoard.setContent(board.getContent());

		return boardDao.updateBoard(originBoard) == 1;
	}

	@Override
	public boolean removeBoard(int id) {
		return boardDao.deleteBoard(id) == 1;
	}

	@Override
	public void updateViewCnt(int id) {
		Board board = boardDao.selectOne(id);
		board.setViewCnt(board.getViewCnt() + 1);
		boardDao.updateBoard(board);
	}

}
