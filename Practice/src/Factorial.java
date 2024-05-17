import java.util.Scanner;
public class Factorial {

	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		
		System.out.println("enter factorial");
		int n=3;
		int mul=1;
		for(int i=1;i<=n;i++) {
			
			mul=mul*i;
			System.out.println(mul);
		}
		System.out.println(mul);
	}
}
