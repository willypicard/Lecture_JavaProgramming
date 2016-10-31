package pl.kti.cp.lang.cat;

import java.util.HashMap;
import java.util.Map;



public class CatExample {

	public static void main(String[] args) {
		IAnimal felix = new Cat("Felix", 1200, 100);
		IAnimal garfield = new Cat("Garfield", 3000, 200);
		IAnimal myCat = new Cat("Felix", 1200, 100);
		
		System.out.println("Felix hash code: "+felix.hashCode());
		System.out.println("Garfield hash code: "+garfield.hashCode());
		System.out.println("MyCat hash code: "+myCat.hashCode());

		System.out.println("Felix equals Garfield: "+felix.equals(garfield));
		System.out.println("Felix equals MyCat: "+felix.equals(myCat));
		
		System.out.println("Felix == MyCat: "+(felix == myCat));
		
		Map<IAnimal, String> myAnimals = new HashMap<IAnimal, String>();
		myAnimals.put(felix, "Felix is nice");
		myAnimals.put(garfield, "Garfield is cool");
		
		String animalMessage = (String) myAnimals.get(new Cat("Felix", 1200, 100));
		System.out.println("Message: "+animalMessage);
	}
}
