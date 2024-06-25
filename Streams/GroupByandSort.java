package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByandSort {

	public static void main(String args[]) {
		//3 apples 2 banana 1 others
		
		List<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","apple","orange","papaya","apple","banana"));
		
		Map<String, Long> fruitsMap = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Map<String, Long> finalMap =  fruitsMap.entrySet().stream()
					.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
					.collect(Collectors.toMap(
							Map.Entry::getKey,
							Map.Entry::getValue,
							(e1,e2)->e1,
							LinkedHashMap::new
							));
		
		System.out.println(finalMap+"c"+fruitsMap);
	}
}

//The entrySet().stream() method converts the map entries into a stream of map entries.

//The sorted(Map.Entry.<String, Long>comparingByValue().reversed()) method sorts the entries by their values in descending order.
	//Map.Entry.comparingByValue():
		//This is a static method in the Map.Entry interface that returns a Comparator to compare Map.Entry objects based on their values.
		//The generic method signature <K, V extends Comparable<? super V>> Comparator<Map.Entry<K, V>> comparingByValue() means it returns a comparator that compares the entries' values using their natural ordering (i.e., the order defined by their compareTo method).
	//.reversed():
		//The reversed method is called on the comparator returned by Map.Entry.comparingByValue().

//The collect(Collectors.toMap(...)) method collects the sorted entries into a LinkedHashMap:

//Map.Entry::getKey and Map.Entry::getValue are used to extract the keys and values from the map entries.
//(e1, e2) -> e1 is a merge function which is not needed here because there are no duplicate keys, but it’s required by the toMap method.
//LinkedHashMap::new specifies that the results should be collected into a LinkedHashMap, which preserves the insertion order of the sorted