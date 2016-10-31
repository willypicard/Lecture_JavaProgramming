package pl.kti.cp.threads;

public class InvalidFoodAmountException extends Exception {
	private static final long serialVersionUID = -7635506013418411249L;

	private int _amount;

	public InvalidFoodAmountException(int amount) {
		super("A food amount of " + amount + " is invalid");
		_amount = amount;
	}

	public int getAmount() {
		return _amount;
	}
}