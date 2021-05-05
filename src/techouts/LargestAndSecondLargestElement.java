package techouts;

public class LargestAndSecondLargestElement {

	public static void main(String[] args) {
		
		
		//Initialization of an array
		int ar[] = new int[] {1,3,8,22,14,6,21,25}; 
		
		//Comparison
		int max = ar[0];
		
	    //Iteration
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>max)
				
				max = ar[i];
		}
		
		int max1 = ar[0];
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>max1 && ar[i]!= max)
				
				max1 = ar[i];
		}
		
		
		System.out.println("Largest element present in the array:"+max);
        
		System.out.println("Second largest element present in the array:"+max1);
	}

}
