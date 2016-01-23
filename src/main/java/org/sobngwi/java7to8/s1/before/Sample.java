package org.sobngwi.java7to8.s1.before;
import java.util.*;
import java.util.concurrent.*;

public class Sample {
	public static void main(String[] args) throws Exception {
	  ExecutorService executorService = Executors.newFixedThreadPool(10);
	  System.out.println("Tasks starting...");
	  for(int i = 0; i < 10; i++) {
	    int tmp = i;
	    executorService.submit(new Runnable() {
	      public void run() {
	        System.out.println("Running task " + tmp);
	      }
	    });

	  }
	
	  executorService.shutdown();
	  System.out.println("Tasks finished...");
  }
}