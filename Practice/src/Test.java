import java.util.Scanner;
class Test{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		String str=k.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("is a palindrome");
		}
	}
}