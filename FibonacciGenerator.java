import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int count = scanner.nextInt();

        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(count)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i + " "));

        scanner.close();
    }
}
