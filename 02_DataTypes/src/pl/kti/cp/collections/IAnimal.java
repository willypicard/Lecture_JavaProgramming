package pl.kti.cp.collections;

public interface IAnimal extends Comparable<IAnimal> {
	public String getName();
	public int getWeight();
	
	public void shout();
	public void eat();	
	public void eat(int foodAmount);	
}
