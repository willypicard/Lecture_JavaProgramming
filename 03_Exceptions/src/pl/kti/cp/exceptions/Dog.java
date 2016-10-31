package pl.kti.cp.exceptions;

public class Dog extends AbstractAnimal {
	public Dog(String name, int weight) {
		super(name, weight);
	}

	public void shout() {
		System.out.println("Warf");
	}

	public void eat() {
		try {
			eat(800);
		} catch (InvalidFoodAmountException e) {
		}
	}
}