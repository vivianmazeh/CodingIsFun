package JavaNote;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Synchronization is a mechanism that ensures multiple threads do not execute the synchronized block concurrently. 
 * when one thread begins to execute synchronized block, other threads have to wait until the current thread is done executing the code. 
 * 
 * 
 * */
public class Synchronization {
	
	public synchronized void performAct() {
		
	};
	
public static synchronized void performAction() {

	ExecutorService excute = Executors.newFixedThreadPool(10);
	
	excute.execute( new Runnable () {

		@Override
		public void run() {
			final Collection<String> strings = new ArrayList<>();
			strings.add("Ali H Mazeh");
			strings.add("vivian Yanzhen Wang Mazeh");
			strings.add("Eli Ali Mazeh");
			strings.add("Mia Wang Mazeh");
			
			final int sunofString = strings.parallelStream()
									.filter(str -> !str.isEmpty())
									.mapToInt(str -> str.length())
									.sum();
			
			System.out.println("The sum of the family names is " + sunofString);
			
			Object[] countName;
			
			countName = strings.parallelStream()
									.filter(str -> !str.isEmpty())
									.map(str -> str.length())
									.toArray();
									
			for(int i = 0; i< countName.length; i++) {
				System.out.print(countName[i]);
				System.out.println();
			}
					
						
			
			
		}
		
	});
	
		
	};

}
