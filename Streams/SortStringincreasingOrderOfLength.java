package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringincreasingOrderOfLength {

	public static void main(String args[]) {
		List<String> listOfStrings = Arrays.asList("Java", "Python","C","C++","HTML","C#");
		
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
