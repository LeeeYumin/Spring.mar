package com.example.demo.emp.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;


public interface EmpService {
	Map<String,Object> getEmpList(@Param("vo") EmpVO vo, @Param("svo")SearchVO svo); //여러건이라서 List
	EmpVO getEmpInfo(int employeeId); //단건
	//등록
	int insertEmp(EmpVO empVO);	
	//삭제(수업시간에 개별로 풀어보기)
	int deleteEmp(int employeeId);
	
	List<Map<String,Object>> getStat();
	
	//EmpMapper복사해옴. getCount 는 여기에 필요 없음.	
}
