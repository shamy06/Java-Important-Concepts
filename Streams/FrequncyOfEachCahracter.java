package com.java.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequncyOfEachCahracter {

	public static void main(String arg[]) {
		String inputString = "Java Concept Of The Day";
		
		Map<Character, Long> charCountMap = inputString.chars()
			.mapToObj(c-> (char)c).
			collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(charCountMap);
														
	}
}
