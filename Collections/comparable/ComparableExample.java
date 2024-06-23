package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	public static void main(String args[]) {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(101,"Shubham",23));
		al.add(new Students(106,"Ajay",27));  
		al.add(new Students(105,"Jai",21));  
		
		Collections.sort(al);
		for(Students s: al) {
			System.out.println(s.rollno+" "+s.age+" "+s.name);
		}
		
	}
}
