package PalindromeString;
import java.util.Scanner;
public class PalindromeorNot {



	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter String");
		String str=k.nextLine();
		String org_str=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			}

		if(org_str.equals(rev)) {
			System.out.println(str+" is a palindrome ");
			
		}
		else {
			System.err.println(str+"is not a palindrome");
		}
		
		
	}

}
