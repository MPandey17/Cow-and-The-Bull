package com.CowAndBull.main;

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
	public static String wordFetcher(String[] wordsToFetchFrom) {
		// Select a random number
		/* Integer random = 1 * (int) (Math.random() * 100); */
		Integer random = 0;
		// Select the word
		String wordFetched = wordsToFetchFrom[random];
		// Return the word
		return wordFetched.toUpperCase();
	}
}
