package edu.wbqa.basic;

public class MyConnection {

	public String connectionString;
	public String portNumber;
	private static MyConnection connection;

	private MyConnection() {
	}

	public static MyConnection getConnection() {
		if (connection == null) {
			connection = new MyConnection();
		}
		return connection;
	}

}
