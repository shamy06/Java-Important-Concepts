package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String args[]) {
		List<Integer> minMaxValue = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		int max = minMaxValue.stream().max(Comparator.naturalOrder()).get();
		
		int min = minMaxValue.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println("max "+max+" min "+min);
	}
}
