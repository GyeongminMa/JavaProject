package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// 문제1) 주어진 배열의 총합과 평균을 구하세요
		int[] array = { 10, 53, 26, 85, 75 };

		int sum = 0;

		for (int i = 0; i < 5; i++) {// int i= 0; i<array.length;i++
			sum += array[i];
		}
		double avg = (double) sum / 5; // double avg = sum / (double)array.length;
		System.out.println("총합 :" + sum + "," + "평균" + avg);
		System.out.printf("평균 : %.2f\n", avg); // 소수점 2째자리까지

		// 문제2) 배열의 최대값과 최소값을 구하세요
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);

		// 문제3) 문제 2에서 구한 최대값과 최소값의 각가 몇번째값인지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			// 최대
			if (max == array[i]) {
				maxIndex = i;
			}
			// 최소값
			if (min == array[i]) {
				minIndex = i;
			}
		}
		System.out.println("최대값 : " + max + "는" + (maxIndex +1)+ "번째입니다.");
		System.out.println("최소값 : " + min + "는" + (minIndex +1)+ "번째입니다.");
	}
}
