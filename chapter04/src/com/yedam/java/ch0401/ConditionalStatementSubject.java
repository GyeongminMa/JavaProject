package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		//문제1) 두 개의 정수가 주어졌을 때
		//		두 정수의 합이 자연수이면 'Natural Number'를 출력하는 코드 작성
		int a =-4;
		int b =7;
		if(a+b>0){
			System.out.println("Natural Number");
		}
		
		//문제2) 두 개의 정수가 주어졌을 때 두 수의 대소 관계에 따라서 부등호 출력하는 코드
		if(a>b) {
			System.out.println(">");
		}else if(a==b){
			System.out.println("=");
		}else {
			System.out.println("<");
		}
		//문제3) 체질량 지수인 BMI에 따라 비만도를 4가지 단계로 구분
		//BMI = 체중(kg) / (키(m)*키(m))
		//저체중(18.5미만),정상(18.5 이상 25미만),과체중(25이상 30미만),비만(30이상)
		
		double weight= 50;		//double
		double height= 1.6f;  //double
		double bmi = weight/(height*height);
		
		if(bmi<18.5){
			System.out.println("저체중");
		}else if(bmi<25){
			System.out.println("정상");
		}else if(bmi<30) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		//문제4) 선택한 단의 6번째 값을 출력하는 코드
		// 		예를 들어, 2단일 경우 "2X6=12"
		//		단, 출력문에는 변수를 사용하지 않는다.
		
		int dan = (int)(Math.random()*9)+1;
		switch(dan){
		case 1:
			System.out.println("1x6=6"); //printf(%d X 6 =%d\n,1,1*6)
			break;
		case 2:
			System.out.println("2x6=12");//printf(%d x 6 =%d\n,2,2*6)
			break;
		case 3:
			System.out.println("3x6=18");
			break;
		case 4:
			System.out.println("4x6=24");
			break;
		case 5:
			System.out.println("5x6=30");
			break;
		case 6:
			System.out.println("6x6=36");
			break;
		case 7:
			System.out.println("7x6=42");
			break;
		case 8:
			System.out.println("8x6=48");
			break;
		default:
			System.out.println("9x6=54");
			break;
		
		}
		//문제5)switch문으로 풀기! 다음과 같이 점수 범위에 따라 등급을 구분
		//		해당 점수에 대한 등급을 출력하는 코드
		//		90점 이상 100점 이하 : A등급
		//		80점 이상 90점 미만 : B등급
		//		70점 이상 80점 미만	:C등급
		//		60점 이상 70점 미만 :D등급
		//		60점 미만 : E등급
		
		int num =70; //double score =75.6
		int score =num/10;
		switch(score){  //switch((int)(score/10))
		case 10:
		case 9:
			System.out.println("A등급입니다.");
			break;
		case 8:
			System.out.println("B등급입니다.");
			break;
		case 7:
			System.out.println("C등급입니다.");
			break;
		case 6:
			System.out.println("D등급입니다.");
			break;
		default:
			System.out.println("E등급입니다.");
			break;
		}
		
		
	}

}
