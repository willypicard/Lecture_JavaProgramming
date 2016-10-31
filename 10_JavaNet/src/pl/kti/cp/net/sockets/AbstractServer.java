package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class AbstractServer extends ServerSocket {
	public AbstractServer(int port) throws IOException {
		super(port);
	}

	public void processConnections() throws IOException {
		while (true) {
			Socket socket = accept();
			AbstractServerRunnable clientConnectionHandler = getClientConnectionHandler(socket);
			new Thread(clientConnectionHandler).start();
		}
	}

	public abstract AbstractServerRunnable getClientConnectionHandler(
			Socket socket);
}