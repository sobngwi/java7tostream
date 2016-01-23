/**
 * 
 */
package org.sobngwi.java7to8.s4.after;

import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import java.io.*;

public class Sample {
	public static void main(String[] args) {
	  File aDirectory = new File(".");
	  
	  System.out.println(
  	  Stream.of(aDirectory.listFiles())
	        .map(File::getName)
	        .collect(joining(", ")));
  }
}