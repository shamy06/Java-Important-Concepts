package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
	public static void main(String args[]) {
		List<String> listOfStrings = Arrays.asList("Facebook","Twitter","Youtube","WhatsApp","LinkedIn");
		
		String joinedString = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
		
		System.out.println(joinedString);
	}
}
