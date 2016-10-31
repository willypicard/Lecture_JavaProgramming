package pl.kti.cp.threads;

public interface IAnimal {
	public String getName();

	public int getWeight();

	public void shout();

	public void eat();

	public void eat(int foodAmount) throws InvalidFoodAmountException;

	public boolean isAlive();

	public int getSlimSpeed();
}