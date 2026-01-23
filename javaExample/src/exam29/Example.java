package exam29;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();

        while (true) {
            System.out.println("선택(0:종료, 1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제):");
            String menu = sc.nextLine();

            // 종료
            if (menu.equals("0")) {
                System.out.println("프로그램 종료");
                break;
            }

            // 1. 목록
            if (menu.equals("1")) {
                System.out.println("- 회원 목록 -");

                for (int i = 0; i < members.size(); i++) {
                    System.out.println((i + 1) + ". " + members.get(i).id);
                }

            }
            // 2. 상세보기
            else if (menu.equals("2")) {
                System.out.print("조회할 회원 번호: ");
                int index = Integer.parseInt(sc.nextLine()) - 1;

                if (index >= 0 && index < members.size()) {
                    Member m = members.get(index);
                    System.out.println("아이디: " + m.id);
                    System.out.println("이름: " + m.name);
                    System.out.println("연락처: " + m.phone);
                    System.out.println("주소: " + m.address);
                } else {
                    System.out.println("잘못된 번호입니다.");
                }

            }
            // 3. 등록
            else if (menu.equals("3")) {
                System.out.println("- 회원 등록 -");

                System.out.print("아이디: ");
                String id = sc.nextLine();

                System.out.print("비밀번호: ");
                String pw = sc.nextLine();

                System.out.print("이름: ");
                String name = sc.nextLine();

                System.out.print("연락처: ");
                String phone = sc.nextLine();

                System.out.print("주소(대전/서울/충남): ");
                String address = sc.nextLine();

                members.add(new Member(id, pw, name, phone, address));
                System.out.println("회원 등록 완료");

            }
            // 4. 수정
            else if (menu.equals("4")) {
                System.out.print("수정할 회원 번호: ");
                int index = Integer.parseInt(sc.nextLine()) - 1;

                if (index >= 0 && index < members.size()) {
                    Member m = members.get(index);

                    System.out.print("새 연락처: ");
                    m.phone = sc.nextLine();

                    System.out.print("새 주소: ");
                    m.address = sc.nextLine();

                    System.out.println("수정 완료");
                } else {
                    System.out.println("잘못된 번호입니다.");
                }

            }
            // 5. 삭제
            else if (menu.equals("5")) {
                System.out.print("삭제할 회원 번호: ");
                int index = Integer.parseInt(sc.nextLine()) - 1;

                if (index >= 0 && index < members.size()) {
                    members.remove(index);
                    System.out.println("삭제 완료");
                } else {
                    System.out.println("잘못된 번호입니다.");
                }

            } else {
                System.out.println("잘못된 메뉴 선택");
            }
        }

        sc.close();
    }
}
