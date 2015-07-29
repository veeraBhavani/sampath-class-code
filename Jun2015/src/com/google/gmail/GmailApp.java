package com.google.gmail;

public class GmailApp {
	
	public Gmail gmail;
	
	public GmailApp(Gmail gmail)
	{
		this.gmail = gmail;
	}
	
	public void sendEmail()
	{
		gmail.sendEmail();
	}

}
