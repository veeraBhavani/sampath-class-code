package com.whiteboxqa.oop4;

public class Connection {

	public String serverName;
	public String username;
	public String password;
	private static Connection connection;
	
	private Connection()
	{
		
	}
	
	public static Connection getConnection()
	{
		if(connection == null)
		{
			connection = new Connection();
		}
		return connection;
	}

	public void connect() {

	}

	public void close() {

	}

}
