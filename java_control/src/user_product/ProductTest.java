package user_product;

public class ProductTest {

	public static void main(String[] args) {
		
		// Product 객체 생성
        Product p1 = new Product();

        // 상품 정보 저장
        p1.name = "콜라";
        p1.price = 1500;
        p1.category = "음료";
        p1.quantity = 10;

        // 상품 정보 출력
        p1.printInfo();
    }
}