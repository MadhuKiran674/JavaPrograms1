import java.util.Arrays;

public class Anagroms {
	public static void main(String args[])
	{
		String s="kiran";
		String k="ranik";
		
		
		
	
		if(s.length()==k.length()) {
			char ch[]=s.toCharArray();
			char c1[]=k.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(ch);
			
			boolean status=Arrays.equals(ch, c1);
			
			if(status) {
				System.out.println("This is anagaram ");
			}
		}
	}
}
