import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		String search=k.nextLine();
		
		String msg="This is a simple sentence";
	 int index=msg.indexOf(search);
	 if(index!=-1) {
		 System.out.println("is a present");
	 }
	}
}
