package pl.kti.cp.lang.cat;


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




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		result = prime * result + _weight;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractAnimal other = (AbstractAnimal) obj;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		if (_weight != other._weight)
			return false;
		return true;
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

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
//		result = prime * result + _weight;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AbstractAnimal other = (AbstractAnimal) obj;
//		if (_name == null) {
//			if (other._name != null)
//				return false;
//		} else if (!_name.equals(other._name))
//			return false;
//		if (_weight != other._weight)
//			return false;
//		return true;
//	}

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