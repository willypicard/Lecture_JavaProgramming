package pl.kti.cp.awt.layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GridLayoutDialog extends Dialog {
	private static final long serialVersionUID = -2070331861225669831L;

	public GridLayoutDialog(Frame parent){
		super(parent, "GridLayout", true);
		initGUI();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				setVisible(false);
			}
		});
	}
	
	private void initGUI(){
	       setLayout(new GridLayout(0,2));
	        setFont(new Font("Helvetica", Font.PLAIN, 14));

	        add(new Button("Button 1"));
	        add(new Button("2"));
	        add(new Button("Button 3"));
	        add(new Button("Long-Named Button 4"));
	        add(new Button("Button 5"));
	}
}
