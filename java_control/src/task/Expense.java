package task;

public class Expense extends Transaction {
	 public Expense(int amount, String date, String memo) {
	        super(amount, date, memo);
	    }

	    @Override
	    public int apply(int balance) {
	        return balance - amount;
	    }
	}
