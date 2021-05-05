package techouts;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n=5;
		
		int x=1, y=2*n-1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<2*n; j++) {
				
				if(j>=x && j<=y)
					
					System.out.printf("%2c", '*');
				else
					System.out.printf("%2c", ' ');
			}
			
			System.out.println();
			x++;
			y--;
		}

	}

}
