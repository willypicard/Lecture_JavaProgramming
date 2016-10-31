package pl.kti.cp.awt.layouts;

import java.awt.*;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FlowLayoutDialog extends Dialog {
	private static final long serialVersionUID = -320844605871004182L;

	public FlowLayoutDialog(Frame parent){
		super(parent, "FlowLayout", true);
		initGUI();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				setVisible(false);
			}
		});
	}
	
	private void initGUI(){
	       setLayout(new FlowLayout());
	        setFont(new Font("Helvetica", Font.PLAIN, 14));

	        add(new Button("Button 1"));
	        add(new Button("2"));
	        add(new Button("Button 3"));
	        add(new Button("Long-Named Button 4"));
	        add(new Button("Button 5"));
	}
}
