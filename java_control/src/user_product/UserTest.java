package user_product;

public class UserTest {

	public static void main(String[] args) {
		
		// User 객체 생성
        User user1 = new User();

        // 사용자 정보 저장
        user1.name = "홍길동";
        user1.id = "hong123";
        user1.password = "1234";
        user1.phone = "010-1234-5678";

        // 사용자 정보 출력
        user1.printInfo();
    }
}
