package pl.kti.cp.exceptions;

public interface IAnimal {
	public String getName();
	public int getWeight();
	
	public void shout();
	public void eat();	
	public void eat(int foodAmount) throws InvalidFoodAmountException;	
}
