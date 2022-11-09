package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		//1.변수 사용
		int[][] mathScores = new int[2][3];//int[]의 배열
		
		for(int i=0; i<mathScores.length;i++) {
			System.out.println("mathScores["+i+"]");
			int[] mathScore = mathScores[i];
			
			for(int j=0; j<mathScore.length;j++) {
				System.out.println("\t mathScore[" + j +"] :" + mathScore[j]);
			}
		}
		System.out.println();
		//2.변수 사용x
		for(int i=0; i<mathScores.length;i++) {
			System.out.println("mathScores["+i+"]");
			
			for(int j=0; j<mathScores[i].length;j++) {
				System.out.println("\t mathScores["+i+"][" + j +"] :" + mathScores[i][j]);
			}
		}
		int[][] scoreList = {
									{86, 65},
									{58, 95, 73}
							};
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적====");
			for(int j=0; j<scoreList[i].length; j++) {
				System.out.println(scoreList[i][j]+ " ");
			}
			System.out.println();
		}
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];
		
		for(int i=0; i<englishScore.length;i++) {
			for(int j=0; j<englishScore[i].length;j++) {
				System.out.println("englishScore["+i+"]["+j+"] :" +englishScore[i][j]);
			}
		}
		
		//
		
		String[] strArray = new String[3];
		strArray[0] = "Java"; //java 
		strArray[1] = "Java";
		strArray[2] = new String("Java"); //위의 자바와 값이 다름
		
		System.out.println(strArray[0] == strArray[1]);//true
		System.out.println(strArray[1] == strArray[2]);//false
		System.out.println(strArray[1].equals(strArray[2]));//true 실질적인 값을 비교하기 때문
		
		System.out.println();
		
		//for문으로 배열 복사
		int[] oldIntAry = {1,2,3};
		int[] newIntAry = new int[5];
		for(int i=0; i < oldIntAry.length ;i++) { //배열복사시 작은쪽 크기에 맞춰야함;
			newIntAry[i] = oldIntAry[i];
		}
		
		for(int i=0; i<newIntAry.length;i++) {
			System.out.println(newIntAry[i]);
		}
		
		//System.arraycopy()
		String[] oldStrAry = {"java", "array", "coppy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry,0,newStrAry,2,oldStrAry.length);
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		//향상된 for문
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		//int index = -1;
		for(int score : scores){
			sum += score;
			//System.out.println("인덱스 :" + ++index);
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합 : " + avg);
		
		
		
	}
}