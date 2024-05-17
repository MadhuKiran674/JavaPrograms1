import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Which Table You want");
		int n=k.nextInt();
		int t=1;
		for(int i=1;i<=10;i++) {
			t=n*i;
			System.out.println(n+"*"+i+"="+t);
		}
	}
}
