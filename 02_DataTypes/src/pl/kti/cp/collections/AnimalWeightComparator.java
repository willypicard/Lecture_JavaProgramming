package pl.kti.cp.collections;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<IAnimal> {

	public int compare(IAnimal animal1, IAnimal animal2) {
		return animal1.getWeight() - animal2.getWeight();
	}

}
