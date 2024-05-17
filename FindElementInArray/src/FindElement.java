import java.util.Scanner;
class FindElement
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=k.nextInt();
		int x[]=new int[size];
		//int x[]= {1,2,3,4,5,1,7,8,9,2};
		System.err.println("Enter "+size+" Elements only");
		for(int a=0;a<x.length;a++) {
			x[a]=k.nextInt();
		}
		for(int i=0;i<x.length;i++)
	
	{
			System.out.println(x[i]);
		for(int j=i+1;j<x.length;j++)
		{
			
			if(x[i]==x[j])
			{
				System.out.println("duplicate element is "+x[i]);
			}
			
				}
		
	}
	}
}