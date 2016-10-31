package pl.kti.cp.threads;

public class AnimalFeederThread extends CheckingAnimalThread {
	private int _initialWeight;

	public AnimalFeederThread(IAnimal animal, int periodicity) {
		super(animal, periodicity);
		_initialWeight = animal.getWeight();
	}

	public void run() {
		IAnimal animal = getAnimal();
		String animalName = animal.getName();
		System.out.println("Taking care of " + animalName);
		do {
			printAnimalState(animalName);
			feedAnimal();
			try {
				sleep(getPeriodicityInMilliseconds());
			} catch (InterruptedException e) {
				System.err.println("AnimalFeederThread for " + animalName
						+ " has been interrupted!");
				e.printStackTrace(System.err);
			}
		} while (getAnimal().isAlive());
		System.out.println(animalName + " is dead.");
		System.out.println("Please feed better your animal(s)!!!");
	}

	/**
	 *  
	 */
	private void feedAnimal() {
		int currentWeight = getAnimal().getWeight();
		if (currentWeight < (_initialWeight / 4) * 3) {
			try {
				getAnimal().eat(_initialWeight / 2);
				System.out.println(getAnimal().getName() + " has been fed ["
						+ currentWeight + " -> " + getAnimal().getWeight()
						+ "]");
			} catch (InvalidFoodAmountException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}