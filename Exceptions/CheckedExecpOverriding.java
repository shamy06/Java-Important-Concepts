package Exception;

import java.io.*;

class Parent{
	//define method 
	void msg() {
		System.out.println("parent method");
	}
}

public class CheckedExecpOverriding extends Parent{
	// overriding the method in child class  
	  // gives compile time error  checked exception not allowed bec parent does not have checked exceptions
	void msg() throws IOException {
		System.out.println("TestException Child");
	}
	
	public static void main(String args[]) {
		Parent p = new CheckedExecpOverriding();
		p.msg();
	}
}
