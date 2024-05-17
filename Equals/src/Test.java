import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		String s="Madhu";
		System.out.println("Enter name");
		String s1=k.next();
	
		if(s.equals(s1)) {
	      System.out.println("Welcome");
		}else {
			System.err.println("this is not working");
		}
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("This is equalIgnoreCase");
		}
		else {
			System.out.println("Bye");
		}
		
	}
}
