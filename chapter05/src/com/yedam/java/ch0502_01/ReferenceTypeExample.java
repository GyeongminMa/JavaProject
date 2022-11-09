package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 배열을 선언 ->모든 타입을 값으로 가질 수 있음
		// int[] intAry = null; //둘다 가능 보통은 위에있는거 씀
		// System.out.println("intAry[0] : " + intAry[0]);
		// int intAry2[];

		// int[] scores = { 83,90,87};

		User user = new User();
		user.name = "홍길동";
		user.age = 24;
		user.height = 175.7;

//		let user = {
//				name:'홍길동',
//				age : 25,
//				height :175.7
//		};

		// 배열을 선언 ->모든 타입을 값으로 가질 수 있음
		int[] intAry = null;
		// 값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 };

		System.out.println("score[0] :" + scores[0]);
		System.out.println("score[1] :" + scores[1]);
		System.out.println("score[2] :" + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {// = 빠짐 <= 안씀 배열은 무조건 1씩 차이나니깐
			sum += scores[i];// sum +=score[0] +[1]+[2]
		}
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);

		// 주의사항 변수 선언하면서 값 주기는 가능 변수 선언후 나중에 값주는건 불가
		int[] scoreList;
		// scoreList = {83, 90, 87};
		scoreList = new int[] { 83, 90, 87 };// new쓰면 가능

		sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + scoreList[i];
		}
		System.out.println("총합 : " + sum);
		sum = add(new int[] { 83, 90, 87 });
		//new 연산자로 배열 생성
		int[] array = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("array["+i+"] : " + array[i]);
		}
		String[] strAry = new String[4];
		for(int i=0; i<strAry.length;i++) {
			strAry[i] = String.valueOf(i);
		}
		for(int i=0; i<strAry.length;i++) {
			System.out.println("strAry["+i+"] :" + strAry[i] );
		}
	}

	private static int add(int[] numList) {
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
			sum += numList[i];
		}
		return sum;
	}

}

//static void main(String[] args) {
//
//	static int add(int[] numList) {
//		int sum = 0;
//		for (int i = 0; i < numList.length; i++) {
//			sum += numList[i];
//		}
//		return sum;
//	}
//}