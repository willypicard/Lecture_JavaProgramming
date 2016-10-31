package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.Socket;
import java.util.Map;

public class DictionaryConnectionHandler extends AbstractServerRunnable {
	private Map<String, String> _dictionary;

	public DictionaryConnectionHandler(Socket socket, Map<String, String> dictionary) {
		super(socket);
		_dictionary = dictionary;
	}

	public void process() throws IOException {
		writeLine("Welcome to the Dictionary On-Line");
		String yn;
		do {
			writeLine("Please enter a world to be translated (eng->pol): ");
			String engWord = readLine();
			String polWord = translate(engWord);
			if (polWord == null) {
				writeLine(engWord + " unknown :(");
			} else {
				writeLine(engWord + ": " + polWord);
			}
			writeLine("Do you want to continue [y/n]?");
			yn = readLine();
		} while (yn != null && yn.equals("y"));
	}

	private String translate(String engWord) {
		return (String) _dictionary.get(engWord);
	}

}