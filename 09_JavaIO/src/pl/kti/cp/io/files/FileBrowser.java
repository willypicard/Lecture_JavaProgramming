package pl.kti.cp.io.files;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileBrowser {

public static void main(String[] args) throws IOException {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		while (true) {
			int chosenButton = fileChooser.showDialog(null, "Select");
			if (chosenButton == JFileChooser.CANCEL_OPTION) {
				println("Bye, bye!!!");
				System.exit(0);
			}
			File file = fileChooser.getSelectedFile();
			if (file != null) {
				print(file);
				if (file.isDirectory()) {
					println("Contains:");
					printChildren(file, 1);
				}
			}
		}
	}	private static void printChildren(File file, int tab) throws IOException {
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			print(files[i], tab);
		}
	}

	private static void print(File file) throws IOException {
		print(file, 0);
	}

	private static void print(File file, int tabNumber) throws IOException {
		println("--------------------", tabNumber);
		println("Absolute path", file.getAbsolutePath(), tabNumber);
		println("Canonical path", file.getCanonicalPath(), tabNumber);
		println("Name", file.getName(), tabNumber);
		println("Parent", file.getParent(), tabNumber);
		println("Path", file.getPath(), tabNumber);
		println("Exists", file.exists(), tabNumber);
		println("Can read", file.canRead(), tabNumber);
		println("Can write", file.canWrite(), tabNumber);
		println("Is hidden", file.isHidden(), tabNumber);
		println("Last modified", file.lastModified(), tabNumber);
		println("Length", file.length(), tabNumber);
		println("Is a directory", file.isDirectory(), tabNumber);
	}

	private static void println(String info, String value, int tabNumber) {
		println(info + ":\t" + value, tabNumber);
	}
	private static void println(String info, long value, int tabNumber) {
		println(info + ":\t" + value, tabNumber);
	}

	private static void println(String info, boolean value, int tabNumbers) {
		println(info + ":\t" + value, tabNumbers);
	}

	private static void println(String s) {
		println(s, 0);
	}

	private static void println(String s, int tabNumber) {
		printTabs(tabNumber);
		System.out.println(s);
	}

	private static void printTabs(int numberOfTabs) {
		for (int i = 0; i < numberOfTabs; i++) {
			System.out.print("\t");
		}
	}
}