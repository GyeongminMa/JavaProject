package com.yedam.java.chapter0801;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)-------");
		//RemoteControl rc = new Television();
		MyClass mc = new MyClass();
		mc.rc.turnOn();
		mc.rc.turnOff();
		
		System.out.println("2)--------");
		//RemoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		//rc.turnOn();
		//rc.turnOff();
		
		System.out.println("3)---------");
		//RemoteControl rc = new Audio();
		MyClass mc3 = new MyClass();
		mc3.methodA();
		//rc.turnOn();
		//rc.turnOff();
		
		System.out.println("4)--------");
		////RemoteControl rc = new Television();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		//rc.turnOn();
		//rc.turnOff();
	}

}
