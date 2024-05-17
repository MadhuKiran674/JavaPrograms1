import java.util.Scanner;

public class Test {
public static void main(String args[])
{
	Scanner k=new Scanner(System.in);
	System.out.println("enter the range");
	
	int num=k.nextInt();
	int n,rem,sum=0;
	for(int i=0;i<=num;i++)
	{
		n=i;
		sum=0;
	
	while(n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(sum==i)
	{
		System.out.println(i+"is a palindrome");
		
	}
	}
}
}
