package pl.kti.cp.net.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public abstract class AbstractClient extends AbstractSocketWrapper {
	private BufferedReader _consoleIn;

	public AbstractClient(String host, int port) throws UnknownHostException,
			IOException {
		super(new Socket(host, port));
	}

	public String readFromConsole() throws IOException {
		return _consoleIn.readLine();
	}

	public void writeToConsole(String line) {
		System.out.println(line);
	}

	protected void openStreams() throws IOException {
		super.openStreams();
		_consoleIn = new BufferedReader(new InputStreamReader(System.in));
	}

	protected void closeStreams() throws IOException {
		super.closeStreams();
		_consoleIn.close();
	}
}