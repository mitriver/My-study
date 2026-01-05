package study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {
		
//		for( int i = i ; i<=10; i++ ) {
//			System.out.println( i );
//		}
		
//		for( int i=1 ; i<=100; i++ ) {
//			if( i%10 == 0)
//				System.out.println( i );
//		}
		
	    Scanner scan = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		for( int i=1; i<num ; i++) {
//			System.out.println( i );
//		}
		
	    
	    // 1부터 12까지 출력하는데
	    // 4의 배수에는 four 라고  출력하시오
	    
//	    for(int i = 1; i <= 12; i++) {
//	    	if (i % 4 ==0) 
//	    		System.out.println("four");
//	    	else 
//	    		System.out.println(i);
//	    	}
	   
//	    int count = 0;
//	    
//	    for( int i=1; i<=1000; i++) {
//	    	
//	    	if( i%17 == 0) {
//	    		count++;
//	    	}
//	    	
//	    }
//	    
//	    System.out.println(" 17의 배수 : " +count +"개");
	    
	    
	    // 문제
	    // 동전앞면 뒷면 맞추기 게임
	    // 게임을 총 10판 진행 하기
	    // 게임에서  내가 맞춘 횟수는 총 몇번인지  출력하기
	    
	    int ok = 0; // 내사 맞춘건지 누적저장 변수
	
	    for( int i=1; i<=10; i++) {
	    	int coin = (int)Math.floor(Math.random() * 2) + 1;
	    	// 1 - 앞면 , 2- 뒷면
	    System.out.println("동전 앞면 뒷면 맟추기");
	    System.out.println("1-앞면, 2-뒷면, \n 입력 : ");
	    int user = scan.nextInt();
	    
	    if( user == coin ) {	
	        System.out.println("맞추기 성공!!!");
	        ok++;
	    }else
	    	System.out.println("맞추기 실패......");
      }
	   System.out.println("내가 맞춘 횟수 : "+ ok);
	
	
	}

}


/*
    1월 5일 과제
    
    
    
    반복문 - for, while, do~while
    반목문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정이다. 또는 횟수의 제한
    없이 동작 시 킬수 있다.
    
    for문
    
    for(  ){
         반복 실행할 내용;
         반복 실행 할 내용;
    }

    for( int i=1;  i<=5

*/





