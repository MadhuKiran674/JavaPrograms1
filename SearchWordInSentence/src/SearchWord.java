import java.util.Scanner;

public class SearchWord {
	public static void main(String args[]) {
		String sentence="This is a sample sentence to search for a word";
 
		
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Search word");
		String search=k.nextLine();
		int count=0;
	
		//method1
		if(sentence.contains(search)) {
			count=count+1;
			if(count!=-1) {
				System.out.println(search+" word is present in a sentence");
			}
		
		}
		//method2
		int index = sentence.indexOf(search);
		System.out.println(index);
        if (index != -1) {
            System.out.println("The word '" + search + "' starts at index " + index + " in the sentence.");
        } else {
            System.out.println("The word '" + search + "' is NOT present in the sentence.");
        }
		}
	
		
}


