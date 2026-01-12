package user_product;

public class User {


    // 사용자 정보 변수
    String name;
    String id;
    String password;
    String phone;

    // 사용자 정보 출력 메서드
    void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("전화번호 : " + phone);
    }
}


