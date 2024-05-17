import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingAndDecoding {
	
	public static void main(String args[]) {
		Encoder encoder = Base64.getEncoder();
		//creating byte array
		byte arr[]= {1,2};
		//encoding byteArray
		byte arr2[] = encoder.encode(arr);
		
		System.err.println("this is encode "+arr2);
		
		byte arr3[]=new byte[4];
		//Returns Number of bytes
		int x = encoder.encode(arr, arr3);
		System.out.println("encoded byte array written to the another array"+arr3);
		System.out.println("Number of bytes written"+x);
		
		
		//Encoding String
		String str="JavaTPoint";
		String encodeString = encoder.encodeToString(str.getBytes());
		System.err.println("This is ncoding String"+encodeString);
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeString);
		String dstr=new String(decode);
		
		System.out.println("String decoding "+dstr);
		
		
		
		
	}

}
