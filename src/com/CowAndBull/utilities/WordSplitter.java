package com.CowAndBull.utilities;

public class WordSplitter {

	public static void main(String[] args) {

		String input = "";		
		String output = "\"";
		String delimiter = "\",\"";
		for(int i=0;i<input.length();i++)
		{
			output=output+input.charAt(i);
			if((i+1)%4 == 0)
			{
				output = output+delimiter;
			}
			
		}
		System.out.println(output);
	}
}