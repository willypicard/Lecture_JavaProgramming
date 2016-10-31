package pl.kti.cp.net.URLs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ChooseRFCActionListener implements ActionListener {
	private RFCViewer _rfcViewer;

	public ChooseRFCActionListener(RFCViewer rfcViewer) {
		_rfcViewer = rfcViewer;
	}

	public void actionPerformed(ActionEvent e) {
		_rfcViewer.setBusy(true);
		final String rfcNumber = JOptionPane.showInputDialog(_rfcViewer,
				"Please enter the RFC number");
		readAndDisplayRFC(rfcNumber);
	}

	private void readAndDisplayRFC(final String rfcNumber) {
		Thread t = new Thread() {
			public void run() {
				RFCReader rfcReader = new RFCReader(rfcNumber);
				final String rfcContents = rfcReader.getContents();
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						_rfcViewer.displayRFC(rfcContents);
						_rfcViewer.setBusy(false);
					}
				});

			}
		};
		t.start();

	}

}