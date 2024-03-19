package com.example.demo.emp.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.common.Paging;
import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;
import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpService;

@RestController
public class EmpRestController {
	
	@Autowired EmpService service;

	//리스트 페이지 이동. ajax 는 model 필요없음
	@GetMapping("/empMng")
	public ModelAndView empMng() {
		ModelAndView mv = new ModelAndView("empMng");
		return mv;
	}
	
	//사원리스트 데이터
	@GetMapping("/ajax/empList")
	//@ResponseBody //vo 객체를 json string 으로. ajax 응답은 이거 필수.
	public Map<String, Object> empList(EmpVO vo, SearchVO svo, Paging pvo) {
		svo.setStart(pvo.getFirst());
		svo.setEnd(pvo.getLast());
		Map<String, Object>map = service.getEmpList(vo, svo);// 넘길값 여러개라서 map 추가
		pvo.setTotalRecord((Long)map.get("count"));
		map.put("paging", pvo);
		
		return map;//넘겨주느 데이터에 맞게 리턴
	}
	
	@PostMapping("/ajax/emp")
	public EmpVO save(@RequestBody EmpVO vo) {
		service.insertEmp(vo);
		//System.out.println(vo);
		return vo; // 등록된 vo를 다시 넘겨준다
	}
	
	//empMng 단건조회	
	@GetMapping("/ajax/emp/{empId}")
	public EmpVO info(@PathVariable int empId) { // 리턴값 1개라서 바로 넘기면 됨
		return service.getEmpInfo(empId);
	}
	
	//차트
	@GetMapping("/ajax/empStat")
	public List<Map<String, Object>> stat() {		;
		return service.getStat(); // 등록된 vo를 다시 넘겨준다
	}
	
}
