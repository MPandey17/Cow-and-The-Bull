package com.cowandbull.main;

import java.util.List;
import java.util.logging.Logger;

public class WordFetcher {

	@SuppressWarnings("unused")
	private final static Logger LOGGER = Logger.getLogger(WordFetcher.class
			.getName());

	/**
	 * wordFetcher(String[])
	 * 
	 * @param wordsToFetchFrom
	 * @return A word selected from word base
	 */
	public static String wordFetcher(List<String> wordsToFetchFrom) {
		// Select a random number
		Integer random =  (int) (Math.random() * wordsToFetchFrom.size() + 1);
		// Select the word
		String wordFetched = wordsToFetchFrom.get(random);
		// Return the word
		return wordFetched.toUpperCase();
	}
}
