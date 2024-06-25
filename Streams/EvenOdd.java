package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter integers separated by commas or spaces (e.g., 71, 18, 42, ...):");
        
        String input = scanner.nextLine();
        
        String[] tokens= input.split("[,\\s]+");
        
        List<Integer> tokensList = Arrays.asList(tokens).stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        
        Set<Integer> setOfIntegers = tokensList.stream().collect(Collectors.toSet());
        
        List<Integer> listOfIntegers = setOfIntegers.stream().collect(Collectors.toList());

        
        Map<Boolean,List<Integer>> oddEvenNumberMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
        

        System.out.println(listOfIntegers+" "+ oddEvenNumberMap);
        // accessing even odd directly
        
        List<Integer> evenNumbers = oddEvenNumberMap.get(true);
        List<Integer> oddNumbers = oddEvenNumberMap.get(false);
        
        //print 
        
        System.out.println("Even:");
        evenNumbers.forEach(System.out::println);;

        System.out.println("Odd:");
        oddNumbers.forEach(System.out::println);

	}
}
