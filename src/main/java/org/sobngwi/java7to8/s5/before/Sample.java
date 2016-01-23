/**
 * 
 */
package org.sobngwi.java7to8.s5.before;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public class Sample {
	public static void main(String[] args) {
	  List<Person> persons = Arrays.asList(
	    new Person("Sara", 12),
	    new Person("Mark", 43),
	    new Person("Bob", 12),
	    new Person("Jill", 64));
	System.out.println(persons);
    Collections.sort(persons);
	  
	  System.out.println(persons);
	  //This is evil, we took the list and modified it. Also, we intruded into the Person class with Comparable.
  }
}
