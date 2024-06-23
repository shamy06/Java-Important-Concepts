package Collection;

import java.util.HashSet;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id, String name,String author,String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
}
public class HashSetExample {

	public static void main(String args[]) {
		HashSet<Book> set= new HashSet<Book>();
			
		//creating books
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    
		//add books
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		for(Book b: set) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			
		}
	}
}
