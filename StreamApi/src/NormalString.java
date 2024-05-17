import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NormalString {

	public static void main(String args[]) {
		String str[]= {"madhu","kiran"};
		Stream<String> stream = Arrays.stream(str);
		stream.forEach(System.out::print);
		
	int i[]= {1,2,3,4,5};
	IntStream stream2 = Arrays.stream(i);
	stream2.forEach(System.out::print);
	}
}
