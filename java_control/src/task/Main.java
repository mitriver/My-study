package task;

public class Main {

	public static void main(String[] args) {
		 int balance = 0; // 처음 잔액 수

	        Transaction[] transactions = {
	            new Income(1000000, "2026-01-15", "월급"),
	            new Expense(20000, "2026-01-15", "점심 식사"),
	            new Transfer(300000, "2026-01-16", "적금 이체"),
	            new Income(50000, "2026-01-16", "용돈"),
	            new Expense(1500, "2026-01-16", "차")
	        };

	        for (Transaction t : transactions) {
	            t.print();
	            balance = t.apply(balance);
	            System.out.println("현재 잔액: " + balance + "원");
	            System.out.println("----------------------");
	        }

	        System.out.println("최종 잔액: " + balance + "원");
	}

}

