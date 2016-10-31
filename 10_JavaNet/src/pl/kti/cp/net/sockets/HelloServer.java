package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.Socket;

public class HelloServer extends AbstractServer {

	public HelloServer(int port) throws IOException {
		super(port);
	}

	public AbstractServerRunnable getClientConnectionHandler(Socket socket) {
		return new HelloConnectionHandler(socket);
	}

	public static void main(String args[]) {
		try (AbstractServer server = new HelloServer(5432);) {
			server.processConnections();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}