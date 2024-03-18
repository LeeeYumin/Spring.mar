package com.example.demo.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
	 
	 @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm") //hh랑 HH랑 다름. 입력받을때 받아온 string 값을 Date 로 바꿔줌
	 @JsonFormat(pattern = "yyyy-MM-dd") 							//출력할때 쓰아고 Date를 string으로.
	 Date hireDate;
	 Integer salary;
	 String jobId; 
	 @JsonProperty(value="deptId") String departmentId; //String 은 null 체크 가능.(mapper.xml 파일이랑 같이보기)
	 @JsonIgnore String managerId;
	 @JsonIgnore String phone; //select 문에 "phone 해돟으면 같을걸로 알아먹음" 아님 map 객체를 만들든가.
	 

	 
}
