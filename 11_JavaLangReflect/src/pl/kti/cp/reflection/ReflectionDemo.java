package pl.kti.cp.reflection;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		if (args.length != 2) {
			usage();
		}
		String animalName = args[0];
		String toDo = args[1];

//		IAnimal animal = null;
//		if (animalName.equals("Cat")) {
//			animal = new Cat();
//		} else {
////			if (animalName.equals("Student")) {
////				animal = new Student();
////			} else {
//			if (animalName.equals("Teacher")) {
//			animal = new Teacher();
//		} else {
//				animal = new Dog();
//			}
//		}
//		if (toDo.equals("beHappy")) {
//			animal.beHappy();
//		}
//		if (toDo.equals("shout")) {
//			animal.shout();
//		}

		 System.out.println("Running method " + toDo + " on animal "
		 + animalName);
		 System.out.println("");
		 try {
		 Class<?> c = Class.forName("pl.kti.cp.reflection." + animalName);
		 Object o = c.newInstance();
		 Class<?>[] paramTypes = new Class[]{};
		 Method method = c.getMethod(toDo, paramTypes);
		 Object[] params = new Object[] {};
		 method.invoke(o, params);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
	}

	private static void usage() {
		System.out.println("Usage: java pl.compProg.reflection <arg1> <arg2>");
		System.out.println("  arg1 = Cat | Dog");
		System.out.println("  arg2 = shout | beHappy");
		System.exit(0);
	}
}