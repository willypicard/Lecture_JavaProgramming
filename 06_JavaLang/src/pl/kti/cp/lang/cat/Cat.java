package pl.kti.cp.lang.cat;

public class Cat extends AbstractAnimal {
	public Cat(String name, int weight, int slimmingSpeed) {
		super(name, weight, slimmingSpeed);
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