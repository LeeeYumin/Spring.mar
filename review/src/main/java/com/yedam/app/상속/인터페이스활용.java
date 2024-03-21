package com.yedam.app.상속;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.app.EmpVO;

public class 인터페이스활용 {
	public static void main(String[] args) {
		
		List<EmpVO> list = new ArrayList<>();
		list.add(new EmpVO("park","bbb", 20000));
		list.add(new EmpVO("kim","bbb", 10000));
		list.add(new EmpVO("choi","aaa", 14000));
		
		//sort
		Collections.sort(list, (EmpVO o1, EmpVO o2) ->  o2.getFirstName().compareTo(o1.getLastName()) );	
		for(EmpVO vo : list) {
		System.out.println(vo.getFirstName() + ":" + vo.getLastName());

		}
		
		//sort + 급여 비교
		Collections.sort(list, (EmpVO o1, EmpVO o2) ->  o1.getSalary()-o2.getSalary() ); //급여는 숫자니까 그냥 빼면 됨
		for(EmpVO vo : list) {
	
		}

	}
}