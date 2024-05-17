import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Person {
	
	private String name;
	private String job;
	private String phno;
	
	Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public static void main(String args[]) {
		Person p1=new Person();
		p1.setName("kiran");
		p1.setJob("software");
		p1.setPhno("99999");
		Person p2=new Person();
		p2.setName("Madhu");
		p2.setJob("chef");
		p2.setPhno("8888888");
		
		List<Person> asList = Arrays.asList(p1,p2);
		Stream<Person> stream = asList.stream();
		stream.filter(person->person.getJob().equals("software"))
		.map(person->person.getName()+" "+person.getPhno())
		.forEach(System.out::println);
		
	}

}
