package agregations;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Grouping {

	Integer[] numbersArray = new Integer[] { 1, 2, 3, 4, 5 };
	 
	    System.out.println(Arrays.stream(numbersArray)
	                             .collect(Collectors.counting()));
	 
	    System.out.println(Arrays.stream(numbersArray)
	                             .collect(
	                    Collectors.summingInt((Integer x) -> x)));
	 
	    System.out.println(Arrays.stream(numbersArray)
	                             .collect(
	                    Collectors.averagingInt((Integer x) -> x)));
	 
	    System.out.println(Arrays.stream(numbersArray)
	                             .collect(
	                    Collectors.maxBy(Integer::compare)).get());
	 
	    System.out.println(Arrays.stream(numbersArray)
	                             .collect(
	                    Collectors.minBy(Integer::compare)).get());
	 
	    System.out.println(Arrays.stream(numbersArray)
	                             .collect(
	                    Collectors.summarizingInt((Integer x) -> x)));
	  }
	
	
}
