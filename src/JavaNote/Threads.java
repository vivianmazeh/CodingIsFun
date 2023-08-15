package JavaNote;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * The difference between process and thread
 * process essentially a program that is executing. The computer can run one or more process concurrently. for example, the cp is running
 * Java and Text Edition concurrently. 
 * 
 * processes need their own separate address space and interprocess communication is expensive. 
 * 
 * Threads allows a program run multiple tasks simultaneously. They shared the same address space, preventing the waste of CPU circle or usage. 
 * 
 * 
 * 
 * 
 * */
public class Threads implements Runnable {
	
	Thread t;
	
	public int corePoolSize;
	
	public int maximumPoolSize;
	
	public int keepAliveTime;
	
	
	
	Threads(){
		t = new Thread(this, "Deno Thread");
		System.out.println(t);
		
		corePoolSize = 8;
		maximumPoolSize = 8;
		keepAliveTime = 2;
	}
	@Override
	public void run() {
		
		ThreadPoolExecutor exce  = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MINUTES, new LinkedBlockingQueue<>());
		
    			
			for(int n = 5; n>=0; n--) {
				assert n >2;
				exce.submit(() ->{
					
					  try {
						  new DataType().overridingMethodInHeritance();
						  new InheritanceExample().overridingMethodInHeritance();
						
						  Thread.sleep(1000);
					
					  }catch(InterruptedException e) {
							
							System.out.println(e.getMessage());
							
						}
				});
				
				
			}
			
		
      System.out.println("Existing Child thread");
	}
	
	public void testCallMethodWithoutStatic() {
		System.out.println("a way to call a method from a new instance of a class");
	}

}
