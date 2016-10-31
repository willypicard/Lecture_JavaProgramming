package pl.kti.cp.net.URLs;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class RFCViewer extends JFrame {
	private static final long serialVersionUID = 253442279394449374L;

	private JTextArea _textArea;

	private JButton _btChooseRFC;

	public RFCViewer() {
		super("RFC Viewer");
		initGUI();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(5, 5));

		JLabel lbTitle = new JLabel("RFC Viewer");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
		getContentPane().add(lbTitle, BorderLayout.NORTH);

		_textArea = new JTextArea(20, 80);
		_textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
		JScrollPane scroll = new JScrollPane(_textArea);

		getContentPane().add(scroll, BorderLayout.CENTER);

		_btChooseRFC = new JButton("Choose RFC");
		_btChooseRFC.addActionListener(new ChooseRFCActionListener(this));
		getContentPane().add(_btChooseRFC, BorderLayout.SOUTH);
	}

	public void displayRFC(String rfc) {
		_textArea.setText(rfc);
		_textArea.setCaretPosition(0);
	}

	public void setBusy(boolean busy) {
		_btChooseRFC.setEnabled(!busy);
		if (busy) {
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			_textArea.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		} else {
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			_textArea.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		}
	}
}