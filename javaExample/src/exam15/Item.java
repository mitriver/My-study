package exam15;

public class Item {

    String name;   // 상품 이름
    int price;     // 가격
    int count;     // 수량

    // 생성자
    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    // 상품 금액 계산
    public int getTotal() {
        return price * count;
    }
}