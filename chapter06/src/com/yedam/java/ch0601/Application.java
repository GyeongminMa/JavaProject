package com.yedam.java.ch0601;
//import java.util.Scanner;
public class Application {
	
	//필드
//	int staticTest = 0;
//	
//	
//	
	public static void main(String[] args) {
//		Application ap = new Application();
//		
//		ap.staticTest =2;
//		Shoes shoes = new Shoes();
//		
//		shoes.makeRunning();
//		shoes.makeSlipper();
//		shoes.makeMule();
//		shoes.getCount();
//		
//		System.out.println(Shoes.totalCount);
//		
//		ConstantNo csno = new ConstantNo();
//		System.out.println(csno.word);
//		System.out.println(csno.words);
//		
//		System.out.println(ConstantNo.EARTH_ROUND);
//		
//		//은행 고객 정보를 관리하는 클래스
		//1)main 2)Customer 3) Bank
		//main -> 생성자를 통한 고객의 정보를 저장,출력
		//bank -> 해당은행의 금리를 저장
		//			현재잔액 + 현재잔액 *금리
		//Customer -> 고객의 정보를 저장
			//이름  , 은행명, 계좌, 잔액에 대한 필드 존재
			//getInfo() : 입력한 정보를 출력
		//withDraw() :출금 할 때 정보를 출력
		
//		Scanner sc = new Scanner(System.in);
//		String confirm;
//		
//		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
//		
//		customer.getInfo();
//		
//		customer.withDraw();
//		System.out.println("출금 하시겠습니까? Y/N");
//		
//		confirm = sc.nextLine();
//		if(confirm.toLowerCase().equals("y")) {
//			
//			System.out.println("출금 완료");
//			
//		} else {
//			System.out.println("시스템 종료");
//		}
		
		Access access = new Access();
		
		//1) pubilc
		access.free="public";
		access.free();
		//2) private
		//access.privacy="privacy";
		//access.privacy();
		//3) protected
		access.parent = "parent";
		//4)default
		access.basic =" basic";
		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		//Singleton s1 =new Singleton()
		//singleton == new Singleton()
		//getInstance()==singleton == new Singleton()
		//getInstance()==new Singleton()
		
		Member mem = new Member();
		
		//1) mem 의 인스턴스 필드에 접근 가능한지 확인
		//2)setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : " + mem.getTel());
		System.out.println("Age : " + mem.getAge());
		
	}

}
