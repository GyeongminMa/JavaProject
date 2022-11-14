package com.yedam.java.chapter0801;

public interface Vehicle {
	
	//자동 타입 변환
	//조건 - implement 받아야지만 사용 가능
	//인터페이스 구현 객체 = new 구현 클래스();
	//인터페이스에 정의해 놓은 추상 메소드 재정의 한 구현 클래스에 내용만 쓰겠다.
	//구현 클래스 내부에 인터페이스 오버라이딩 된 내용만 쓰겠다.
	//구현 클래스 내부에 인터페이스 오버라이딩 된 내용 말고는 못 쓴다.
	//해결방안 -> 구현 클래스에서 따로 정의한 메소드를 쓰고 싶다.
	//해결방안 - > 강제 타입 변환
	public void run();
}
