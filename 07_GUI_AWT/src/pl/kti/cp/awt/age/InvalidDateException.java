package pl.kti.cp.awt.age;


public class InvalidDateException extends Exception{
	private static final long serialVersionUID = 3504785524477547569L;

	public InvalidDateException(String message){
		super(message);
	}
	
	public InvalidDateException(){
		super();
	}
}
