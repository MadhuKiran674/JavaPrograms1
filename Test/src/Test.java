import java.util.Scanner;
public class Test {






    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numLines =4/* provide the number of lines of input */;
        
        for (int i = 0; i < numLines; i++) {
            String s = scan.next();
            int x = scan.nextInt();
           // int y=scan.nextInt();
            // Format the output with left-justified string and padded integer
            System.out.printf("java "+"%s\n",s);
            System.out.printf("%03d\n",x);
            
        }
        
        scan.close();
    }
}
