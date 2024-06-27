package com.java.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String args[]) {
		String s1="Java concepts of the Day";
		
		String reversedString = Arrays.stream(s1.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		System.out.println(reversedString);
	}
}
