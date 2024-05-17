import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NameStart {
	public static void main(String args[]) {
	List<String>list=new ArrayList<>();
	list.add("Madhu");
	list.add("kiran");
	list.add("Akhil");
	Stream<String> stream = list.stream();
	stream.filter(name->name.startsWith("k"))
	.map(name-> name+" "+name.length())
	.forEach(name->System.out.println(name));
	
	}

}
