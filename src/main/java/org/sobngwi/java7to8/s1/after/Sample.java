package org.sobngwi.java7to8.s1.after;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Sample {
	public static void main(String[] args) throws Exception {
	  ExecutorService executorService = Executors.newFixedThreadPool(10);
	  
	  IntStream.range(0, 10)
	          .forEach(index ->
	            executorService.submit(() -> System.out.println("Running task " + index)));
	          
	  System.out.println("Tasks started...");
	  executorService.shutdown();
  }
}
