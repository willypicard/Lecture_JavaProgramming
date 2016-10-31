package pl.kti.cp.io.stats;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;


public class FileStatistics {
	private File _file;
	private int _numberOfLines = 0;
	private int _numberOfChars = 0;
	private int _numberOfWords = 0;
	
	private Map<String, Integer> _words = new HashMap<String, Integer>();
	
	public FileStatistics(File file){
		_file = file;
	}
	
	public void initialize() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(_file));
		String line;
		
		while( (line = in.readLine()) != null){
			_numberOfLines ++;
			_numberOfChars += line.length();
			parseLine(line);
		}
		in.close();
	}
	
	public void print(Writer writer) throws IOException{
		String NEWLINE = System.getProperty("line.separator");
		writer.write("Statistics for "+_file.getAbsolutePath()+NEWLINE);
		writer.write("Number of lines:\t"+_numberOfLines+NEWLINE);
		writer.write("Number of words:\t"+_numberOfWords+NEWLINE);
		writer.write("Number of characters:\t"+_numberOfChars+NEWLINE);
		writer.write(NEWLINE);
		writer.write("Found words:"+NEWLINE);
		Set<String> words = _words.keySet();
		for (Iterator<String> iter = words.iterator();iter.hasNext();){
			String word = iter.next();
			Integer numberOfOccurrences = (Integer) _words.get(word);
			String occurences = numberOfOccurrences+ " times";
			if (numberOfOccurrences.intValue() == 1)
				occurences = "Once\t";
			if (numberOfOccurrences.intValue() == 2)
				occurences = "Twice";
			writer.write("\t"+occurences+"\t\t\t"+ word+NEWLINE);
		}
		writer.write("======================");
		writer.flush();
		writer.close();
	}
	private void parseLine(String line){
		Pattern p = Pattern.compile("\\s");
        String[] items = p.split(line);
        for(int i=0;i<items.length;i++) {
        	_numberOfWords++;
        	addToWords(items[i]);
        }
	}
	
	private void addToWords(String word){
		Integer number = (Integer) _words.get(word);
		if (number == null){
			number = new Integer(0);
		}
		number = new Integer(number.intValue()+1);
		_words.put(word, number);
	}
}
