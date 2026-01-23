package exam15;

import java.util.ArrayList;
import java.util.Scanner;

import exam28.ProductDTO;

public class Example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ProductDTO> items = new ArrayList<>();

        items.add(new ProductDTO("라면", 1000, 5));
        items.add(new ProductDTO("맥주", 5000, 3));
        items.add(new ProductDTO("소주", 5000, 2));

        while (true) {
            System.out.println("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):");

            String menu = sc.nextLine();

            if (menu.equals("0")) {
                System.out.println("-- 프로그램 종료 --");
                break;
            }

            // 1. 목록
            if (menu.equals("1")) {
                System.out.println("- 목록 -");

                for (int i = 0; i < items.size(); i++) {
                    ProductDTO item = items.get(i);

                    System.out.println("상품이름: " + item.getProductName());
                    System.out.println("가격: " + item.getProductPrice());
                    System.out.println("구매수량: " + item.getBuyCounter());
                    System.out.println();
                }

            }
            // 2. 등록
            else if (menu.equals("2")) {
                System.out.println("- 등록 -");

                System.out.print("상품이름: ");
                String productName = sc.nextLine();

                System.out.print("상품가격: ");
                int productPrice = Integer.parseInt(sc.nextLine());

                System.out.print("구매수량: ");
                int buyCounter = Integer.parseInt(sc.nextLine());

                items.add(new ProductDTO(productName, productPrice, buyCounter));

                System.out.println("등록 완료");

            }
            else if (menu.equals("3")) {
                System.out.println("- 수정 -");
            }
            else if (menu.equals("4")) {
                System.out.println("- 삭제 -");
            }
            else {
                System.out.println("잘못된 번호 입력");
            }
        }

        sc.close();
    }
}
