package pl.kti.cp.awt.layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDialog extends Dialog {
	private static final long serialVersionUID = -8723328761434206917L;

	public BorderLayoutDialog(Frame parent) {
		super(parent, "BorderLayout", true);
		initGUI();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				setVisible(false);
			}
		});
	}

	private void initGUI() {
		setLayout(new BorderLayout());
		setFont(new Font("Helvetica", Font.PLAIN, 14));

		add("North", new Button("North"));
		add("South", new Button("South"));
		add("East", new Button("East"));
		add("West", new Button("West"));
		add("Center", new Button("Center"));
	}
}