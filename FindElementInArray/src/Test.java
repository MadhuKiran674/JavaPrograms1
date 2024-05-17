import java.util.Scanner;
public class Test {
	
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=k.nextInt();
		
		int x[]=new int[size];
		System.out.println("Enter "+size+" elements only");
		for(int i=0;i<size;i++) {
			x[i]=k.nextInt();
			
		}
		for(int j=0;j<x.length;j++) {
			
			
			for(int r=j+1;r<x.length;r++) {
				if(x[j]==x[r]) {
					System.out.println(x[j]);
				}
				
			}
		}
		
	}
	

}
