/**
 * 
 */
package org.sobngwi.java7to8.s6.before;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
import java.util.*;

class Resource {
  public Resource() { System.out.println("Creating...."); }
  public void op1() { System.out.println("some operation 1"); }
  public void op2() { System.out.println("some operation 1"); }
  public void finalize() { System.out.println("external resource cleaned up"); }
}

public class Sample {
	public static void main(String[] args) {
	  Resource resource = new Resource();
	  resource.op1();
	  resource.op2();
	  //cleanup?
  }
}
