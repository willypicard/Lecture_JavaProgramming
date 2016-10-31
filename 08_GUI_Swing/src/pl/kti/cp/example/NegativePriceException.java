package pl.kti.cp.example;


public class NegativePriceException extends Exception {
	private static final long serialVersionUID = 2453244685311762994L;
	
	private float _negativePrice;
	
	public NegativePriceException(float negativePrice){
		super("A price with value "+negativePrice+" is incorrect");
		_negativePrice = negativePrice;
	}
	
	public float getPrice(){
		return _negativePrice;
	}
}
