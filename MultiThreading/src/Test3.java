import java.security.DomainCombiner;

public class Test3 implements Runnable{

	String name;
	Test3(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println(name+":"+i);	
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		Test3 t1=new Test3("Thread1");
		Test3 t2=new Test3("Thread2");
		Thread th=new Thread(t1);
	    Thread th1=new Thread(t2);
	    th.start();
	    th.join();
	    th1.start();
	    th1.join();
	    for(int i=1;i<=10;i++) {
	    	System.out.println("main"+i);
	    }
	}

}
