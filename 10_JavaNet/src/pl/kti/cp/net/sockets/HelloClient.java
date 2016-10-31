package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.UnknownHostException;

public class HelloClient extends AbstractClient {

	public HelloClient(String host, int port) throws UnknownHostException,
			IOException {
		super(host, port);
	}

	public void process() throws IOException {
		writeToConsole(readLine());
		String name = readFromConsole();
		writeLine(name);
		writeToConsole(readLine());
	}

	public static void main(String args[]) throws UnknownHostException,
			IOException {
		AbstractClient client = new HelloClient("localhost", 5432);
		client.execute();
	}
}