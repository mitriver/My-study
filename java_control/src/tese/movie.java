package tese;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		// 좌석 배열
		int[] seats = new int[50];
		
		// 예약 인원 수 
		System.out.print("예약 인원 수 : ");
		int people = sc.nextInt();
		
		boolean reserved = false; // 예약 여부
		
		// 앞자리부터 탐색
		for (int i = 0; i <= seats.length - people; i++) {
			
			int count = 0;
			
			// 연속 좌석 확인
			for(int j = i; j < i + people; j++) {
			   if (seats[j] == 0) {
				count++;
			}
		}
		
		
		// 연속된 빈 좌석
		if(count == people) {
			
			// 예약 처리
			for(int j = i; j < i + people; j++) {
				seats[j] = 1;
		}
			
			System.out.println(
					people + "석 예약 완료 (" + (i + 1) + "번 ~ " + (i + people) + "번)"
					);
			
			reserved = true;
			break; // 앞자리 우선이므로 종료
	}
		
}		
		// 연속 좌석이 없는 경우
		if (!reserved) {
			System.out.println("연속 좌석이 없습니다");
		}
		
		
		
	}
}
	
	
	
	
	