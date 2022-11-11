package com.yedam.chapter0701;

import com.yedam.chapter07.Parent;

public class Child2 extends Parent{
	
	//필드
	
	//생성자
	
	//메소드
	void getInfo() {//protected 사용하면 다른 패키지에 존재하는 두개의 클래스끼리도 사용가능 
		System.out.println(firstName + lastName + bloodType + age);
		
	}
}
