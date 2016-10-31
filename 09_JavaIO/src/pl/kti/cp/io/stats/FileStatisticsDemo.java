package pl.kti.cp.io.stats;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;

public class FileStatisticsDemo {

	public static void main(String[] args) throws IOException {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int chosenButton = fileChooser.showDialog(null, "Select");
		if (chosenButton == JFileChooser.CANCEL_OPTION) {
			System.out.println("Bye, bye!!!");
			System.exit(0);
		}
		File file = fileChooser.getSelectedFile();
		if (file != null && file.exists()) {
			FileStatistics stats = new FileStatistics(file);
			stats.initialize();
			Writer writer = new BufferedWriter(new OutputStreamWriter(System.out));
			stats.print(writer);
		}
		System.exit(0);
	}
}