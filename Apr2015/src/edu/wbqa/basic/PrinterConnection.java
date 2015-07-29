package edu.wbqa.basic;

public class PrinterConnection {

	private static PrinterConnection connection;

	public static PrinterConnection getConnection() {
		if (connection == null) {
			connection = new PrinterConnection();
		}
		return connection;
	}

	private PrinterConnection() {

	}

	public void finalize() {
		// code to release things.
	}

}
