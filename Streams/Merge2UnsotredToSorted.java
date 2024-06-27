package com.java.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2UnsotredToSorted {

		public static void main(String args[]) {

	int[] a= new int[] {4,2,3,1};
	
	int[] b= new int[] {8,3,5,7,9}; 
	
	int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
	

    System.out.println(Arrays.toString(c));
}
}
