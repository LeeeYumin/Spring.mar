package com.yedam.app;

import java.util.Date;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmpVO {
	 int employeeId;
	 final private String firstName; //final 은 한번 생성되면 값 변경 불가
	 final private String lastName;
	 private String email;
	 private Date hireDate;
	 private Integer salary;
	 private String jobId;
	 private String departmentId; 
	 private String managerId;
	 private String phone;
	 private String photo;
	 
	 //기본 생성자
	 //public EmpVO() {} 
	 
	 //생성자는 클래스이름과 동일. 리턴타입없음. 역할 : 객체생성할때 값 넣어줌
//	 public EmpVO (String firstName, String lastName) {
//		 this.firstName = firstName;
//		 this.lastName = lastName;
//	 }
	 
	 //생성자
	 public EmpVO (String firstName, String lastName,Integer salary) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.salary = salary;
 }
	 
	 
	 //set메소드 만드는 규칙.
	 public String getFirstName() { // 외부에서 접근해야되니까 public
		 return this.firstName;
	 }
	 
	 public String getLastName() {
		 return this.lastName;
	 }
	 
	 public Integer getSalary() {
		 return this.salary;
	 }


	@Override
	public boolean equals(Object obj) {
		EmpVO vo = (EmpVO) obj; //부모 자식간의 형변환 가능.
		return this.firstName.equals(vo.getFirstName()) &&
				this.lastName.equals(vo.getLastName());
	}


	@Override
	public int hashCode() {
		return Objects.hash(this.firstName, this.lastName);
	}
	
	
}

