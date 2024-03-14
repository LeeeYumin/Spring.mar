package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
	 int employeeId; //int 는 0인지 null인지 판단 해줘야함.(mapper.xml 파일이랑 같이보기)
	 String firstName;
	 String lastName;
	 String email;
	 
	 @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm") //hh랑 HH랑 다름 
	 Date hireDate;
	 Integer salary;
	 String jobId;
	 String departmentId; //String 은 null 체크 가능.(mapper.xml 파일이랑 같이보기)
	 String managerId;
	 String phone; //select 문에 "phone 해돟으면 같을걸로 알아먹음" 아님 map 객체를 만들든가.
	 
	 String photo; //2일차 과제로 추가... html에는 name="photo" 하면 안됨 (이름이 같으면 안된다)
	
 
}