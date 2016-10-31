package pl.kti.cp.net.URLs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RFCReader {
	private String _rfcNumber;

	public RFCReader(String rfcNumber) {
		_rfcNumber = rfcNumber;
	}

	public String getRFCNumber() {
		return _rfcNumber;
	}

	public String getContents() {
		String rfcNb = normalize(getRFCNumber());

		try {
			return read(rfcNb);
		} catch (IOException err) {
			return "RFC " + getRFCNumber() + " cannot be found!!!";
		}
	}

	private String read(String rfcNb) throws MalformedURLException, IOException {
		String rfcContents = "";

		URL rfcURL = new URL(" http://www.ietf.org/rfc/rfc" + rfcNb + ".txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(rfcURL
				.openStream()));

		String inputLine;
		System.out.println();
		rfcContents += "========== RFC " + rfcNb + " =========";
		while ((inputLine = in.readLine()) != null)
			rfcContents += System.getProperty("line.separator") + inputLine;

		in.close();

		return rfcContents;
	}

	private String normalize(String rfcNumber) {
		String normalized = "000" + rfcNumber;
		normalized = normalized.substring(normalized.length() - 4);
		return normalized;
	}
}