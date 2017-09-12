package expressions;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import agregations.Grouping;

public class ProducerConsumer {
	
	
	static Supplier rand = ProducerConsumer::randNum;  
	
	public static void main(String[] args) {
//		System.out.println(
//				Stream.iterate(0, i -> i+1).limit(100).
//					collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
//		Stream.iterate(0, i -> i+1).limit(10);
		Stream.generate(rand).limit(10).forEach(System.out::println);
	}
	
	public static int randNum(){
		Random rnd = new Random(); 
		return rnd.nextInt(10);
	}

}
