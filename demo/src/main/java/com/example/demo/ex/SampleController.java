package com.example.demo.ex;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "/getText", produces = "application/json;charset=UTF-8") //"text/plain;charset=UTF-8"
	public String getText() {
		return "{\"greet\":\"안녕!!!!!\"}"; //"want to go home...";
	}
	
	@GetMapping("/check")
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		SampleVO vo = new SampleVO(0, ""+height, ""+weight); //mno, height, weight 
		ResponseEntity<SampleVO> result = null;
		if(height > 150) {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}else {
			result = new ResponseEntity<>(vo, HttpStatus.BAD_GATEWAY);
		}
		return result;
	}
}
