package pl.kti.cp.reflection;


public class Student implements IAnimal{

	@Override
	public void beHappy() {
		// TODO Auto-generated method stub
		System.out.println("I passed!!!!");
		
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("Let's have a party!");
		
	}
	
	public void passAnExam(){
		System.out.println("Beeeerk!");
	}
}
