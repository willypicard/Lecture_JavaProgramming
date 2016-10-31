package pl.kti.cp.awt.layouts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayoutDialog extends Dialog {
	private static final long serialVersionUID = -5376265392475190339L;

	public GridBagLayoutDialog(Frame parent) {
		super(parent, "GridBagLayout", true);
		initGUI();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				setVisible(false);
			}
		});
	}

	protected void makeButton(String name, GridBagLayout gridbag,
			GridBagConstraints c) {
		Button button = new Button(name);
		gridbag.setConstraints(button, c);
		add(button);
	}

	private void initGUI() {
		GridBagLayout gridbag = new GridBagLayout();

		GridBagConstraints c = new GridBagConstraints();

		setFont(new Font("SansSerif", Font.PLAIN, 14));
		setLayout(gridbag);

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		makeButton("Button1", gridbag, c);
		makeButton("Button2", gridbag, c);
		makeButton("Button3", gridbag, c);

		c.gridwidth = GridBagConstraints.REMAINDER; //end
																			  // of
		// row
		makeButton("Button4", gridbag, c);

		c.weightx = 0.0; //reset to the default
		makeButton("Button5", gridbag, c); //another row

		c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last
		makeButton("Button6", gridbag, c);

		c.gridwidth = GridBagConstraints.REMAINDER; //end
																			  // of
		// row
		makeButton("Button7", gridbag, c);

		c.gridwidth = 1; //reset to the default
		c.gridheight = 2;
		c.weighty = 1.0;
		makeButton("Button8", gridbag, c);

		c.weighty = 0.0; //reset to the default
		c.gridwidth = GridBagConstraints.REMAINDER; //end
																			  // of
		// row
		c.gridheight = 1; //reset to the default
		makeButton("Button9", gridbag, c);
		makeButton("Button10", gridbag, c);
	}
}