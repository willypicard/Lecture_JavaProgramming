package pl.kti.cp.net.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public abstract class AbstractSocketWrapper {
	private Socket _socket;

	private PrintWriter _out;

	private BufferedReader _in;

	public AbstractSocketWrapper(Socket socket) {
		_socket = socket;
	}

	public Socket getSocket() {
		return _socket;
	}

	public void execute() throws IOException {
		openStreams();
		process();
		closeStreams();
	}

	public abstract void process() throws IOException;

	public String readLine() throws IOException {
		return _in.readLine();
	}

	public void writeLine(String line) {
		_out.write(line + System.getProperty("line.separator"));
		_out.flush();
	}

	protected void openStreams() throws IOException {
		_out = new PrintWriter(getSocket().getOutputStream(), true);
		_in = new BufferedReader(new InputStreamReader(getSocket()
				.getInputStream()));
	}

	protected void closeStreams() throws IOException {
		_out.close();
		_in.close();
		_socket.close();
	}

}