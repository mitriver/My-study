package task;

public class Transfer extends Transaction {

    public Transfer(int amount, String date, String memo) {
        super(amount, date, memo);
    }

    @Override
    public int apply(int balance) {
        // 이체는 상황에 따라 증가/감소 가능
        // 예시에서는 감소로 처리
        return balance - amount;
    }
}
