package com.yedam.app.콜렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.yedam.app.EmpVO;

/*
 * List, Set, Map
 * list :              index 로 접근.--> 순차적 목록
 * set : 중복값 허용 안함. index 로 접근.
 * map : <key,value>. key로 접근한다. --> 검색하는 경우에 쓴다. 
 */

public class CollectionTest {
	public static void main(String[] args) {
		//중복값 제거
		List<Integer> list = Arrays.asList(3,3,10,11,14,3,15,88);
		System.out.println(list); // 콘솔 [3, 3, 10, 11, 14, 3, 15, 88]
		
		//list ==> set
		HashSet set = new HashSet<>(list);
		System.out.println(set); // 콘솔 [3, 88, 10, 11, 14, 15]
		
		//list<EmpVO>
		List<EmpVO> empList = new ArrayList<>();
		empList.add(new EmpVO("park","bbb", 20000));
		empList.add(new EmpVO("kim","bbb", 10000));
		empList.add(new EmpVO("choi","aaa", 14000));
		empList.add(new EmpVO("park","bbb", 20000));
		
		//중복값 제거
		HashSet<EmpVO> empv = new HashSet<>(empList);
		System.out.println(empv.size()); //3건 출력
		
		//필터링 : 급여가 15000이상인 사원만 검색
		List<EmpVO> filterList = new ArrayList<>(); //필터링 결과 담을 리스트
		for( EmpVO vo : empv) {  // i=0; i > empList.size(); i++ 라고 씀...
			if(vo.getSalary()>15000) {
				filterList.add(vo);
			}
		}
		System.out.println(filterList.size());
		
		//==> stream 으로...
		filterList = empv.stream().
						filter( vo -> vo.getLastName().contains("b") ) // vo -> vo.getSalary() > 15000 급여가 15000 이상
						.collect(Collectors.toList());
		System.out.println(filterList); // .get(0.getLastName())
		
		
		
 	}

}
