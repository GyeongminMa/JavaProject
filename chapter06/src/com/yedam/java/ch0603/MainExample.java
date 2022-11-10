package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		Car myCar = new Car("모닝", "하늘색");
		
		System.out.println("제조회사 :" + myCar.Company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		
		System.out.println();
		
		Car newCar = new Car();
		System.out.println("제조회사 : " + newCar.Company);
		System.out.println("모델명 : " + newCar.model);
		System.out.println("색깔 : " + newCar.color);
		
		System.out.println();
		
		Car subCar = new Car("아이오닉","하얀색");
		System.out.println("제조회사 : " +subCar.Company);
		System.out.println("모델명 : " + subCar.model);
		System.out.println("색갈 : " + subCar.color);
	}

}
