package user_product;

public class Product {

	// 상품 정보 변수들
    String name;      // 상품명
    int price;        // 상품 가격
    String category;  // 카테고리
    int quantity;     // 수량

    // 상품 정보 출력 메서드
    void printInfo() {
        System.out.println("상품명 : " + name);
        System.out.println("가격 : " + price + "원");
        System.out.println("카테고리 : " + category);
        System.out.println("수량 : " + quantity + "개");
    }
}

	



