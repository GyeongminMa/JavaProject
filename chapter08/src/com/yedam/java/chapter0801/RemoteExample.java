package com.yedam.java.chapter0801;

public class RemoteExample {

	public static void main(String[] args) {
		//TV를 객체로 해서만들었음
		RemoteControl rc = new Television();
		
		//오디오로 덮어씀
//		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television();
		
		search.search("google.com");
		
	
		///////////////
		
		
		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolume(11);
		tv.turnOff();
		
		//추상 클래스 vs 인터페이스
		//추상 클래스(extends) -> 필드,생성자,메소드
		//인터페이스(implement) -> 상수, 추상 메소드
		
		
		
		
	
	}

}
