

public class Test3 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int largest = arr[1];
        int secondLargest = arr[1];

		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
		}
		
		//This is for find Largest number
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
			
				largest=arr[i];
				
			}
			
	 	}
		//This is for to find second largest if we want 3rd largest num then changed -1 to -2 like that 
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>secondLargest) {
				secondLargest=arr[i];
				
			}
			
		}
		System.err.println("This "+largest+" is First Largest Number in an array ");
		
		System.out.println("This "+secondLargest+" is second Largest Number in an array");
	 
		
		
		
	}

}
