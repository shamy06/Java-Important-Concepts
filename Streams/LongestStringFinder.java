import java.util.Arrays;

public class LongestStringFinder {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "kiwi", "strawberry"};

        // Find the longest string
        String longestString = Arrays.stream(fruits)
                .reduce("", (a, b) -> a.length() >= b.length() ? a : b);

        // Print the result
        System.out.println("Longest string: " + longestString);

      //or 
      // Find the longest string using Comparator
        Optional<String> longestString2 = Arrays.stream(fruits)
                .collect(Collectors.maxBy(Comparator.comparingInt(String::length)));

        // Print the result
        longestString2.ifPresent(s -> System.out.println("Longest string: " + s));
    }
}
