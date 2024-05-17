import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Harshard Number");
		/*
		 * A number is said to be the Harshad number if it is divisible by the sum of
		 * its digit.
		 */int n=k.nextInt();
		 int i=n;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=(sum+0)+rem;
		    n=n/10;
		}
		System.out.println(sum);
		if(i%sum==0) {
			System.out.println(i+" is a Hashard number");
		}
		else
		{
			System.out.println(i+" is not a Hashard number");
		}
	}

}
