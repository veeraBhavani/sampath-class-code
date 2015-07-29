package edu.wbqa.basic;

import java.io.*;

public class FinallyExample {

	public static void main(String[] args) throws IOException {

		File f = null;
		FileReader fr = null;
		try {
			f = new File("");
			//

		} catch (Exception ex) {

		} finally {
			if (fr != null) {
				fr.close();
			}
			fr = null;
		}
	}

}
