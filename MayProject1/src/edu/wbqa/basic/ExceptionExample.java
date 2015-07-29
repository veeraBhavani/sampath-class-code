package edu.wbqa.basic;

public class ExceptionExample {
	
	public static void main(String[] args) {
		MyConnection conn =  null;
		try
		{
			conn = MyConnection.getConnection();
			//
			
			//close
		}
		catch(Exception ex)
		{
			//close it
		}
		finally
		{
			//conn.close
		}
		
		
	}

}
