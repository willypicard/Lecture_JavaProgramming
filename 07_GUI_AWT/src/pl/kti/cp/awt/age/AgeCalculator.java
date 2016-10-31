package pl.kti.cp.awt.age;

import java.awt.Frame;

public class AgeCalculator {

	public static void main(String[] args) {
		Frame frame = new AgeFrame("Age in days calculator");
		frame.pack();
		frame.setVisible(true);
	}
}