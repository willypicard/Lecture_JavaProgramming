package pl.kti.cp.example;

public class Price implements IPrice {
	private float _zloty;

	private static ConversionRateThread _conversionRateThread;

	public Price(float zloty) throws NegativePriceException{
		_zloty = zloty;
		if (_conversionRateThread == null) {
			_conversionRateThread = new ConversionRateThread();
			_conversionRateThread.start();
		}
	}

	public float inEuro() {
		return _zloty *  _conversionRateThread.getConversionRate();
	}

	public float inZloty() {
		return _zloty;
	}

	public void add(IPrice price) {
		_zloty += price.inZloty();
	}

	public int compareTo(IPrice price) {
		return (int) (inZloty() - price.inZloty());
	}

	public String toString() {
		return inZloty() + "PLN-" + inEuro() + "EUR";
	}
}