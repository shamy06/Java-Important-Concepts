package com.java;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		
		int sumOfN= (n*(n+1)/2);

		int sumofAllElements=0;
		for(int j =0; j<n;j++) {
			sumofAllElements += arr[j];
		}
 		int missingNuber = sumOfN-sumofAllElements;
 		
 		System.out.println("missingNuber"+ missingNuber);
	}
}
