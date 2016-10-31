package pl.kti.cp.collections;

public class Dog extends AbstractAnimal {
	public Dog(String name, int weight){
		super(name,weight);
	}
	
	public void shout() {
		System.out.println("Warf");
	}

	public void eat() {
		eat(800);
	}

}
