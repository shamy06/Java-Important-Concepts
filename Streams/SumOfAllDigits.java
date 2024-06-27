package com.java.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {

	public static void main(String args[]) {
		
		int i= 128567;
		
		Integer sum=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(sum);
	}
}



//String.valueOf(i):
//
//Converts the integer i to its string representation "15623".
//split(""):
//
//Splits the string into individual digits as strings, resulting in an array of strings: ["1", "5", "6", "2", "3"].
//Stream.of(...):
//
//Creates a stream from the array of strings.
//collect(Collectors.summingInt(Integer::parseInt)):
//
//Converts each string in the stream to an integer and then sums them up.
