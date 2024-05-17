import java.util.Scanner;
public class WeirdorNotWeired {

	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		int n=k.nextInt();
		double d=k.nextDouble();
		String s=k.nextLine();
		String w=k.next();
		
		if(n<=5) {
			System.out.println("weired");
		}else {
			System.out.println("not weird");
		}
		
	}
}
