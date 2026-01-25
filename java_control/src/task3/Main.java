package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Worker> workers = new ArrayList<>();
		ArrayList<Company> companies = new ArrayList<>();

		workers.add(new Worker("김철수", "A회사", 30, "010-1111-2222", "개발", "서울", "개발"));
		workers.add(new Worker("이영희", "B회사", 28, "010-3333-4444", "디자인", "부산", "디자인"));

		companies.add(new Company("ABC테크", "서울", "개발"));
		companies.add(new Company("디자인랩", "부산", "디자인"));

		while (true) {
			System.out.println("------------------------");
			System.out.println("1. 매칭");
			System.out.println("2. 회사조회");
			System.out.println("3. 정보수정");
			System.out.println("4. 종료");
			System.out.println("------------------------");
			System.out.print("메뉴 선택: ");

			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("------------------------");
				System.out.print("직장인 이름 입력: ");
				String name = sc.nextLine();

				boolean found = false;

				for (Worker w : workers) {
					if (w.name.equals(name)) {
						System.out.println("[매칭된 회사]");
						for (Company c : companies) {
							if (c.hireJob.equals(w.hopeJob)) {
								System.out.println(c.name);
							}
						}
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("해당 직장인이 없습니다.");
				}

			} else if (menu == 2) {
				System.out.print("회사명 입력: ");
				String name = sc.nextLine();

				boolean found = false;

				for (Company c : companies) {
					if (c.name.equals(name)) {
						System.out.println("회사명: " + c.name);
						System.out.println("지역: " + c.area);
						System.out.println("채용업무: " + c.hireJob);
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("해당 회사가 없습니다.");
				}

			} else if (menu == 3) {
				System.out.print("직장인 이름 입력: ");
				String name = sc.nextLine();

				boolean found = false;

				for (Worker w : workers) {
					if (w.name.equals(name)) {
						System.out.println("1. 소속");
						System.out.println("2. 나이");
						System.out.println("3. 연락처");
						System.out.println("4. 업무");
						System.out.println("5. 희망지역");
						System.out.println("6. 희망업무");
						System.out.print("선택: ");

						int choice = sc.nextInt();
						sc.nextLine();

						if (choice == 1)
							w.company = sc.nextLine();
						else if (choice == 2)
							w.age = sc.nextInt();
						else if (choice == 3)
							w.phone = sc.nextLine();
						else if (choice == 4)
							w.job = sc.nextLine();
						else if (choice == 5)
							w.hopeArea = sc.nextLine();
						else if (choice == 6)
							w.hopeJob = sc.nextLine();

						System.out.println("정보가 수정되었습니다.");
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("해당 직장인이 없습니다.");
				}

			} else if (menu == 4) {
				System.out.println("------------------------");
				System.out.println("프로그램 종료");
				System.out.println("------------------------");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

		sc.close();
	}
}
