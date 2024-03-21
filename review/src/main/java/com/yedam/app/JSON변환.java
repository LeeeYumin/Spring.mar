package com.yedam.app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON변환 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		// object를 json 으로 바꿈
		EmpVO vo = new EmpVO("길동","홍");
		
		//vo.setFirstName("길동");
		//vo.setFirstName("홍"); EmpVO에서 set get 메소드 만들고 주석처리함
		
		String str = objectMapper.writeValueAsString(vo);
		System.out.println(str);
		
		// json String 을 object로 바꿈
		String json = "{\"employeeId\":0,\"firstName\":\"홍\",\"lastName\":null,\"email\":null,\"hireDate\":null,\"salary\":null,\"jobId\":null,\"departmentId\":null,\"managerId\":null,\"phone\":null}\r\n"
				;
		
		vo=objectMapper.readValue(json, EmpVO.class);
		
		//url 을 object로 바꿈
		Map map = objectMapper.readValue(new URL("https://jsonplaceholder.typicode.com/todos/1"), Map.class); //배열이면 Map 말고 List로 받음
		
		//Map에서 title 값 출력해보자. 이 부분은 다시 보기.
		System.out.println(map.get("title")); //map.get("title") 콘솔 출력

	}

}
