package com.cowandbull.main;

import java.util.List;
import java.util.logging.Logger;

import com.cowandbull.utilities.Common;

public class CowAndBullMain {

	private static final int MAX_TRIES = 10;
	static Integer cows = 0;
	static Integer bulls = 0;
	static String correctWord = "";

	@SuppressWarnings("unused")
	private final static Logger LOGGER = Logger.getLogger(CowAndBullMain.class.getName());

	public static void main(String[] args) {

		// Introduction
		introduction();
		// Word DB
		List<String> wordBaseInMain = WordBase.getWords();
		
		CowAndBullMain classObject = new CowAndBullMain();

		// Call SubMain
		Boolean flag = classObject.subMain(wordBaseInMain);

		if (flag) {
			// Congratulations you won!
			System.out.println("CONGRATULATIONS");
		} else {
			// You Lost ; Show the correct word
			System.out.println("Tough luck, the correct word was : "
					+ correctWord);
		}
	}

	private Boolean subMain(List<String> wordBaseInMain) {
		// Fetch Word
		String wordToGuess = WordFetcher.wordFetcher(wordBaseInMain);
		correctWord = wordToGuess;
		// Verify Word is 4 Alphabet & all are unique
		Boolean wordVerification = Common.verifyWord(wordToGuess, false);

		if (wordVerification) {
			Integer index = 0;
			String userInput = new String();

			GetInput getInput = new GetInput();

			while (index < MAX_TRIES) {

				System.out.println("\n\nChance #" + (index + 1));
				// Ask user for input
				userInput = getInput.getInputFromUser();
				cows = 0;
				bulls = 0;
				// Evaluate Input for Cow
				evaluateCows(wordToGuess, userInput);
				// Evaluate Input for Bull
				evaluateBulls(wordToGuess, userInput);
				// Display Output
				System.out.println("Cows :: " + cows + " Bulls :: " + bulls);
				index++;
				if (bulls == 4) return true;
			}
		} else {
			subMain(wordBaseInMain);
		}
		return false;
	}

	private void evaluateCows(String originalWord, String guessedWord) {
		Integer index = 0;
		for (index = 0; index < 4; index++) {
			if (guessedWord.indexOf(originalWord.charAt(index)) != -1)
				cows++;
		}
	}

	private void evaluateBulls(String originalWord, String guessedWord) {
		Integer index = 0;
		for (index = 0; index < 4; index++) {
			if (originalWord.charAt(index) == guessedWord.charAt(index)) {
				bulls++;
				cows--;
			}
		}
	}

	public static void introduction() {
		System.out.println("************************************************");
		System.out.println("                     COW & BULL                 ");
		System.out.println("************************************************");
		System.out
				.format("%n%nComputer thinks of a 4 alphabet word and you have to guess it in %d chances%n", MAX_TRIES);
		System.out
				.println("Cow : Alphabet is present in the word that you thought but it is not at the correct position");
		System.out
				.println("Bull : Alphabet is present and is in the correct spot.");
		System.out.println("Good Luck. Have Fun.");
	}

}
