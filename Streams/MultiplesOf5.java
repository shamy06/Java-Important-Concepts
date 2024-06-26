package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class MultiplesOf5 {

	public static void main(String args[]) {
		
		List<Integer> multiples = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		multiples.stream().filter(x->x%5==0).forEach(System.out::println);
	}
}
