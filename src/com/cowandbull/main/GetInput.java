package com.cowandbull.main;

import java.util.Scanner;
import java.util.logging.Logger;

import com.cowandbull.utilities.Common;

public class GetInput {

	@SuppressWarnings("unused")
	private final static Logger LOGGER = Logger.getLogger(GetInput.class
			.getName());

	/**
	 * getInputFromUser()
	 * 
	 * @author ABahukhandi
	 * @return A correct user input as String.
	 * @about This method gets the user input and verifies it. If it is wrong
	 *        user is asked to enter again.
	 */
	@SuppressWarnings("resource")
	public String getInputFromUser() {
		String returnString = ""; // The user input which is correct i.e. Length
									// = 4 & only contains alphabets
		System.out.println("Enter your guess :: ");
		Scanner inputFromUser = new Scanner(System.in); // Take input
		String userInput = inputFromUser.nextLine(); // Convert input to String
		Boolean flag = Common.verifyWord(userInput, true);
		if (!flag)
			returnString = getInputFromUser();
		else
			returnString = userInput;
		// inputFromUser.close(); // Close input
		return returnString.toUpperCase(); // return correct input

	}

}
