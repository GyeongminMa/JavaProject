package com.yedam.java.example;

public class Student {
	//필드
	private String sName;
	private int sNo;
	private int kor;
	private int math;
	private int eng;
	
	//1) getter, setter 작성
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsName() {
		return sName;
	}
	public int getsNO() {
		return sNo;
	}
	public void setsNO(int sNO) {
		this.sNo = sNO;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	//생성자
	
	//메소드
	//모든 정보를 출력할 수 있는 메소드 하나 작성
	public void getInfo() {
		System.out.println("이름 : " + sName);
		System.out.println("학번 : " + sNo);
		System.out.println("한국어 : " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
	}
	
	//school 클래서 만들고 main을 작성해서 정보를 넣는 프로그램
	//학생수 입력받고 각 필드의 데이터를 받아와서 학생 정보가 담긴 프로그램
	//모든 정보를 출력.
}
