package agregations;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsSample {

	static Consumer show= System.out::println;
	
	
	public static void main(String[] args) {
//		Stream.iterate(0, n -> n+1).limit(10).forEach(show);
		
//		Integer i=Stream.iterate(0,n -> n+1).limit(10).collect(Collectors.toList()).forEach(show).collect(Collectors.counting());
//		System.out.println(Arrays.stream(new Integer[]{1,2,3,4,1,9,10}).collect(Collectors.counting()));
		
//		show.accept(Stream.iterate(0,n -> n+1).limit(10));
		
	System.out.println(isPrime(27));	
		
		
	}	
	
	
	public static boolean isPrime(int number) {
	    return number > 1 && 
	            IntStream.rangeClosed(2, (int) Math.sqrt(number))
	                .noneMatch(i -> number % i == 0);
	}
	
}
