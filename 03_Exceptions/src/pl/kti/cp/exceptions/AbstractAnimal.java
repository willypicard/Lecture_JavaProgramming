package pl.kti.cp.exceptions;

public abstract class AbstractAnimal implements IAnimal, Comparable<IAnimal> {
	private String _name;
	private int _weight;
	
	public AbstractAnimal(String name, int weight){
		_name = name;
		_weight = weight;
	}
	
	public String getName() {
		return _name;
	}

	public int getWeight() {
		return _weight;
	}

	public void eat(int foodAmount) throws InvalidFoodAmountException{
		if (foodAmount < 0){
			throw new InvalidFoodAmountException(foodAmount);
		}
		_weight += foodAmount;
		}

	public int compareTo(IAnimal animal) {
		return getName().compareTo(animal.getName());
	}
}
