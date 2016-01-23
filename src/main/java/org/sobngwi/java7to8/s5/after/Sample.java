/**
 * 
 */
package org.sobngwi.java7to8.s5.after;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
import java.util.*;

import static java.util.Comparator.*;

import java.util.function.Function;

public class Sample {
  public static void printSorted(List<Person> people, Comparator<Person> comparator) {
    System.out.println("----------------------");
    people.stream()
          .sorted(comparator)
          .forEach(System.out::println);
  }
  
	public static void main(String[] args) {
	  List<Person> persons = Arrays.asList(
	    new Person("Sara", 12),
	    new Person("Mark", 43),
	    new Person("Bob", 12),
	    new Person("Jill", 64));
	
	System.out.println(persons);
    Function<Person, Integer> byAge = Person::getAge;
    Function<Person, String> byName = Person::getName;

    printSorted(persons, comparing(Person::getAge));
    printSorted(persons, comparing(Person::getName));
    
    printSorted(persons, comparing(byAge).thenComparing(byName));
  }
}
