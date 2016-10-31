package pl.kti.cp.swing.age;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class AgeFrame extends JFrame {
	private static final long serialVersionUID = -2814893164500601094L;
	
	private DatePanel _birthDatePanel;
	private JLabel _resultLabel;
	
	public AgeFrame(String title)  {
		super(title);
		initComponents();
		initGUI();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initComponents(){
		_birthDatePanel = new DatePanel();
		_resultLabel = new JLabel("");
		_resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		_resultLabel.setFont(new Font("Sans",Font.ITALIC,16));
	}
	
	private void initGUI(){
		getContentPane().setLayout(new BorderLayout(5, 5));
		
		JLabel label = new JLabel("Age in days calculator");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sans",Font.BOLD,18));
		getContentPane().add(label, BorderLayout.NORTH);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout(2, 2));
		mainPanel.add(_birthDatePanel, BorderLayout.CENTER);
		mainPanel.add(_resultLabel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel, BorderLayout.CENTER);

		JButton btCalculate = new JButton("Calculate");
		getContentPane().add(btCalculate, BorderLayout.SOUTH);

		btCalculate.addActionListener(new CalculateButtonListener(this));
	}

	public Date getDate() throws InvalidDateException{
		return _birthDatePanel.getDate();
	}
	
	public void setResult(String result){
		_resultLabel.setText("<html>"+result+"</html>");
		pack();
	}
}
