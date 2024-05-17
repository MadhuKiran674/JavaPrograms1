import java.util.Scanner;
public class Stdinop {
	
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		int n=k.nextInt();
		double d=k.nextDouble();
		k.nextLine();//without this we can't able to give value to string
		String s=k.nextLine();
		System.out.println(n);
		System.out.println(d);
		System.out.println(s);
		
		
	}

}
