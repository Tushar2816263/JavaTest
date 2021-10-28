
public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Mythread t1 = new Mythread("ThreadNo-1", 1, 2500);
	     Mythread t2 = new Mythread("ThreadNo-2", 2501, 5000);
	        t1.start();
	        t2.start();
	        
	        long startTime = System.currentTimeMillis();
	        
	        try {
	            t1.join();  
	            t2.join();  
	        } catch (Exception e) {
	            //TODO: handle exception
	        }
	        long endTime = System.currentTimeMillis();
	        long elapsedTime = endTime - startTime;
	        System.out.println("TotalTime: "+elapsedTime+" Milliseconds");
	        
	        System.out.println(Mythread.getPrimes());

	}

}
