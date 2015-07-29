package edu.wbqa.basic;

public class Printer {

	public PrinterConnection connection;

	private void open() {
		connection = PrinterConnection.getConnection();
		connection = PrinterConnection.getConnection();
		connection = PrinterConnection.getConnection();
		connection = PrinterConnection.getConnection();
		connection = PrinterConnection.getConnection();
		connection = PrinterConnection.getConnection();
	}

	private void close() {

	}

	public void print() {
			open();
	}

	public static void main(String[] args) {
			Printer p = new Printer();
			p.print();
			p = null;
			System.gc();
	}
}
