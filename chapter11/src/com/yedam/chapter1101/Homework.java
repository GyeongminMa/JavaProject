package com.yedam.chapter1101;

public class Homework {

	public static void main(String[] args) {
		//1)문자열 뒤집기
		//입력되는 문자열을 뒤집어서 출력
		//ex) input : abc, output : cba
		  String str = "abc";
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			
			System.out.println();
		
		//2)문자열 개수 세기
		//-입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
		//ex) input : 1a2v4b, output : 숫자 3개, 영어 3개
			
			int num = 0;
			int chr =0;
			String subject = "1a2v4b";
			
			for(int i = 0; i < str.length(); i++) {
				
				char echr = str.charAt(i);
				int mchr =str.charAt(i);
				
				if('a'<= echr &&  echr<= 'z') {
					chr++;}
				else if('0'<=mchr && mchr <='9') {
					num++;}
			}
			System.out.println("숫자 :"+ num +"영어 :"+ chr);
				
			
		
	}

}
