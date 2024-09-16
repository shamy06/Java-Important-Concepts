package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityNumber {
	
	public static int getHashMapWay(int[] arr) {
		int n= arr.length;
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i =0;i<n;i++) {
			int freq= map.getOrDefault(arr[i], 0);
			map.put(arr[i], freq+1);
		}
		
		//searching 
		for(Map.Entry<Integer,Integer> it:map.entrySet()) {
			if(it.getValue()>(n/2)) {
				return it.getKey();
			}
		}
		return -1;
	}

	public static void main(String arg[]) {
		
	System.out.println("Enter the total no of elements");
	Scanner sc= new Scanner(System.in);
	
	int n = sc.nextInt();
	
	System.out.println("Enter the elements in array");
	int[] arr= new int[n];
	
	for(int i=0;i<n;i++) {
		if(sc.hasNextInt()) {
			arr[i]=sc.nextInt();
	}
		}
	
	int majorityNum = getHashMapWay(arr);
	
	System.out.println(majorityNum);
	}
}
