
public class MultiDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello World");
		
	}
	public static void main(String args[]) {
		MultiDemo m1=new MultiDemo();
		Thread t1=new Thread(m1);
		t1.start();
		
	}

}
