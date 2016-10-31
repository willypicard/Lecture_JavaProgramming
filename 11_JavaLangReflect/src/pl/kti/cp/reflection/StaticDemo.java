package pl.kti.cp.reflection;

public class StaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String className = args[0];
		String methodName= args[1];
		
		System.out.println("Class: "+className);
		System.out.println("Method: "+methodName);
		
		if (className.equals("Cat")){
			Cat cat = new Cat();
			if (methodName.equals("shout")){
				cat.shout();
			} else {
				cat.beHappy();
			}
		}
		if (className.equals("Dog")){
			Dog dog = new Dog();
			if (methodName.equals("shout")){
				dog.shout();
			} else {
				dog.beHappy();
			}
			
		}
		
		// TODO Auto-generated method stub

	}

}
