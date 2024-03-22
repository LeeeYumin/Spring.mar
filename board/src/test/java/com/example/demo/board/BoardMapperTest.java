package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sam.app.board.mapper.BoardMapper;

@SpringBootTest
public class BoardMapperTest {
	
	//1일차 과제 테스트
	
	@Autowired BoardMapper mapper;
	
	//게시글 검색, 페이징
	//@Test
	public void boardList() {

	}

	//단건조회
	//@Test
	public void boardInfo() {
		
	}
	
	//등록
	//@Test
	public void 등insertBoard() {
		
	}
	
	//삭제
	//@Test
	public void deleteBoard() {
		int boardNo = 2;
		int result = mapper.deleteBoard(boardNo);
		System.out.println("삭제 : "  + result);
		
	}
	
	//수정
	//@Test
	public void updateBoard() {
			
	}

	
		

}
