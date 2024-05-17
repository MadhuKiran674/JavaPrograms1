
public class Test5 {
	public static void main(String args[]) {
		int n=121;
		int sum=0,rem;
		int a=n;
		
		while(n>0) {
			 rem=n%10;
			 sum=(sum*10)+rem;
			 n=n/10;
			 
		}
		if(a==sum) {
			System.out.println("is pal");
		}
	}

}
