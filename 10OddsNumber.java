import java.util.stream.Stream;

public class TenOddNumber{
public static void main(String[] args)
{
Stream.iterate(new int[] {1,3} f-> new int[] {f[1],f[1]+2})
.limit(10)
.map(f->f[0])
.forEach(i->system.out.print(i+" "));
}
}

// Stream Creation: It starts with an array new int[] {1, 3}, where 1 is the first element and 3 is the second.

// Iteration: The iterate method creates an infinite stream. The second argument, f -> new int[] {f[1], f[1] + 2}, defines how to generate the next element. It takes the current element f (which is an array) and produces a new array where:

// The first element becomes the current second element (f[1]).
// The second element is calculated as the current second element plus 2.
// Limiting: limit(10) restricts the output to the first 10 elements of the stream.

// Mapping: The map(f -> f[0]) function extracts the first element of each array in the stream.

// Output: Finally, forEach(i -> System.out.print(i + " ")) prints each of the first elements followed by a space.
