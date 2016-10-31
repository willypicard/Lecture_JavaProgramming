package pl.kti.cp.io.files;

import java.io.*;

import javax.swing.JFileChooser;


public class FileReaderDemo {
	
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
			System.out.println("File "+file.getAbsolutePath());
			System.out.println("===============  Begin ================");
			print(file);
			System.out.println("===============  END ================");
		} else {
			System.out.println("Chosen file does not exist!");
			main(args);
		}
		System.exit(0);
	}
	
	private static void print(File file) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		
		while ((line= reader.readLine()) != null){
			System.out.println("** "+line);
		}
		reader.close();
	}
}