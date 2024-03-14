package com.example.demo.di;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.Setter;

@SpringBootTest
public class DITest {
	
	@Autowired //필드 주입 방식
	private Restaurant restaurant;
	
	@Setter(onMethod_ = {@Autowired} )
	private Restaurant restaurant1; //"prototype" false 
	
	@Test
	public void 스코프비교() {
		//assertEquals(restaurant, restaurant1); //singletone : true
		assertThat(restaurant == restaurant1).isTrue(); //주소비교하면 같다
	}
	
	//@Test
	public void test() {
		assertThat(restaurant.getChef()).isNotNull();
	}

}
