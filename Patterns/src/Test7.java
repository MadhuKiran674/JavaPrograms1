
public class Test7 {
	
	public static void main(String args[]) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("_");
			}
			for(int k=i;k<=5;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
