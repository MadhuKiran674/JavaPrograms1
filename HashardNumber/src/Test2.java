
public class Test2 {
	public static void main(String args[]) {
		int n=12;
		int i=n;
		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum=(sum+0)+rem;
			n=n/10;
			
		}
		if(i%sum==0) {
			System.out.println("is harshad");
		}
	}

}
