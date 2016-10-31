package pl.kti.cp.exceptions;

public class Cat extends AbstractAnimal {
	public Cat(String name, int weight) {
		super(name, weight);
	}

	public void shout() {
		System.out.println("Meow");
	}

	public void eat() {
		try {
			eat(200);
		} catch (InvalidFoodAmountException e) {
		}
	}
}