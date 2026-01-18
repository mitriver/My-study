package task;

public abstract class Transaction {
	protected int amount;   // 금액
    protected String date;  // 날짜
    protected String memo;  // 메모

    public Transaction(int amount, String date, String memo) {
        this.amount = amount;
        this.date = date;
        this.memo = memo;
    }

    // 잔액 처리 방식 
    public abstract int apply(int balance);

    // 공통 출력용
    public void print() {
        System.out.println(
            "[" + date + "] " + memo + " : " + amount + "원"
        );
    }
}

