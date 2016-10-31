package pl.kti.cp.threads;

public abstract class AbstractAnimal implements IAnimal, Comparable<IAnimal> {
	private String _name;

	private int _weight;

	private int _slimmingSpeed; // weight lost by second

	public AbstractAnimal(String name, int weight, int slimmingSpeed) {
		_name = name;
		_weight = weight;
		_slimmingSpeed = slimmingSpeed;
		Thread slimmingThread = new SlimmingThread();
		slimmingThread.start();
	}

	public String getName() {
		return _name;
	}

	public int getWeight() {
		return _weight;
	}

	public int getSlimSpeed() {
		return _slimmingSpeed;
	}

	public void eat(int foodAmount) throws InvalidFoodAmountException {
		if (foodAmount < 0) {
			throw new InvalidFoodAmountException(foodAmount);
		}
		_weight += foodAmount;
	}

	public int compareTo(IAnimal animal) {
		return getName().compareTo(animal.getName());
	}

	public boolean isAlive() {
		return _weight > 0;
	}

	private class SlimmingThread extends Thread {
		public void run() {
			while (_weight > 0) {
				_weight -= getSlimSpeed();
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					System.err
							.println("The slimming thread has been interrupted!");
					e.printStackTrace(System.err);
				}
			}
		}
	}
}