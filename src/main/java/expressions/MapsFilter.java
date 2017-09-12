package expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class MapsFilter {

	static Consumer print = e -> {System.out.println(e);};
	
//	public static LongStream primeSequence(long max) {
//	    return LongStream.iterate(2, i -> i + 1)
//	            .filter(x -> isPrime(x))
//	            .limit(max);
//	}
	
	
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,5,67,3,1,1,3,4,7,8);
//		numeros.stream().filter(n -> n%2==0).map(n -> n+1).collect(Collectors.toList()).forEach(print);
		
//		Stream.iterate(0, n -> n+1).limit(5).forEach(System.out::println);
//		Stream.iterate(100, n -> n-1).limit(5).forEach(System.out::println);
		
//		Stream.generate(Math::random).limit(10).forEach(print);
		IntStream.generate(() ->1).limit(10).forEach(System.out::println);
	}
}
