
public class Test {

	int rollNo;
	String name;
	static String college="vkms";
	public Test(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	static void change() {
		college="ss";
	}
	void display() {
		System.out.println(rollNo+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Test.change();
		Test k=new Test(101,"kiran");
		Test s=new Test(102,"shob");
		k.display();
		s.display();
	}
}
