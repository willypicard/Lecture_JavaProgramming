package pl.kti.cp.threads;

public class CheckingAnimalThread extends Thread {
	private IAnimal _animal;

	private int _periodicity;

	public CheckingAnimalThread(IAnimal animal, int periodicity) {
		_animal = animal;
		_periodicity = periodicity;
	}

	public IAnimal getAnimal() {
		return _animal;
	}

	public int getPeriodicityInMilliseconds() {
		return _periodicity * 1000;
	}

	public void run() {
		String animalName = _animal.getName();
		System.out.println("Checking " + animalName);
		do {
			printAnimalState(animalName);
			try {
				sleep(getPeriodicityInMilliseconds());
			} catch (InterruptedException e) {
				System.err.println("CheckingAnimalThread for " + animalName
						+ " has been interrupted!");
				e.printStackTrace(System.err);
			}
		} while (_animal.isAlive());
		System.out.println("+++++ " + animalName + " is dead.");
		System.out.println("+++++ Please feed your animal(s)!!!");
	}

	protected void printAnimalState(String animalName) {
		System.out.print(animalName + "'s weight is " + _animal.getWeight());
		if (_animal.isAlive()) {
			System.out.println(" [alive]");
		} else {
			System.out.println(" [dead]");
		}
	}
}