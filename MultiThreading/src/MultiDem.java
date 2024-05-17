
public class MultiDem implements Runnable {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();

		System.out.println(thread);
	}
	public static void main(String[] args) {
		MultiDem m=new MultiDem();
		Thread th = new Thread(m);
		th.start();
		
		Thread t1= Thread.currentThread();
		System.out.println(t1);
		
	}

}
