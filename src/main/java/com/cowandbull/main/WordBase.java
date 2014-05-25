package com.cowandbull.main;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class WordBase {
		
	public static List<String> getWords() {
		return getWordsFromFile();				
	}

	@SuppressWarnings("unchecked")
	private static List<String> getWordsFromFile() {
		File dictionary = new File("dictionary");
		try {
			return FileUtils.readLines(dictionary);			
		} catch (IOException e) {
			return Collections.emptyList();
		}
	}
}

