import java.util.Scanner;
public class Equals {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		String s="Hello";
		System.out.println("Enter password");
		String s1=k.next();
		if(s.equals(s1)) {
			System.out.println("Welcome");
		}
		else {
			System.err.println("Please Type right password");
		}
	System.out.println(s==s1);
	}

}
