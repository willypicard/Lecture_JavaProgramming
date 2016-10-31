package pl.kti.cp.swing.age;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class CalculateButtonListener implements ActionListener {
	private AgeFrame _frame;
	
	public CalculateButtonListener(AgeFrame frame) {
		_frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		Date date;
		try {
			date = _frame.getDate();
			long birth = date.getTime();
			long today = System.currentTimeMillis();
			long ageInMillis = today - birth;
			long ageInDays = ageInMillis / (1000 * 60 * 60 * 24);
			_frame.setResult("You are living since <b>" + ageInDays
					+ "</b> days!!!");
		} catch (InvalidDateException exc){
			_frame.setResult(exc.getMessage());
		}
	}
}
