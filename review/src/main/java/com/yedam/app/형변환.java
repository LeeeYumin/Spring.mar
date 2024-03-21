package com.yedam.app;

/*
 * char - Character
 * byte - Byte
 * int -Integer 많이씀
 * short - Short
 * long - Long
 * float - Float
 * double - Double 많이씀
 * boolean - Boolean
 */

public class 형변환 {
	
	public static void main(String[] args) {
		
		// other type ==> string
		Integer score = 100;
		
		//String s = score;
		String s = Integer.toString(score);
		
		double avg = 90.5;
		s = Double.toString(avg);
		
		//string ==> other type
		score = Integer.parseInt(s);	
		avg = Double.parseDouble(s);
		 
	}

}
