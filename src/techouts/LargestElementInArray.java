package techouts;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		//Initialization of an array
				int ar[] = new int[] {7,13,8,14,18,5,28,34}; 
				
				//Comparison
				int max = ar[0];
				
			    //Iteration
				for(int i=0;i<ar.length;i++) {
					
					if(ar[i]>max)
						
						max = ar[i];
				}
				
				System.out.println("Largest element present in the array:"+max);

	}

}
