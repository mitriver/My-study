package sangsog;

import products.Aircon;
import products.Refrigerator;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.power();
		tv.power();
		
		Refrigerator ref = new Refrigerator();
		
		Aircon air = new Aircon("LG휘센",310);
		
		System.out.println( air );
		
		System.out.println(air);
		
		//Microwave microwave = new Microwave();
		
		int a=10,b=20,c=30,d=40,e=50;
		// 서로 다른 이름을 가진 변수 여러개를 하나의 이름으로 묶어주기
		int[] arr = new int[5];
		int[] arr2 = new int[6];
		int[] arr3 = new int[7];
		int[][] temp1 = new int[3][];
		temp1[0] = arr;
		temp1[1] = arr2;
		// 같은 타입의 1차원 배열 여러개 라면 2차원 배열 하나로 묶어주기
		
		int num=10;
		String name="이순신";
		int[] score= new int[10];
		// 서로 다른 타입에  종류도 다르다면  클래스로 묶어주기
		
		class student{
			int num;
			String name;
			int[] score;
	    }
		
		// 클래스 가 여러개 필요하다  면
		//  데이터를 중점으로 다루는 클래스가 있고 , 메서드를 중점으로 다루는 클래스가 있으니
		// 데이터관련 클래스를 여러개는 공통점이 있는경우 부모 클래스로  묶어준다.
		//  메서드를 중점으로 다루는 클래스가 여러개라면  추상 부모클래스 또는 인터페이스로 묶어준다.
		
		
	}

}

//  자바의 상속
//  오버라이딩
//   다형성
//  추상화
//   protected
//  final
// instanceof

//  상속공부 하기 위해 사용할만한  주제
//    동물 에대한 상속
//   직원 급여 계산 시스템  - 직원 부모 - 
// 결제 시스템    결제 부모 , 카드 결제. 현금, 이체 는 자식
// 게임 캐릭터   캐릭터 부모,  직업들이  자식
// 교통 수단 시스템   교통 수단 부모,  버스, 기차, 차, 오토바이, 자전거





