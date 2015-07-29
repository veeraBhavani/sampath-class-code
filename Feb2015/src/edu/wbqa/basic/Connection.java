package edu.wbqa.basic;

public class Connection {

	public String serverName;
	public String dbName;
	public String userName;
	public String password;
	public static Connection c;

	private Connection() {

	}

	public void connect() {

	}
	
	public void close()
	{
		
	}

	public void executeSQL() {

	}

	public static Connection getConnection() {
		if (c == null) {
			c = new Connection();
		}
		return c;
	}
}
