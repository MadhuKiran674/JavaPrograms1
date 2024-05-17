import java.util.Optional;

public class TestOptional {

	public static void main(String args[]) {

		Test k = new Test();
		
		k.setUname("Kiran");
		Optional<String> uname = k.getUname();

		if(uname.isPresent()&& uname.get().equalsIgnoreCase("kiran")) {
		
			System.out.println("Equals");
			
		}
		else {
			System.out.println("Not Equals");
		}
//		System.out.println(k.getUname());
//		if (k.getUname().equalsIgnoreCase("Kiran")) {
//			System.out.println("Equals");
//		} else {
//			System.out.println("Not equals");
//		}

	}

}

class Test {
	private String uname;

	public Optional<String> getUname() {
		return Optional.ofNullable(uname);
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	


}
