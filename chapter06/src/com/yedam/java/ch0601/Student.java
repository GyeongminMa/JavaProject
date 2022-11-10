package com.yedam.java.ch0601;

public class Student {

	//필드
	//학생의 이름
	String sName;
	//학교이름
	String sSchool;
	//학번
	int sNo;
	//학년
	int sYear;
	//국어,영어, 수학 성적
	int kor;
	int eng;
	int math;
	//생성자
	//생성자를 통해서 모든 데이터를 입력
	public Student(String sSchool, String sName, int sNo, int sYear, int kor, int math, int eng){
		this.sSchool = sSchool;
		this.sName = sName;
		this.sNo=sNo;
		this.sYear=sYear;
		this.kor =kor;
		this.eng = eng;
		this.math=math;
		
	}
	
	//메소드
	//getInfo()학생의 내용을 출력할 수 있는 기능
	public void getInfo() {
		System.out.println("내가 다니는 학교 : " + sSchool );
	}
}
