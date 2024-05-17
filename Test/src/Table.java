import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Table {
	public static void main(String args[]) throws Exception  {
		Scanner k=new Scanner(System.in);
		System.out.println("which table DO you want");
	
		int n=k.nextInt();
		for(int i=1;i<=10;i++) {
			int result=n*i;
			System.out.println(n+"x"+i+"="+result);
		}
		
		//method2
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Method 2 table");
		int s =Integer.parseInt(reader.readLine());
		reader.close();
		for(int i=1;i<=10;i++) {
			
			int result=s*i;
			System.out.println(s+"x"+i+"="+result);
			
		}
		
	}

}
