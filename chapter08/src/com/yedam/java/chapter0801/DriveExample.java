package com.yedam.java.chapter0801;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		driver.drive(bus);
//		driver.drive(taxi);
//		
		Vehicle vhc =new Bus();
		
		vhc.run();
		//vhc.checkFare(); 오류남
	
		//강제 타입 변환
		Bus bus2 = (Bus) vhc;
		
		bus2.run();
		bus2.checkFare();
		
		//객체 타입 확인
		//instanceOf 
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
	}

}
