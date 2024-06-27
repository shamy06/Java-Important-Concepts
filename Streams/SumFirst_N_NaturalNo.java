package com.java.streams;

import java.util.stream.IntStream;

public class SumFirst_N_NaturalNo {

	public static void main(String args[]) {
		
		int sum = IntStream.range(1,11).sum();
		
		System.out.println(sum);
	}
}
