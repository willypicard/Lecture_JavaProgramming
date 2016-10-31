package pl.kti.cp.net.sockets;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class DictionaryServer extends AbstractServer {
	private Map<String, String> _dictionary;

	public DictionaryServer(int port) throws IOException {
		super(port);
		initDictionary();
	}

	public AbstractServerRunnable getClientConnectionHandler(Socket socket) {
		return new DictionaryConnectionHandler(socket, getDictionary());
	}

	private void initDictionary() {
		_dictionary = new HashMap<String, String>();
		_dictionary.put("Cat", "Kot");
		_dictionary.put("Dog", "Pies");
		_dictionary.put("Perrot", "Papuga");
	}

	public Map<String, String> getDictionary() {
		return _dictionary;
	}

	public static void main(String args[]) {
		try (AbstractServer server = new DictionaryServer(5432);) {
			server.processConnections();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}