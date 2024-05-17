import java.util.Scanner;
public class Test {
	
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Perfect Number");
		int n=k.nextInt();
		int sum=0,i;
		for(i=1;i<n;i++) {
			
			if(n%i==0) {
				sum=sum+i;
				
			}
			
		}
		if(sum==i) {
			System.out.println(n+" is perfect Number");
		}
		else
		{
			System.out.println(n+" Is not a perfect Number");
		}
	}

}
