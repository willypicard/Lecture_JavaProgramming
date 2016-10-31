package pl.kti.cp.basicDataTypes;

public class Shift {

	public static void main(String[] args) {
		Shift.printOperators(6, 2);
		Shift.printOperators(-6, 2);
	}

	public static void printOperators(int left, int right){
		System.out.println(left+" >> "+right +" = "+(left >> right));
		System.out.println(left+" >>> "+right +" = "+(left >>> right));
		System.out.println(left+" << "+right +" = "+(left << right));
	}
}
