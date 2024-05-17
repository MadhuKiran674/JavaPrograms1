import java.util.Scanner;

public class Test2 {
public static void main(String args[])
{
	Scanner k=new Scanner(System.in);
	System.out.println("enter the range");
	
	int num=k.nextInt();
	int n=num,rem,sum=0;
//	for(int i=0;i<=num;i++)
//	{
//		n=i;
//		sum=0;
	
	while(num>0)
	{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if(sum==n)
	{
		System.out.println("is a palindrome");
		
	}
	else {
		System.out.println("nou");
	}
//	}
}
}
