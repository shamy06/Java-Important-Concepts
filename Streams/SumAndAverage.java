package com.java.streams;

import java.util.Arrays;

public class SumAndAverage {

	public static void main(String args[]) {
		int[] arr = new int[] {23,4,23,45,5,65,67,89};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum"+ sum);
		
		double average = Arrays.stream(arr).average().getAsDouble();
		
		System.out.print("average"+ average);
	}
}
