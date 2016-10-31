package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.Socket;

public class HelloConnectionHandler extends AbstractServerRunnable {
	public HelloConnectionHandler(Socket socket) {
		super(socket);
	}

	public void process() throws IOException {
		writeLine("What's your name?");
		String name = readLine();
		writeLine("Hello " + name + "! It was a pleasure to meet you.");
	}

}