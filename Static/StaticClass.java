package Static;

class Student_s{
	int rollno;
	String name;
//	int count; returns 1 as new memory is assigned on new object creation
	static int count=0; //will get memory only once and retain its value  
	static String college ="ITIS";
	
	//construcotr
	Student_s(int r, String n){
		rollno=r;
		name=n;
		count++;
		System.out.println(count);  
	}
	
	void displayStudents() {
		System.out.println(rollno+" "+name+" "+college+" "+count);
	}
}
public class StaticClass {
	public static void main(String args[]) {
		Student_s s1=new Student_s(111,"Aryan");
		Student_s s2=new Student_s(222,"Shubham");
		s1.displayStudents();
		s2.displayStudents();
	}
	
}
