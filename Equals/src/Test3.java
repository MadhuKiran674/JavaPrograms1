
public class Test3 {
	public static void main(String[] args) {
		int ar[]= {2,4,1,3};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			System.out.println(ar[i]);
			
		}
	}

}
