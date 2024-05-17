import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class CurrencyFormatter {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter payment");
		double d=k.nextDouble();
		NumberFormat cI = NumberFormat.getCurrencyInstance(Locale.US);	
	
		String format = cI.format(d);
		System.out.println("US currency "+format);
		Locale locale = new Locale("en","IN");
		NumberFormat cindia = NumberFormat.getCurrencyInstance(locale);
		
		String format2 = cindia.format(d);
		System.out.println("India Currency "+format2);
		NumberFormat ckorea = NumberFormat.getCurrencyInstance(Locale.KOREAN);
		String format3 = ckorea.format(d);
		System.out.println("Korea Currency "+format3);
	}

}
