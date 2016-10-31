package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.UnknownHostException;

public class DictionaryClient extends AbstractClient {

	public DictionaryClient(String host, int port) throws UnknownHostException,
			IOException {
		super(host, port);
	}

	public void process() throws IOException {
		writeToConsole(readLine());
		String yn;
		do {
			writeToConsole(readLine());
			String engWord = readFromConsole();
			writeLine(engWord);
			writeToConsole(readLine());
			writeToConsole(readLine());
			yn = readFromConsole();
			writeLine(yn);
		} while (yn != null && yn.equals("y"));

	}

	public static void main(String args[]) throws UnknownHostException,
			IOException {
		AbstractClient client = new DictionaryClient("localhost", 5432);
		client.execute();
	}

}