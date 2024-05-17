import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {
	
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter String");
		String input=k.nextLine();
		BigInteger bi=new BigInteger(input);
		
		if(bi.isProbablePrime(1)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
