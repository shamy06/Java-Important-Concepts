package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String args[]) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Ravi");
		list.add("vijay");
		System.out.println(list.get(1));
		list.set(1, "Abhay");
		
		for(String str:list) {
			System.out.println(str);
		}
		
		Collections.sort(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
