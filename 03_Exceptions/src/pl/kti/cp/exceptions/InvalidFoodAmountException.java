package pl.kti.cp.exceptions;

public class InvalidFoodAmountException extends Exception {
	private static final long serialVersionUID = -3180257843095061841L;

	private int _amount;
	
	public InvalidFoodAmountException(int amount) {
		super("A food amount of "+amount+" is invalid");
		_amount = amount;
	}

	public int getAmount(){
		return _amount;
	}
}
