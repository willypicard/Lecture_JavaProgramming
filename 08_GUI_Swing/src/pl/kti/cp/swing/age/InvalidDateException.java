package pl.kti.cp.swing.age;


public class InvalidDateException extends Exception{
	private static final long serialVersionUID = -2830966219415061609L;

	public InvalidDateException(String message){
		super(message);
	}
	
	public InvalidDateException(){
		super();
	}
}
