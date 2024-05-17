import java.util.StringJoiner;
import java.util.Scanner;
public class StringJoinerExample {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		String s=k.nextLine();;
		
		
		
		StringJoiner joiner=new StringJoiner(",","{","}");
		joiner.add(s).add(s);
		System.out.println(joiner);
	}

}
