package pl.kti.cp.example;


public class NegativePriceException extends Exception {
	private static final long serialVersionUID = -3856148037383479818L;

	private float _negativePrice;
	
	public NegativePriceException(float negativePrice){
		super("A price with value "+negativePrice+" is incorrect");
		_negativePrice = negativePrice;
	}
	
	public float getPrice(){
		return _negativePrice;
	}
}
