public class PrintNumberAndAlphabetsBy2Threads
{   
    private static boolean printLetter =true;
    
    private static final Object lock = new Object();
    
	public static void main(String[] args) {
	    
	    Runnable letterTask = new Runnable(){
	        @Override
	        public void run(){
	            for(char ch='A';ch<='z';ch++){
	                synchronized(lock){
	                    if(!printLetter){
	                        try{
	                        lock.wait();
	                        }
	                        catch(InterruptedException e){
	                            throw new RuntimeException(e);
	                        }
	                    }
	                    System.out.print(""+ch);
	                    printLetter=false;
	                    lock.notify();
	                }
	            }
	        }
	    };
	    
	    Runnable numberTask = new Runnable(){
	        @Override
	        public void run(){
	            for(int num=1; num<=26; num++){
	                synchronized(lock){
	                    if(printLetter){
	                        try{
	                            lock.wait();
	                        }
	                        catch(InterruptedException e){
	                            throw new RuntimeException(e);
	                        }
	                    }
	                    System.out.print(""+num);
	                    printLetter=true;
	                    lock.notify();
	                }
	            }
	        }
	    };
	    
        Thread t1= new Thread(letterTask);
        Thread t2 = new Thread(numberTask);
        
        t1.start();
        t2.start();
        
	}
}
