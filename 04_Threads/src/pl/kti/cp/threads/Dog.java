package pl.kti.cp.threads;

public class Dog extends AbstractAnimal {
	public Dog(String name, int weight, int slimmingSpeed) {
		super(name, weight, slimmingSpeed);
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