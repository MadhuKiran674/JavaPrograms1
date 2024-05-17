
public class Test {

	public static void main(String args[]) {
		int n=8,count=0;
		for(int i=1;i<=10;i++) {
			if(n%i==0) {
				count++;
			}
			
			System.out.println(i);
		}
		if(count==2) {
			System.out.println("This is prime number");
		}
		else {
			System.out.println("This is not a prime number");
		}
	}
}
