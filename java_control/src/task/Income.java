package task;

public class Income extends Transaction {
	public Income(int amount, String date, String memo) {
        super(amount, date, memo);
    }

    @Override
    public int apply(int balance) {
        return balance + amount;
    }
}

