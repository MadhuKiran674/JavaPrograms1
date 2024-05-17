package madhu;

public class SortedArray {
	public static void main(String args[]) {
	int a[]= {4,2,1,3};
	
		
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];//4
				a[i]=a[j];//2
				a[j]=temp;//4
				
				
				
			}
			
		}
		System.out.println(a[i]);
	}
		
	}

}
