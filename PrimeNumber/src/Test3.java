import java.util.Scanner;
class Test3{
	public static void main(String args[]) {
	Scanner k=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=k.nextInt();
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
		if(count==2) {
			System.out.println(n+" is a prime Number");
		}
	}
	}
}