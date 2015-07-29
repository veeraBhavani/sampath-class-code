package edu.wbqa.basic;

public class TestConnection {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		Connection c1 = Connection.getConnection();		
		Connection c2 = Connection.getConnection();
		Connection c3 = Connection.getConnection();
	}

}
