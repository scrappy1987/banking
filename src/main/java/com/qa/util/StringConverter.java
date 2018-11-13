package com.qa.util;

import org.apache.commons.text.WordUtils;

public class StringConverter {
	public static String capitaliseFirstLetterOfEachWord(String inputString) 
	{
		return WordUtils.capitalize(inputString);
	}
}
