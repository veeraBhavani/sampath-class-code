package edu.wbqa.basic;

public class SingletonExample {
	
	public static void main(String[] args) {
		
		MyConnection c1 = MyConnection.getConnection();
		MyConnection c2 = MyConnection.getConnection();
		
	}

}
