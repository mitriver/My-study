package exam07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();

		while (true) {
			System.out.print("이름(종료 = q): ");
			String name = sc.nextLine();

			if (name.toUpperCase().equals("Q")) {
				break;
			}

			System.out.print("국어: ");
			String kor_ = sc.nextLine();

			System.out.print("영어: ");
			String eng_ = sc.nextLine();

			System.out.print("수학: ");
			String mat_ = sc.nextLine();

			int kor = Integer.parseInt(kor_);
			int eng = Integer.parseInt(eng_);
			int mat = Integer.parseInt(mat_);

			Student student = new Student(name, kor, eng, mat);

			students.add(student);  
		}

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < students.size(); i++) {
			students.get(i).display();   
		}
	}
}

