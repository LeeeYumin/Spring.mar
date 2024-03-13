package com.example.demo.emp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;

@SpringBootTest
public class EmpMapperTest {

	@Autowired EmpMapper mapper;
	
	@Test
	public void 사원통계() {	
		List<Map<String,Object>>list = mapper.getStat();
		//for departmnetId cnt 만 출력
		for( Map<String, Object> map: list) { // 컬렉션타입의:변수?
			System.out.println(map.get("name") +":" + map.get("cnt")); 
		}
		//System.out.println(list);
	}
	
	//@Test
	public void 사원등록() {
		//vo 객체 생성
		EmpVO vo = EmpVO.builder()
					//.employeeId(301)
					.lastName("aaaa")
					.email("a1@a22111.a")
					.hireDate(new Date())
					.jobId("IT_PROG")
					.build();
		int result = mapper.insertEmp(vo);
		//값을 담고
		//필수 입력 EMPLOYEE_ID LAST_NAME(not null) EMAIL HIRE_DATE JOB_ID
//		vo.setEmployeeId(300);
//		vo.setLastName("홍");
//		vo.setEmail("a.a@a");
//		vo.setHireDate(new Date(2021,0,1));
//		vo.setJobId("IT_PROG");
//		int result = mapper.insertEmp(vo);
		
		//등록된 사번 조회
		System.out.println("등록된 사번 : " + vo.getEmployeeId());
		System.out.println("등록건수 = " + result);
	}
	
	
	//@Test
	public void 사원삭제() {
		
	}
	
	
	
	@Test
	public void 사원전체조회() {
		EmpVO vo = new EmpVO();
		SearchVO svo = new SearchVO();
		//vo.setDepartmentId("50"); //조건
		//vo.setFirstName("Kevin");
		//vo.setManagerId("103");
		//vo.setStart(1);
		//vo.setEnd(100);
		svo.setEmployeeIds(new int[] {100,101,102});
		List<EmpVO> list = mapper.getEmpList(vo, svo);
		//for문 사번, firstName 출력
		for(EmpVO emp : list){ // 이거말고 size i++ 로 기본문도 사용가능
			System.out.println(emp.getEmployeeId() + ":" + emp.getFirstName());
		}
		
		System.out.println("결과는="+list.size());
		//System.out.println(list.get(0));
		//assertEquals(list);
				
	}
	
	//@Test
	public void 사원단건조회() {
		int employeeId = 100;
		EmpVO vo = mapper.getEmpInfo(employeeId);
		System.out.println(vo);
		//assertEqual(employeeId, vo.getEmployeeId();
	}
}
