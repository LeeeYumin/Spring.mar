package com.example.demo.emp;

import java.util.Date;

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
	 Date hireDate;
	 Integer salary;
	 String jobId;
	 String departmentId; //String 은 null 체크 가능.(mapper.xml 파일이랑 같이보기)
	 String managerId;
	 String phone; //select 문에 "phone 해돟으면 같을걸로 알아먹음" 아님 map 객체를 만들든가.
	 

	 
}
