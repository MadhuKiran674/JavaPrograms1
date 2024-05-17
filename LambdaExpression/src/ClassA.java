
public class ClassA {
	
	public static void main(String args[])
	{
		Audi a=new Audi();
		a.drive();
		//This Anonymous class
		Car c=new Car() {
			public void drive() {
				System.out.println("Driving Bmw");
			}
		};
		c.drive();
		//This is Lambda Expression
		Car c1=()->{
			System.out.println("Driving Tata");
		};
		c1.drive();
	}

}
/*
 Lambda Expression Means it ways a reducing a number of lines of code
 */
