import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter ArmStrong Number");
		int n=k.nextInt();
		int a=n;
		int rem=0;
		while(n>0) {
			int r=n%10;
			rem=(r*r*r)+rem;
			

			n=n/10;
			/*
			 * 10)153(15-->
			 *    150
			 *    ---
			 *    3-->remainder
			 */
		}
	
		
//		int n=153;
//		int rem=0;
//		int arm=0;
//		while(n>0) {
//			rem=n%10;
//			arm=(rem*rem*rem)+rem;
//			n=n/10;
//			}
		System.out.println(rem);
			if(a==rem) {
				System.out.println(a+" is a arm Strong Number");
			}
			else {
				System.out.println(a+" is not a armStrong number");
			}
		}
		
	}

