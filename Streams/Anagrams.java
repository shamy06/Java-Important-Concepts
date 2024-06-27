package com.java.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

	public static void main(String args[]) {
		String str1="RaceCar";
		String str2 ="CarRace";
		
		// Creating an Stream having single element only stream.of(T)
		str1= Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
        str2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        if (str1.equals(str2)) 
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
	}
}
