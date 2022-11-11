package com.yedam.chapter0701;

public class Application {

	public static void main(String[] args) {
//		Child child = new Child();
//		
//		//자식 클래스 고유 필드
//		child.lastName = "paul";
//		child.age = 20;
//		
//		//부모 클래스 필드
//		System.out.println(child.firstName + child.lastName);
//		
//		//System.out.println(child.job);//부모가 private 걸어서 안됨
//
//		//부모 -> 여러명의 자식 가질수 O
//		//자식 -> 여러명의 부모 섬길수 X
//		
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰" , " 화이트",10);
//		
//		//부모 클래스 필드 사용
//		System.out.println("모델 :" + dmb.model);
//		System.out.println("색상 :" + dmb.color);
//		
//		//자식 클래스 필드 사용
//		System.out.println("채널 : " +dmb.channel);
//		
//		//부모 클래스 메소드 사용
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요");
//		dmb.receiveVoice("안녕하세요 전 김또치 입니다.");
//		dmb.powerOff();
//		
//		//자식 클래스 메소드 사용
//		dmb.turnOnDmb();
//		
//		Member member = new Member("고길동","213456879-485523",1);
//		System.out.println("name : " + member.name);
//		System.out.println("ssn :" + member.ssn);
//		System.out.println("memberNo :" +1);
//			
//		Child cd = new Child();
//		cd.method1();
//		cd.method2();
//		cd.method3();
//		
//		Compute com = new Compute();
//		com.areaCircle(10);
//		double result = com.areaCircle(10);
//		System.out.println("result : " + result);
//		
//		SupersonicAirPlane sa  = new SupersonicAirPlane();
//		
//		sa.takeOff();
//		
//		sa.fly();
//		
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
//		
//		sa.fly();
//		
//		sa.flyMode = SupersonicAirPlane.NORMAL;
//		
//		sa.fly();
//		
//		sa.land();
		
		Child chd = new Child();
		//Parent parent = new Child();
		//자동 타입 변환
		//부모 클래스에 있는 필드, 메소드를 사용을 하되
		//만약 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재한다면
		//부모 클래스에 정의 된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용하게됨
		Parent parent =chd;
		
		parent.method1();
		parent.method2();
		//parent.method3();
		
		
		//
		
		
		
		
		
		
		
		
	}

}
