package pl.kti.cp.awt.age;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePanel extends Panel {
	private static final long serialVersionUID = 2900253690807586207L;

	private TextField _tfDay;

	private TextField _tfMonth;

	private TextField _tfYear;

	public DatePanel() {
		initializeComponents();
		initializeGUI();
	}

	private void initializeComponents() {
		_tfDay = new TextField();
		_tfMonth = new TextField();
		_tfYear = new TextField();
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