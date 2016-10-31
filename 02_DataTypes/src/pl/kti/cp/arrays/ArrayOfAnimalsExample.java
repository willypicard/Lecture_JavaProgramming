package pl.kti.cp.arrays;

public class ArrayOfAnimalsExample {

	public static void main(String[] args) {
		IAnimal[] myAnimals = { 
				new Cat("Felix", 1200),
				new Cat("Garfield", 5000),
				new Dog("Scooby", 7000) };

		for (int index = 0; index < myAnimals.length; index++) {
			System.out.print(myAnimals[index].getName() + " says ");
			myAnimals[index].shout();
		}
	}
}