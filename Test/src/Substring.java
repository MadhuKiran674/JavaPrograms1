import java.util.Scanner;
public class Substring {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s="welcometojava";
		int k=3;
		String substr = getSmallestAndLargest(s,k);
		System.out.println(substr);
		int start=sc.nextInt();
		int end=sc.nextInt();
	
		
		
		
		String sb=s.substring(start, end);
		System.out.println(sb);
	}
	
	public static String getSmallestAndLargest(String s,int k) {
		String smallest=" ";
		String largest=" ";
		smallest=s.substring(0, k);
		largest=s.substring(0, k);
		for(int i=1;i<=s.length()-k;i++) {
			String sub=s.substring(i, i+k);
			if(sub.compareTo(smallest)<0) {
				smallest=sub;
				
				
			}if(sub.compareTo(largest)>0) {
				largest=sub;
			}
			
			
		}
		
		return smallest+"\n"+largest;
		
	}

}
