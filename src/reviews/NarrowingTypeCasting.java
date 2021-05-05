package reviews;

public class NarrowingTypeCasting {

	public static void main(String[] args) {
		
		float a = 9.8f;  
		  
		long b = (long) a;  
		
		int c = (int) b; 
		
		System.out.println("Before converting float value is "+a);  
		System.out.println("After converting long value is "+b);  
		System.out.println("After converting int value is "+c);

	}

}
