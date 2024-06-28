package FunctionalInterface;
import java.util.function.*;

public class PredicateFunctionalInterface {
	public static void main(String args[]) {
		String[] s= {"Nag","Abcd","Pqrst","Xwyz"};
		Predicate<String> p =s1->s1.length()%2==0;
		for(String s1:s) {
			if(p.test(s1)) {
			System.out.println(s1);
		}
		}
}
}
