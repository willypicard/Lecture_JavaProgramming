package pl.kti.cp.swing.age;

import java.awt.GridLayout;
import java.awt.Label;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class DatePanel extends JPanel {
	private static final long serialVersionUID = -2947070541835595670L;

	private JTextField _tfDay;

	private JTextField _tfMonth;

	private JTextField _tfYear;

	public DatePanel() {
		initializeComponents();
		initializeGUI();
	}

	private void initializeComponents() {
		_tfDay = new JTextField();
		_tfMonth = new JTextField();
		_tfYear = new JTextField();
	}

	private void initializeGUI() {
		setLayout(new GridLayout(3, 2));
		add(new Label("Day: "));
		add(_tfDay);
		add(new Label("Month: "));
		add(_tfMonth);
		add(new Label("Year: "));
		add(_tfYear);
	}

	private String getDay() {
		return _tfDay.getText();
	}

	private String getMonth() {
		return _tfMonth.getText();
	}

	private String getYear() {
		return _tfYear.getText();
	}

	public Date getDate() throws InvalidDateException {
		String dateAsString = getDay() + " " + getMonth() + " " + getYear();
		DateFormat parser = new SimpleDateFormat("dd MM yyyy");
		parser.setLenient(false);
		try {
			Date myDate = parser.parse(dateAsString);
			return myDate;
		} catch (ParseException e) {
			throw new InvalidDateException(dateAsString
					+ " is not a valid date");
		}
	}

}