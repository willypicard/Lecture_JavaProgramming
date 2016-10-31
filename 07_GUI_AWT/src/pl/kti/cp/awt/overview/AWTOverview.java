package pl.kti.cp.awt.overview;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pl.kti.cp.awt.age.ExitFrameListener;

public class AWTOverview {
	private Frame _frame;

	public AWTOverview() {
		initGUI();
	}

	private void initGUI() {
		Panel mainPanel = new Panel();
		mainPanel.setLayout(new GridLayout(0, 2, 5, 2));

		mainPanel.add(new Label("Label"));
		mainPanel.add(new Label("I'm a label!"));

		mainPanel.add(new Label("Button"));
		mainPanel.add(new Button("I'm a button"));

		mainPanel.add(new Label("TextField"));
		mainPanel.add(new TextField());

		mainPanel.add(new Label("TextArea"));
		mainPanel.add(new TextArea(2, 20));

		mainPanel.add(new Label("Checkbox"));
		mainPanel.add(new Checkbox("I'm a checkbox"));

		mainPanel.add(new Label("List"));
		List aList = new List(2);
		aList.add("Monday");
		aList.add("Tuesday");
		aList.add("Wednesday");
		aList.add("Thursday");
		aList.add("Friday");
		aList.add("Saturday");
		aList.add("Sunday");
		mainPanel.add(aList);

		mainPanel.add(new Label("Choice"));
		Choice aChoice = new Choice();
		aChoice.add("Green");
		aChoice.add("Red");
		aChoice.add("Blue");
		mainPanel.add(aChoice);

		mainPanel.add(new Label("Scrollbar"));
		Scrollbar aBar = new Scrollbar(Scrollbar.HORIZONTAL);
		mainPanel.add(aBar);

		ScrollPane scroll = new ScrollPane();
		scroll.add(mainPanel);

		_frame = new Frame();
		_frame.setLayout(new BorderLayout());

		_frame.add(scroll, BorderLayout.CENTER);

		MenuBar mb = createMenuBar();
		_frame.setMenuBar(mb);

		_frame.addWindowListener(new ExitFrameListener());
	}

	private MenuBar createMenuBar() {
		//		Set up the menu bar.
		MenuBar mb = new MenuBar();
		Menu m = new Menu("Menu");
		m.add(new MenuItem("Menu item 1"));
		m.add(new CheckboxMenuItem("Menu item 2"));
		m.add(new MenuItem("Menu item 3"));
		m.add(new MenuItem("-"));

		MenuItem fileMenuItem = new MenuItem("File Dialog ...");
		fileMenuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				//The only action event we get is when the
				//user requests we bring up a FileDialog.
				FileDialog fd = new FileDialog(_frame, "FileDialog");
				fd.setVisible(true);
			}
		});
		m.add(fileMenuItem);

		m.add(new MenuItem("-"));

		MenuItem exitMenuItem = new MenuItem("Exit");
		exitMenuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		m.add(exitMenuItem);

		mb.add(m);
		return mb;
	}

	public void show() {
		_frame.pack();
		_frame.setVisible(true);
	}

	public static void main(String[] args) {
		AWTOverview overview = new AWTOverview();
		overview.show();
	}
}