
public class Test1 {
	private int i;
	private int j;
	public Test1(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public void Compare(Test1 t) {
		if(t.i==t.j) {
			System.out.println("s");
		}
	}
	public static void main(String[] args) {
		Test1 k=new Test1(1,1);
		k.Compare(k);
		
	}

}
