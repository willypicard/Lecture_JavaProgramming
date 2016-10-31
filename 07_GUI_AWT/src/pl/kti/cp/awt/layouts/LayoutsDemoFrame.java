package pl.kti.cp.awt.layouts;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pl.kti.cp.awt.age.ExitFrameListener;

public class LayoutsDemoFrame extends Frame {
	private static final long serialVersionUID = 4475790884745507761L;

	private Button _btFlow;

	private Button _btGrid;

	private Button _btBorder;

	private Button _btCard;

	private Button _btGridBag;

	public LayoutsDemoFrame() {
		super("LayoutManager Demo");
		initGUI();
		addWindowListener(new ExitFrameListener());
	}

	private void initGUI() {
		setLayout(new FlowLayout());

		initButtons();

		addButtons();
}

	private void initButtonListeners() {
		_btFlow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog layoutDialog = new FlowLayoutDialog(LayoutsDemoFrame.this);
				layoutDialog.pack();
				layoutDialog.setVisible(true);
			}
		});
		_btGrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog layoutDialog = new GridLayoutDialog(LayoutsDemoFrame.this);
				layoutDialog.pack();
				layoutDialog.setVisible(true);
			}
		});
		_btBorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog layoutDialog = new BorderLayoutDialog(LayoutsDemoFrame.this);
				layoutDialog.pack();
				layoutDialog.setVisible(true);
			}
		});
		_btCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog layoutDialog = new CardLayoutDialog(LayoutsDemoFrame.this);
				layoutDialog.pack();
				layoutDialog.setVisible(true);
			}
		});
		_btGridBag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog layoutDialog = new GridBagLayoutDialog(LayoutsDemoFrame.this);
				layoutDialog.pack();
				layoutDialog.setVisible(true);
			}
		});
	}

	private void addButtons() {
		add(_btFlow);
		add(_btGrid);
		add(_btBorder);
		add(_btCard);
		add(_btGridBag);
	}

	private void initButtons() {
		_btFlow = new Button("FlowLayout");
		_btGrid = new Button("GridLayout");
		_btBorder = new Button("BorderLayout");
		_btCard = new Button("CardLayout");
		_btGridBag = new Button("GridBagLayout");

		initButtonListeners();
}
}