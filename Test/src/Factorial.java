import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		int fact=1;
		int i;
		int number=k.nextInt();
	for(i=1;i<=number;i++) {
		fact=fact*i;
		
	}
	System.out.println(number +" is "+fact);
	}

}
