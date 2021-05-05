package analysis;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Bharath");
		
		list.add("Adithya");
		
		list.add("Kareem");
		
		list.add("Sumanth");
		
		
		System.out.println("Before reversing of arraylist:");
		
		System.out.println(list);
		
		
		Collections.reverse(list);
		
		System.out.println("After reversing of arraylist");
		
		System.out.println(list);
		
	}

}
