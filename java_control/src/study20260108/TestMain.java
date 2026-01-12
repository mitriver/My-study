package study20260108;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {

		// 이정도 까지 는 해야 된다 - 배열 실습

		// 문제1. 10개의 무작위 정수 값 저장하기 ( 배열에 )
		// 랜덤 범위는 1~50

//		int[] arr = new int[10];
//	
//		for (int i = 0; i < arr.length; i++) {
//			 int randomNum = (int)(Math.random() * 50) + 1;
//			 arr[i] = randomNum;
//		} 
//			  for (int i = 0; i < arr.length; i++) {
//		            System.out.println("arr[" + i + "] = " + arr[i]);
//		}

		// 문제 2.
		// int[] score = { 99,66,77,56,78,98,83};
		// 1학년 3반 학생들의 성적을 배열에 저장하였다.
		// 3반 학생들 성적의 평균값을 구하세요
		// 반복문 이용 하여 하세요!!! 반드시 !!!

//          // 성적 배열 
//          int[] score = { 99, 66, 77, 56, 78, 98, 83 };
//          
//          // 총합을 저장할 변수
//          int sum = 0;
//          
//          // 반복문으로 점수 더하기
//          for (int i = 0; i < score.length; i++) {
//        	  sum += score[i];
//          }
//          
//          // 평균 계산
//          double average = (double) sum / score.length;
//
//          // 결과 출력
//          System.out.println("3반 학생들 성적 평균 : " + average);

		// 문제 3 . 정수 10개를 저장할수 있는 배열을 선언
		// 1~50 의 무작위값 저장 하기
		// 배열의 첫번째 값고 마지막 값 출력

		int[] arr = new int[10];
		// 반복문으로 1 ~ 50 랜덤값 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
		}
		
		// 첫 번째 값 출력
		System.out.println("첫 번째 값 : " + arr[0] + " " + "두번째 값 : " + arr[arr.length - 1]);
		
		//문제 4.  문제3번의 배열에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력하세요

	        for (int n : arr) {
	        	if ( n%2 == 0) {
	                System.out.println( n );
	        }
		
	   // 문제 5. 마지막     	
	   //      int[] temp = { 6, 0, 5, -2, 0, 4, 6, 0}
	   //     	temp 배열은 일벌 최고기온을 저장 한것이다.
	   //     	  배열애 저장된 기온중 가장 높은 기온과  가장 낮은 기온을 찾으세요
	   //     	   0 번 인덱스의  기온은 12월 11일 데이터이다.
	   //           가장 높은 기온의 날짜와  가장 낮은 기온의 날짜 도 출력 하세요
	   //    (  가장 높은 기온, 가장 낮은 기온 만 찾아서 출력 하는것만 해도 성공! )
	        	
	   //  힌트  int max = temp[0];    	
	   //       int min = temp[0];
	        	
	   
	   int[] temp = { 6, 0, 5, -2, 0, 4, 8, 0 };     	
	        	
	   int max = temp[0];    	
	   int min = temp[0];  	
	     
	   for(int i=0; i<temp.length; i++) {
		   if( max < temp[i] ) max = temp[i]; // 가장 높은 것 찾기
		   
		   if( min < temp[i] ) min = temp[i]; // 가장 낮은 것 찾기
	   }
	        	
	   System.out.println(" 가장 높은 기온 : " + max);
	   System.out.println("가장 낮은 기온 : " + min);
	   
	   // 0번 인덱스의 기온은 12월 11일 이다.
	   //  가장 높은 기온이  몇번째 인덱스에 있는지 찾아야 한다.
	   for( int i=0; i< temp.length; i++) {
		   if( temp[i] == max ) {
			   System.out.println( " 가장 높은 기온 : "+ max + " 날짜 : 12월 "+ (i+11)+ "일");
		   }
		   if( temp[i] == min ) {
			   System.out.println("가장 낮은 기온 : "+ min +  " 날짜 : 12월 "+ (i+11)+ "일");
	   } 
	}   
	   int maxDay = Arrays.asList(temp).indexOf(max);
	   int minDay = Arrays.asList(temp).indexOf(min);
	   System.out.println( " 가장 높은 기온 : "+ max + " 날짜 : 12월 "+ maxDay + "일");
	   System.out.println( "가장 높은 기온 : "+ min + " 날짜 : 12월 "+ minDay + "일");
	   
        }
    }
}

