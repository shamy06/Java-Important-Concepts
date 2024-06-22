package Exception;

class ParentClass{
	//define method 
	void msg() {
		System.out.println("parent method");
	}
}

public class UnCheckedExecpOverriding extends ParentClass{
	// If the superclass method does not declare an exception, 
	//subclass overridden method cannot declare the checked exception but can declare unchecked exception.
	
	void msg() throws ArithmeticException {
		System.out.println("TestException Child");
	}
	
	public static void main(String args[]) {
		ParentClass p = new UnCheckedExecpOverriding();
		p.msg();
	}
}
