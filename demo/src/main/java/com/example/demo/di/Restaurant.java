package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Component //bean 꺼내쓰는거(등록)
@Data
@RequiredArgsConstructor //final 생성자 만들어줘
@Scope("prototype")
//singletone(기본. 하나만 생성하고 공유해서 같이 씀), prototype(요청시마다..), request(요청들어오면 만들고 끝나면 제거), session(세션마다)
public class Restaurant {
	final private Chef chef; //final 필드 (Restaurant 아이콘 옆에 C 생김)
	
	
}
