package pl.kti.cp.threads;

public class SlimmingAnimals {
	public static void main(String[] arguments) {
		IAnimal felix = new Cat("Felix", 1200, 100);
		IAnimal garfield = new Cat("Garfield", 3000, 200);
		IAnimal scooby = new Dog("Scooby", 7000, 300);

		Thread garfieldChecker = new CheckingAnimalThread(garfield, 5);
		Thread scoobyChecker = new CheckingAnimalThread(scooby, 12);
		Thread felixFeeder = new AnimalFeederThread(felix, 5);

		garfieldChecker.start();
		felixFeeder.start();
		scoobyChecker.start();
	}
}