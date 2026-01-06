package study20260106;

import java.util.Scanner;

public class LoopMain2 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		System.out.println("1~50 중 입력");
		int user = scan.nextInt();
		
		while(true) {
			int com = (int)Math.floor(Math.random() * ) + ;
			
			if( com > user ) {
			    System.out.println("DOWN");
			}	
	        if( com < user ) {
	            System.out.println("UP");	
	        }
		    if( user == com ) {
		        System.out.println(" 정답 !");
		        break;
		    }	
	        
	        
		}
	}		
		
 }		
		
		
		
//		int com = (int)Math.floor(Math.random() * 50 ) + 1;
//		
//		while(true) {
//			System.out.println("1~50 중 입력");
//			int user = scan.nextInt();
//       if( com > user ) {
//       System.out.println("DOWN");
//       }	
//       if( com < user ) {
//          System.out.println("UP");	
//       }
//       if( user == com ) {
//       System.out.println(" 정답 !");
//       break;
//       }   	
//			
	}
	    

}
	

















