/**
 * 
 */
package org.sobngwi.java7to8.s4.before;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
import java.util.*;
import java.io.*;

public class Sample {
	public static void main(String[] args) {
	  File aDirectory = new File(".");
	  
	  List<String> filesInDir = new ArrayList<>();
	  for(File child : aDirectory.listFiles()) {
	    filesInDir.add(child.getName());
	  }
	  
	  for(int i = 0; i < filesInDir.size(); i++) {
	    System.out.print(filesInDir.get(i));
	    if(i != filesInDir.size() - 1)
	      System.out.print(", ");
	  }
	  System.out.println();
  }
}
