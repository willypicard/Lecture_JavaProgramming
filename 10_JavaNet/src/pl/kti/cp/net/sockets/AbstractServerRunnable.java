package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.Socket;

public abstract class AbstractServerRunnable extends AbstractSocketWrapper
		implements Runnable {

	public AbstractServerRunnable(Socket socket) {
		super(socket);
	}

	public void run() {
		try {
			execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}