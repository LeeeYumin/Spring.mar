package com.sam.app.insa.service;

import java.util.List;
import java.util.Map;



public interface DepartmentsService {

	// 목록조회
		public List<Map<String, Object>> getDeptList(DepartmentsVO dvo);

		// 단건조회
		public DepartmentsVO getDept(String seqs);

		// 입력
		public void insertDept(DepartmentsVO dvo);

		// 수정
		public void updateDept(DepartmentsVO dvo);

		// 삭제
		public void deleteDept(String seqs);
}
