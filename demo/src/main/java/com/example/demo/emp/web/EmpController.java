package com.example.demo.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	 
	 @RequestMapping("/empResult") //여기서 결과를 가지고 넘어간다
	 public String result() {  
		 return "result";
	 }
	 
	 
	 @RequestMapping("/empList")	 
	 public String empList(Model model, EmpVO vo, SearchVO svo){
		 model.addAttribute("companyName","<i><font color='red'>예담주식회사</font></i>");
		 model.addAttribute("empList", mapper.getEmpList(vo, svo));
		 return "empList";  //위의 empList를 model 에 담아 empList로 리턴으로 돌려줌 

	 }
	 
	 
	 
	 @PostMapping("/insert3")
	 public	String insert3(EmpVO vo, RedirectAttributes rttr) { 
		 System.out.println("등록 : " + vo);
		 rttr.addAttribute("insertResult", "성공");
		 rttr.addFlashAttribute("flashResult", "한번만 사용가능"); //새로고침하면 사라진다

		 return "redirect:empResult"; //페이지 아니고 url임
	 }
	 
	 
	 @PostMapping("/insert2")
	 public ResponseEntity<EmpVO> insert2(EmpVO vo) { //@ResponseBody 쓰는거랑 같음
		 return new ResponseEntity<>(vo,HttpStatus.OK); // (결과 보낼 데이터타입, 상태값)의 순서...
	 }
	 
	 
	 
	 @PostMapping("/insert")
	 //@ResponseBody // 이거 없으면 api테스트 500에러뜸
	 public ModelAndView insert (@ModelAttribute("emp") EmpVO vo) {
		 System.out.println(vo); //vo 찍어보고
		 //mapper.insertEmp(vo);
		 
		 //커맨드객체는 model 에 추가되고 뷰페이지에 보여줌. 앞은 소문자.
		 //model.addAttribute("empVO", vo);
		 //model.addAttribute("insertResult","success"); //(속성,)
		 
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("result");
		 mv.addObject("insertREsult", "success");
		 mv.setStatus(HttpStatus.INTERNAL_SERVER_ERROR); //500번 에러. 상태값도 전달 가능한데 필수는 아님.
		 return mv; // return vo로 돌려준다. API테스트 같이해봄 "result" : 페이지명
	 }
	 
	 @GetMapping("/") //해당 url을 찾고
	 public String test() { //페이지를 찾아서
		 return "index"; // templates(이게 기본값. 여기는 동적 컨텐츠.) 에 가서 index 파일을 찾음
	 }
	 
	 @GetMapping("/update/{empId}")
	 public String update(@PathVariable int empId) {
		 System.out.println(empId);
		 return "index";
	 }
	 
	 @GetMapping("/delete")
	 public String delete(int employeeId, String name) {
		 System.out.println(employeeId + " : " + name);
		 return "index";
	 }
	 
	 
	 @RequestMapping("/ajaxEmp")
	 @ResponseBody //이거는 데이터만. ResponseEntity는 상태까지 제어가능. 2개 다 넘어가는 건 같음.
	 public  List<EmpVO> ajaxEmp(){
		 return mapper.getEmpList(null, null);
	 }
	 
//	 @RequestMapping("/empList")	 
//	 public String empList(Model model){
//		 model.addAttribute("empList", mapper.getEmpList(null, null));
//		 return "empList";  //위의 empList를 model 에 담아 empList로 리턴으로 돌려줌 
//
//	 }
}