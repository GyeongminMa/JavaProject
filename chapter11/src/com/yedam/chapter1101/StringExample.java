package com.yedam.chapter1101;

import java.io.UnsupportedEncodingException;

public class StringExample {
	
	//String에 대하여
	
	//String a ="1"; //100번지
	//String c ="1"; //100번지
	//String b =new String("1"); //200번지
	
	
	public static void main(String[] args) {
		//바이트 -> 문자열
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		//배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//String str2 = new String(바이트 배열, 시작점, 갯수);
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		//String 메소드
		//1) charAt(int index) - 특정 문자 위치를 반환
		
		String ssn = "123456-1876541";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		//문자열 비교
		//equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";
		
		//주소를 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		}else {
			System.out.println("다른 String 객체 참조");
		}
		
		if(strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		}else {
			System.out.println("다른 문자열 가짐");
		}
		
		//바이트 배열로 변환
		byte[] bytes2 = null;
		String str = " 안녕하세요";
		bytes2 = str.getBytes();
		
		System.out.println(bytes2.length);//한글 3byte 총 15byte
		
		String str3 = new String(bytes2);
		System.out.println("bytes2-> String" + str3);
		
		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			
			System.out.println("bytes3.length : " + bytes3.length);
			
			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> string " + str4);
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//문자열 찾기
		String subject = "자바 프로그래밍";
		
		int index = subject.indexOf("프로그래밍");
		
		System.out.println(index);
		
		index = subject.indexOf("a");
		
		System.out.println(index);
		
		//문자열의 문자 개수 얻기
		System.out.println(subject.length());
		
		//문자열 위치 변경
		
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(newStr);
		
		//oldStr = "자바"; //100번지
		//oldStr += "프로그래밍"; //200번지
		//oldStr += "재밌다"; //300번지
		
		//StringBuilder or buffer
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append(false);
		
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append(123);
		
		System.out.println(sb);
		
		//대소문자 바꾸기
		
		String strVal = "asdlfkjasdfoiqwrejz";
		String strVal2 ="KJFAINJKNVLNLJDKADF";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		//trim
		String strTrim = "        자바       ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		//substring()
		//substring(index,end)
		//index부터 end까지 자르세요
		//substring(index)
		//index부터 끝까지 자르세요
		
		String ssn2 = "88015-1234567";
		
		String firstNum = ssn2.substring(0,6);
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//split()
		String strSplit = "1-1-1-1-1-2-3-4-5-6-9";
		
		String[] strAry = strSplit.split("-");
		
		for(String temp : strAry) {
			System.out.println(temp);
		}
		
		//문자열 변환
		
		//숫자나, 소수, 불리언 -> String으로 변환
		String strChange = String.valueOf(false);
		String strChange2 = String.valueOf(10);
		String strChange3 = String.valueOf(10.7);
		
		System.out.println(strChange);
		System.out.println(strChange2);
		System.out.println(strChange3);
	}
}
