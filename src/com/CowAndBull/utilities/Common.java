package com.CowAndBull.utilities;

import java.util.logging.Logger;

public class Common {

	@SuppressWarnings("unused")
	private final static Logger LOGGER = Logger.getLogger(Common.class
			.getName());

	/**
	 * verifyWord(String,Boolean)
	 * 
	 * @Param1 : The word that needs to be verified.
	 * @Param2 : Whether to show incorrect message or not
	 * @about  : The method verifies that Param1 is only alphabetical and 4 lettered.
	 * @return : Boolean 
	 * @author ABahukhandi
	**/
	
	public static boolean verifyWord(String wordToVerify, Boolean showMessage) {
		String regex = "^[a-zA-Z]{4}$";
		if (wordToVerify.matches(regex))
			return true;
		else {
			if (showMessage)
				System.out.println("***INCORRECT INPUT ***");
			return false;
		}
	}

}
