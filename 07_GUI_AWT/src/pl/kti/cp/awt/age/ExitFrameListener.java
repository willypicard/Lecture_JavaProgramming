package pl.kti.cp.awt.age;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class ExitFrameListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
