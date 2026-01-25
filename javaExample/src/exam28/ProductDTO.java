package exam28;

public class ProductDTO {

    private String productName;
    private int productPrice;
    private int buyCounter;
    private int total;

    // 생성자
    public ProductDTO(String productName, int productPrice, int buyCounter) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.buyCounter = buyCounter;
        this.total = productPrice * buyCounter;
    }

    // getter & setter
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
        this.total = this.productPrice * this.buyCounter; // 값 변경 시 total 재계산
    }

    public int getBuyCounter() {
        return buyCounter;
    }

    public void setBuyCounter(int buyCounter) {
        this.buyCounter = buyCounter;
        this.total = this.productPrice * this.buyCounter; // 값 변경 시 total 재계산
    }

    public int getTotal() {
        return total;
    }
}

