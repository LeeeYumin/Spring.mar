package com.example.demo.board.mapper;

import java.util.List;

import com.example.demo.board.BoardVO;

public interface BoardMapper {
	//1일차 과제
	
	List<BoardVO> getBoardList(BoardVO bvo); //어떻게 넘길지 모르니 sql문 먼저 선행.
	//앞의 BoardVO 는 resultType 이고 뒤의 BoardVO는 파라미터인데 이건 생략 가능...	
	
	//검색 (제목, 내용, 작성자 검색 동적쿼리로 구현) , 페이징??
		
	//단건조회
	BoardVO getBoardInfo(int boardNo);
	
	//등록
	int insertBoard(BoardVO bvo);
	
	//삭제
	int deleteBoard(int boardNO);
	
	//수정 (단건선행?)
	int updateBoard(BoardVO bvo);

}
