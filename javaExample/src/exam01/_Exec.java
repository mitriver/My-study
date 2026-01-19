package exam01;

import java.util.Scanner;

public class _Exec {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String strs ="";
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("주민번호 : ");
		String ssn = scanner.nextLine();
		System.out.print("나이 : ");
		String age = scanner.nextLine();
		strs = strs + "/" + name +","+ssn+","+age;
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("주민번호 : ");
		ssn = scanner.nextLine();
		System.out.print("나이 : ");
		age = scanner.nextLine();
		strs = strs + "/" + name +","+ssn+","+age;
		
		System.out.println(strs);
		strs = strs.substring(1);
		System.out.println(strs);
	}
}
