package pl.kti.cp.example;

public class ConversionRateThread extends Thread {
	private float _conversionRate = .24f;

	public ConversionRateThread() {
	}

	public void run() {
		try {
			while (true) {
				_conversionRate *= ((Math.random()-0.5) * .1f + 1);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public float getConversionRate(){
		return _conversionRate;
	}
}