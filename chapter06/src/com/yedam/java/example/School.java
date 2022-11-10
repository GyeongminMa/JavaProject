package com.yedam.java.example;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학생의 수 >");
		int count = Integer.parseInt(sc.nextLine());
		
		Student[] Sary = new Student[count];
		
		for(int i =0; i<Sary.length;i++) {
			
			Student student = new Student();
			//1.학교이름
			System.out.println("학교 이름 > ");
			String sName = sc.nextLine();
			student.setsName(sName);
			
			//2.학번
			System.out.println("학번 > ");
			int sNO = Integer.parseInt(sc.nextLine());
			student.setsNO(sNO);
			//3.국어점수
			System.out.println("국어점수 > ");
			int kor = Integer.parseInt(sc.nextLine());
			student.setKor(kor);
			//4.수학점수
			System.out.println("수학점수 > ");
			int math = Integer.parseInt(sc.nextLine());
			student.setMath(math);
			//5.영어점수
			System.out.println("영어점수 > ");
			int eng = Integer.parseInt(sc.nextLine());
			student.setEng(eng);
			
			Sary[i] = student;
		}
		for(int i = 0; i<Sary.length; i++) {
			Sary[i].getInfo();
			
		}
	}

}
