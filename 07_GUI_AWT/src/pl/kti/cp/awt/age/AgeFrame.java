package pl.kti.cp.awt.age;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.Date;


public class AgeFrame extends Frame {
	private static final long serialVersionUID = -2977791584566230877L;

	private DatePanel _birthDatePanel;
	private Label _resultLabel;
	
	public AgeFrame(String title)  {
		super(title);
		initComponents();
		initGUI();
		addWindowListener(new ExitFrameListener());
	}
	
	private void initComponents(){
		_birthDatePanel = new DatePanel();
		_resultLabel = new Label("");
		_resultLabel.setAlignment(Label.CENTER);
		_resultLabel.setFont(new Font("Sans",Font.ITALIC,13));
	}
	
	private void initGUI(){
		setLayout(new BorderLayout(5, 5));
		
		Label label = new Label("Age in days calculator");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Sans",Font.BOLD,14));
		add(label, BorderLayout.NORTH);

		Panel mainPanel = new Panel();
		mainPanel.setLayout(new BorderLayout(2, 2));
		mainPanel.add(_birthDatePanel, BorderLayout.CENTER);
		mainPanel.add(_resultLabel, BorderLayout.SOUTH);
		add(mainPanel, BorderLayout.CENTER);

		Button btCalculate = new Button("Calculate");
		add(btCalculate, BorderLayout.SOUTH);
 
		ActionListener obserwator = new CalculateButtonListener(this);
		btCalculate.addActionListener(obserwator);
	}

	public Date getDate() throws InvalidDateException{
		return _birthDatePanel.getDate();
	}
	
	public void setResult(String result){
		_resultLabel.setText(result);
		pack();
	}
}
