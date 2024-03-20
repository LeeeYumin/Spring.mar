package com.example.demo.users.service;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.users.UsersVO;

public interface UsersService {
	

		public UsersVO getUsersInfo(String userid);

	}

