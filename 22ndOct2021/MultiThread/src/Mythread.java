import java.util.ArrayList;

public class Mythread extends Thread {
	 private String threadName;
	 private int start, end;
	 private static ArrayList<Integer> primesno = new ArrayList<>();
	
	 public Mythread(String threadName, int start, int end) {
	        super(threadName);
	        this.start = start;
	        this.end = end;
	        this.threadName = threadName;
	    }
	 
	 public static ArrayList<Integer> getPrimes(){
	        return Mythread.primesno;
	    }
	
	public void run()
	{
		for(int i = this.start; i <= this.end; i++) {
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                this.primesno.add(i);
            }
	}
	}

}
