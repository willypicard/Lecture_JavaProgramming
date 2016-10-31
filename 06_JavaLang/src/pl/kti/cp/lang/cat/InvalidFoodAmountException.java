package pl.kti.cp.lang.cat;

public class InvalidFoodAmountException extends Exception {
	private static final long serialVersionUID = -6336378012646637525L;

	private int _amount;

	public InvalidFoodAmountException(int amount) {
		super("A food amount of " + amount + " is invalid");
		_amount = amount;
	}

	public int getAmount() {
		return _amount;
	}
}