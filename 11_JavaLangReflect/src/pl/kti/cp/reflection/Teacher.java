package pl.kti.cp.reflection;


public class Teacher implements IAnimal {

	@Override
	public void beHappy() {
		System.out.println("You know what? I'm happy...");
	}

	@Override
	public void shout() {
		System.out.println("Whatever");
	}

}
