package techouts;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int ar[] = new int[] {1,5,13,11,12,12,18};
		
		System.out.println("Duplicate elements in the given array:");
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]== ar[j])
					
					System.out.println(ar[j]);
			}
			
		}

	}

}
