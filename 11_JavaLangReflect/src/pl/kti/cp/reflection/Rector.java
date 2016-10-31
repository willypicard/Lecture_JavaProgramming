package pl.kti.cp.reflection;


public class Rector implements IAnimal {

	@Override
	public void beHappy() {
		System.out.println("Rector's happy");
	}

	@Override
	public void shout() {
		System.out.println("Silence....");
	}

}
