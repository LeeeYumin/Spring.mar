package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.board.ReplyVO;

public interface ReplyMapper {
	
	//댓글 등록 (외래키 등록 먼저)
	public int insert(ReplyVO vo);
	
	//read
	public ReplyVO read(Long bno);
	
	//삭제
	public int delete(Long bno);
	
	//수정
	public int update(ReplyVO reply);
	
	public List<ReplyVO> getListWithPaging(
			//@Param("cri") Criteria cri,
			@Param("bno") Long bno);
	

}
