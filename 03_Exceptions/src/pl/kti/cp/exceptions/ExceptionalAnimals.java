package pl.kti.cp.exceptions;

public class ExceptionalAnimals {
	public static void main(String[] arguments){
		IAnimal felix = new Cat("Felix", 1200);
		
		felix.eat();
		

		try{
			int amount = 200;
			felix.eat(amount);
			
			amount = -10;
			felix.eat(amount);

			}catch(InvalidFoodAmountException e){
			System.err.println("You cannot feed felix with a food amount of "+e.getAmount());
			System.err.println("Exception message: "+e.getMessage());
			e.printStackTrace(System.err);
		}
	
	}
}
