package functions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Composition {

static Function<Integer, Integer> suma1 = (e1) -> e1+1;
static Function<Integer, Integer> mult2= e1 -> e1 * 2;
static Function<Integer,Integer> sum1Mult2=suma1.compose(mult2);

static BiFunction <Integer, Integer, Integer> suma=(e1,e2) -> e1+e2;
static BiFunction <Integer, Integer, Integer> mult=(e1,e2) -> e1*e2;

static Consumer<Integer> printOut =System.out::println;


public static void main(String[] args) {
	
//	printOut.accept(sum1Mult2.apply(7));
//	printOut.accept(suma1.apply(5));
//	printOut.accept(suma.apply(3,99));
	printOut.accept(suma.andThen(suma1).andThen(mult2).apply(4, 5));
//	printOut.accept(suma1.compose(suma1.compose(mult2)).apply(3));
	
}
	
	

}
