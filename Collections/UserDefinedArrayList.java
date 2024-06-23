package Collection;

import java.util.*;

class Student{
	int age;
	String name;
	int rollno;
	
	Student(int age,String name, int rollno){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}

public class UserDefinedArrayList {
	public static void main(String args[]) {	
	Student s1=new Student(12,"Stud1",101);
	Student s2=new Student(10,"Stud2",102);
	
	ArrayList<Student> al=new ArrayList<Student>();  
	  al.add(s1); 
	  al.add(s2);  
	  
	  Iterator itr=al.iterator();
	  while(itr.hasNext()) {
		  Student st=(Student)itr.next();
		  System.out.println(st.age+" "+st.name+" "+st.rollno);
	  }
	}
}
