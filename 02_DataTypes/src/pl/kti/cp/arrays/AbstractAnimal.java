package pl.kti.cp.arrays;

public abstract class AbstractAnimal implements IAnimal {
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

	public void eat(int foodAmount){
		_weight += foodAmount;
	}

}
