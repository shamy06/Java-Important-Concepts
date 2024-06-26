package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String args[]) {
		
		List<String> listOfString = Arrays.asList("Java", "Python", "C", "C++", "Java", "Python");
		
		List<String> uniqueString = listOfString.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueString);
	}
	
}
