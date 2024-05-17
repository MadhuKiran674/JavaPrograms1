import java.util.stream.Stream;

public class NumberFilters {

	public static void main(String args[]){
		Stream<Integer> stream = Stream.of(4,8,12,16,20,24,28,32,36,38,42);
	
		//Stream<Integer> filter = stream.filter(i->i>=6);
		//filter.forEach(i->System.out.println(i));
		stream.filter(i->i>=32).forEach(i->System.out.println(i));
		
	}
}
