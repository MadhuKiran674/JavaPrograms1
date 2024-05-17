import java.util.Scanner;
public class IntToString {
	
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Which number you want converted into string");
		int n=k.nextInt();
		String co=Integer.toString(n);
		if(co.equals(co)) {
			System.out.println("GOOD JOB");
		}
		else {
			System.out.println("Wrong Ans");
		}
		
		int num=-42;
		
		String conInt=Integer.toString(num);
		if(conInt.equals("-42")) {
			System.out.println("Good Job");
			
		}
		else {
			System.out.println("Wrong Answer");
		}
	}
	
	

}
