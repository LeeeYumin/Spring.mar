package com.example.demo.ex;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ex.service.SampleService;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class SampleServiceTest {
	
	@Autowired SampleService Service;
	
	@Test
	public void 트랜잭션() {
		String str = "테스트입니다";
		log.info("문자열길이 : " + str.getBytes().length);
		Service.addData(str);
	}

}
