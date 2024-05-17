import java.util.Scanner;
public class Test2 {
	public static void main(String args[]) {
	Scanner k=new Scanner(System.in);
	System.out.println("Enter Palindrome Number");
	int n=k.nextInt();
	int i=n,sum=0,rem;
	while(n>0) {
		rem=n%10;
		sum=(sum*10)+rem;
		System.out.println(sum);
		n=n/10;
		
	}
	if(sum==i) {
		System.out.println(i+" is a palindrome");
	}
	else {
		System.out.println(i+" is not a palindrome");
	}
	}

}
