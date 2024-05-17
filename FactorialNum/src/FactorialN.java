import java.util.Scanner;
public class FactorialN {

	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Fact Num");

		int n=k.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
