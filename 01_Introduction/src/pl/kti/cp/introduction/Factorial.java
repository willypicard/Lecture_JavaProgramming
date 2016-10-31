package pl.kti.cp.introduction;

public class Factorial {
	public static int iteration(int n) {
		if (n == 0)
			return 1;
		int factorial = 1;
		for (int i = 1; i < n + 1; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static int recursion(int n) {
		if (n == 0)
			return 1;
		return n * recursion(n - 1);
	}

	public static void printFactorialIteration(int n) {
		System.out.println("Factorial " + n + "=" + Factorial.iteration(n));
	}

	public static void printFactorialRecursion(int n) {
		System.out.println("Factorial " + n + "=" + Factorial.recursion(n));
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			Factorial.printFactorialIteration(i);
		}
		System.out.println("==================");
		for (int i = 0; i < 4; i++) {
			Factorial.printFactorialRecursion(i);
		}
	}
}