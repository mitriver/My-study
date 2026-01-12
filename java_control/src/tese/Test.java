package tese;

public class Test {

	public static void main(String[] args) {
		
		// 문제 1
		System.out.println("-----------------------");
		System.out.println("문제 1");
		String name = "홍길동";
		int age =25;
		double height = 175.5;
		String grade = "남";
		boolean isStudent = true;
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
		System.out.println("성별:" + grade);
		System.out.println("학생여부:" + isStudent);
		
		System.out.println("-----------------------");
		System.out.println("문제 2");
		
		// 문제 2
		
	    int a = 10;
	    int b = 20;
	    
	    int temp ;
	    temp = a;
	    a = b;
	    b = temp;
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 3");
	    // 문제 3
	    
	    System.out.println();
	    int width = 8;
	    int height_ = 5;
	    
	    int result = width * height_;
	    System.out.println(result);
	    System.out.println("-----------------------");
	    
	    System.out.println("문제 4");
	    
	    // 문제 4
	    
	    int kor = 85;
	    int eng = 90;
	    int math = 78;
	    
	    int total = kor + eng + math;
	    double average = total / 3.0;
	    System.out.println("국어: " + kor);
	    System.out.println("영어: " + eng);
	    System.out.println("수학: " + math);
	    System.out.println("총점: " + total);
	    System.out.println("평균: " + average );
	    
	    
	    
	    System.out.println("-----------------------");	    
	    System.out.println("문제 5");
	    // 문제 5
	    
	    int totalSeconds = 3726;
	    
	    int hour = totalSeconds / 3600;
	    
	    int minute = (totalSeconds % 3600) / 60;
	    
	    int seconds = totalSeconds % 60;
	    
	    System.out.println(hour + "시간: " + minute + "분: "  + seconds + "초: " );
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 6");
	    
	    int score = 72;
	    
	    if(score >= 60) {
	    	System.out.println("합격");
	    }else {
	    	System.out.println("불합격");
	    }
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 7");
	    
	    if(score >= 90) {
	    	System.out.println("A");
	    }else if (score >= 80) {
	    	System.out.println("B");
	    }else if (score >= 70) {
	    	System.out.println("C");
	    }else if (score >= 60) {
	    	System.out.println("D");
	    }else {
	    	System.out.println("F");
	    }
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 8");
	    
	    int n =10;
	    int sum = 0;
	    
	    for(int i = 1; i <= n; i++) {
	    	sum += i;
	    }
	    
	    System.out.println("1부터 " + n + "까치의 합 = " + sum);
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 9");
	    
	    int[] arr = {10,20,30,40,50};
	    int sum1 = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	    	sum1 += arr[i];
	    }
	    
	    int avg = sum1 / arr.length;
	    
	    System.out.println("총합: " + sum1);
	    System.out.println("평균: " + avg);
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 10");
	    
	    int[] scores = {87, 65, 92, 100, 74};
	    
	    int max = scores[0];
	    int min = scores[0];
	    
	    for(int i = 1; i < scores.length; i++) {
	    	if(scores[i] > max) {
	    		max = scores[i];
	    	}
	    	if(scores[i] < min) {
	    		min = scores[i];
	    	}
	    }
	    
	    System.out.println("최대값: " + max);
	    System.out.println("최소값: " + min);
	    
	    System.out.println("-----------------------");
	    System.out.println("문제 11");
	    
	    int[] nums = {3,8,15,22,7,10};
	    
	    int result1 = 0;
	    
	    for(int i = 0; i < nums.length; i++) {
	    	if(nums[i] % 2 == 0) { 
	    	result1 += nums[i];
	    }else {
	    	result1 -= nums[i];
	    }
	}  
	    System.out.println("result = " 
	                                + result);
	    System.out.println("-----------------------");
     }
  }

