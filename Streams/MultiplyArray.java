import java.util.*;
import java.util.stream.*;

public class Main
{
	public static void main(String[] args) {
	    Integer[] array = {1,2,3,4,5};
	    
	    List<Integer> list= Arrays.asList(array);
	    
	    Optional<Integer> mul= list.stream().reduce((a,b)->a*b);
	    
	    if(mul.isPresent()){
	        System.out.println(mul.get());
	    }
	    else{
	        System.out.println("NO");
	    }
	}
}
