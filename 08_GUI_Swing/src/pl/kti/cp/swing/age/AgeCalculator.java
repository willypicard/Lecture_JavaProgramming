package pl.kti.cp.swing.age;

import javax.swing.JFrame;

public class AgeCalculator {

	public static void main(String[] args) {
		JFrame frame = new AgeFrame("Age in days calculator");
//		frame.pack();
		frame.setSize(400,500);
		frame.setVisible(true);
	}
}