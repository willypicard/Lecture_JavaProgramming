package pl.kti.cp.example;

public class PrintBasketThread extends Thread {
	private IBasket _basket;

	private int _numberOfPrints;

	public PrintBasketThread(IBasket basket, int numberOfPrints) {
		_basket = basket;
		_numberOfPrints = numberOfPrints;
	}

	public void run() {
		try {
			while (_numberOfPrints != 0) {
				_basket.printProducts();
				_numberOfPrints--;
				sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}