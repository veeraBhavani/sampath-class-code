package edu.wbqa.ut;

import java.util.HashMap;

public class Largest {

	// public static String sentence =
	// "This is Junit class, This class covers Selenium too";

	public static HashMap<String, String> getWordCounts(String sentence) {

		HashMap<String, String> words = new HashMap<String, String>();

		String[] currentWords = sentence.split(" ");
		for (String word : currentWords) {
			words.put(word, "1");
		}

		for(String word : words.keySet())
		{
			int count = 0;
			for(String w : currentWords)
			{
				if(w.equals(word))
				{
					count += 1;
				}
			}
			words.put(word, count+"");
		}
		
		return words;
	}

}
