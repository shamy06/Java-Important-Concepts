public class DaemonThreadExample
{
	public static void main(String[] args) {
	    
	    Thread userThread1 = new Thread(()->{
	        try{
	            for(int i=0;i<=10;i++){
	                System.out.println("User Thread:"+i);
	                Thread.sleep(1000);
	            }
	        }
	            catch(InterruptedException e){
	                throw new RuntimeException(e);
	            }
	    });
	    
	    Thread daemonThread = new Thread(()->{
	        try{
	            for(int i=0;i<=10;i++){
	                System.out.println("Deamon Thread:"+i);
	                Thread.sleep(2000);
	            }
	            
	        }
	            catch(InterruptedException e){
	                throw new RuntimeException(e);
	            }
	    });
	    
	    userThread1.start();
	    daemonThread.setDaemon(true); // to start the daemon thread
        daemonThread.start();	    
	}
}
