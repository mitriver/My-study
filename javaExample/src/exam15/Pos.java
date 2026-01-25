package exam15;

import java.util.ArrayList;
import java.util.List;

public class Pos {

    public static void main(String[] args) {

        // 상품 목록
        List<Item> items = new ArrayList<Item>();

        // 상품 추가
        items.add(new Item("라면", 1000, 5));
        items.add(new Item("맥주", 5000, 3));
        items.add(new Item("소주", 5000, 2));

        System.out.println("영수증");

        int sum = 0;  // 총합

        // 영수증 출력
        for (int i = 0; i < items.size(); i++) {

            Item item = items.get(i);

            int total = item.getTotal();
            sum = sum + total;

            System.out.println(
                item.name + " " +
                item.price + " " +
                item.count + " " +
                total
            );
        }

        System.out.println("------------------------");
        System.out.println("합계: " + sum);
   
    }
}