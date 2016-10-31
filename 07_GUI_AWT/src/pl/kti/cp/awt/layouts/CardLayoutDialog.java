package pl.kti.cp.awt.layouts;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDialog extends Dialog {
	private static final long serialVersionUID = -7680496226080647202L;

	private Panel cards;
    final static String BUTTONPANEL = "Panel with Buttons";
    final static String TEXTPANEL = "Panel with TextField";

	public CardLayoutDialog(Frame parent) {
		super(parent, "CardLayout", true);
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

	        //Put the Choice in a Panel to get a nicer look.
	        Panel cp = new Panel();
	        Choice c = new Choice();
	        c.addItem(BUTTONPANEL);
	        c.addItem(TEXTPANEL);
	        cp.add(c);
	        c.addItemListener(new ItemListener(){
	        	public void itemStateChanged(ItemEvent e) {
	        		String panelName = (String) e.getItem();
					((CardLayout)cards.getLayout()).show(cards,panelName);
				}
	        });

	        add(cp, BorderLayout.NORTH);

	        cards = new Panel();
	        cards.setLayout(new CardLayout());
	        cards.setBackground(Color.YELLOW);	
	   
	        Panel p1 = new Panel();
	        p1.add(new Button("Button 1"));
	        p1.add(new Button("Button 2"));
	        p1.add(new Button("Button 3"));

	        Panel p2 = new Panel();
	        p2.add(new TextField("TextField", 20));

	        cards.add(BUTTONPANEL, p1);
	        cards.add(TEXTPANEL, p2);
	        add(cards, BorderLayout.CENTER);
	}
}