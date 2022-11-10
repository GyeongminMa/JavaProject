package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(this.gas == 0) {//필드를 가리킴, this 안써도됨
			System.out.println("gas가 없습니다.");
			return false;//존재시 if문 스탑하기 때문에 if else 필요없
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run(){
		while(true) {
			if(this.isLeftGas()) {//this.gas>0 일때는 carExample myCar.run();지우기
				System.out.println("달립니다.(gas 잔량 : " + this.gas+")");
				this.gas--;
			}else {
				System.out.println("멈춥니다.(gas 잔량 : " + this.gas+")");
				return;
				//System.out.println("종료합니다."); return 밖은 실행안됨
			}
		}
	}
}
