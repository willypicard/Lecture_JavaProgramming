package pl.kti.cp.collections;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ArrayOfAnimalsExample {

	public static void main(String[] args) {
		IAnimal[] myAnimals = { 
				new Cat("Garfield", 9000),
				new Cat("Felix", 1200),
				new Dog("Scooby", 7000) };

		for (int index = 0; index < myAnimals.length; index++) {
			System.out.print(myAnimals[index].getName() + " says ");
			myAnimals[index].shout();
		}
		
		List<IAnimal> animalList = Arrays.asList( myAnimals);
		print("The List of animals is the following:", animalList);
		
		Collections.shuffle(animalList);
		print("After shuffle:", animalList);
	
		Collections.sort(animalList);
		print("After sort by name:", animalList);

		Collections.sort(animalList, new AnimalWeightComparator());
		print("After sort by weight:", animalList);
	}

	private static void print(String message, List<IAnimal> animalList) {
		System.out.println(message);
		for (int i = 0; i< animalList.size(); i++){
			IAnimal animal = animalList.get(i);
			System.out.println("\tFound "+animal.getName()+"\t["+animal.getWeight()+"]");
		}
	}
}