package com.example.demo.board;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sam.app.board.mapper.ReplyMapper;

import lombok.Data;

@Data
public class ReplyMapperTests {
	
	@Autowired
	private ReplyMapper mapper;
	
	@Test
	public void testMapper() {		
		System.out.println(mapper);
	}

}
