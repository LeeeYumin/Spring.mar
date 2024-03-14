package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.emp.EmpVO;
import com.example.demo.emp.SearchVO;
import com.example.demo.emp.mapper.EmpMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //이거 하면 EmpMapper dao 앞에 final 붙여주기  [두번째방법]
@Controller //컨테이너 빈 등록 + 사용자 요청을 처리하는 커맨드 핸들러로 바꿔준다 (2가지 역할)
public class EmpController {
	
	 //@setter~ 이 위치에 해주든가  [세번째방법]
	 //@Autowired //의존성주입 (DI dependency Injection 객체관리를 스프링이 알아서 해줌) [첫번째방법]
	 final EmpMapper mapper;
	 
	 
	  //등록 페이지 이동
	 @GetMapping("/emp/insert")
	 public void insert() { 
		 
	 }
	 
	 
	 //등록처리 --> employees 테이블에 photo 컬럼 추가
	 @PostMapping("/insert")
	 public String insert(@ModelAttribute("emp") EmpVO vo, MultipartFile photoFile) {
		 //파일 업로드
		 
		 vo.setPhoto(photoFile.getOriginalFilename());
		 System.out.println(vo);
		 mapper.insertEmp(vo);
		 return "redirect:/emp/list";
	 }
	 
	 //수정페이지 이동
	 @GetMapping("/emp/update")
	 public void update() {
		 
	 }
	 
	 
	 
	 //수정 처리
	 
	 
	 
	 //삭제 처리
	 
	 
	 //상세조회 페이지 이동
	 //@GetMapping("/emp/info/{employeeId}")
	 
	 
	 
	 
	 //목록 페이지로 이동
	 @RequestMapping("/emp/list")	 
	 public String empList(Model model, EmpVO vo, SearchVO svo){
		 model.addAttribute("empList", mapper.getEmpList(vo, svo));
		 return "emp/list"; 

	 }
	 
	 
	 @GetMapping("/") //해당 url을 찾고
	 public String test() { //페이지를 찾아서
		 return "index"; // templates(이게 기본값. 여기는 동적 컨텐츠.) 에 가서 index 파일을 찾음
	 }
}
	 
