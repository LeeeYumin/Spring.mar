package com.yedam.app.콜렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵테스트 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>(); //해쉬함수를 통해서 위치계산
		map.put("100", "park");
		map.put("101", "kim");
		map.put("102", "choi");
		
		String name = (String)map.get("101"); //<String,String> 이었다가 뒤에 Object 로 수정하면서 앞에 String 으로 캐스팅해줌.
		 
		//반복문
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));		
		}
		
		//VO == Map
		List<HashMap<String,Object>> empList = new ArrayList<HashMap<String,Object>>();	
		map = new HashMap<>(); //해쉬함수를 통해서 위치계산
		map.put("firstName", "choi");
		map.put("lastName", "bbb");
		map.put("salary", 10000);
		empList.add(map);
		map = new HashMap<>();
		map.put("firstName", "park");
		map.put("lastName", "zzzzz");
		map.put("salary", 17000);
		empList.add(map);
		
		//firstName만 출력
		for( HashMap<String,Object> empMap : empList ) {
			System.out.println(empMap.get("firstName")); 
		}
		
		//filter : 급여가 15000 이상인 사람 보기
		for( HashMap<String,Object> empMap : empList )
			if((Integer)empMap.get("salary") > 15000) { //항변환 해주고
				System.out.println(empMap.get("salary")); //출력
			}
	
		//stream 으로 변형
		
		
		
		
	}
}
