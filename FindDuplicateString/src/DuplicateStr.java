
import java.util.Scanner;
public class DuplicateStr {

	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter String");
		String str=k.nextLine();
		
		//Approach 1
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c->sb1.append((char)c));
		System.err.println(sb1);
		
		//Approach-2
		
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int index=str.indexOf(ch,i+1);
			if(index==-1) {
				sb2.append(ch);
			}
			
		}
		System.out.println(sb2);
		
	}
}
