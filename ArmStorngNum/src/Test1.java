class Test1{
	public static void main(String args[]) {
		int n=152,rem,i=n,sum=0;
		while(n>0) {
			rem=n%10;
			sum=(rem*rem*rem)+sum;
			n=n/10;
			
		}
		if(i==sum) {
			System.out.println("This is a armstrong");
		}
	}
}