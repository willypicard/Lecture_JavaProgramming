package pl.kti.cp.collections;

public class Cat extends AbstractAnimal {
	public Cat(String name, int weight){
		super(name,weight);
	}
	
	public void shout() {
		System.out.println("Meow");
	}

	public void eat() {
		eat(200);
	}
}
