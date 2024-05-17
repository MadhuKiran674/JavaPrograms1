import java.util.Scanner;
public class Test3 {
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Palindrome Number");
		int i=s.nextInt();
		Test3 k=new Test3();
		k.palindrome(i);
	}
	
	
	public void palindrome(int num) {
		int n=num,sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(sum==n) {
			System.out.println(n+" Is a palindrome");
		}
		else {
			System.out.println(n+" is Not a Palindrome");
		}
		
	
	}

}
