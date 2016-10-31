package pl.kti.cp.introduction;

import java.util.*;

public class Sorter {
	private List _words;

	public Sorter() {
		_words = new ArrayList();
	}

	@SuppressWarnings("unchecked")
	public void sort(String[] words) {
		_words = Arrays.asList(words);
		Collections.sort(_words);
	}

	public String getSortedWords() {
		String sortedString = "";
		for (int i = 0; i < _words.size(); i++) {
			sortedString += _words.get(i);
			sortedString += System.getProperty("line.separator");
		}
		return sortedString;
	}

	public static void main(String[] args) {
		Sorter sorter = new Sorter();
		sorter.sort(args);
		System.out.println("Sorted word list:");
		System.out.println(sorter.getSortedWords());
	}
}