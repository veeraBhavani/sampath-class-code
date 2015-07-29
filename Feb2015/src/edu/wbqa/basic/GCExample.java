package edu.wbqa.basic;

public class GCExample {
	
	public static void main(String[] args) {
		
		MyObject o = new MyObject();
		o.c = Connection.getConnection();
		o.c.connect();
		Connection.c = null;
		o = null;
		
	}

}
