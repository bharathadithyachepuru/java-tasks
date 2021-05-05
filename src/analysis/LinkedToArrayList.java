package analysis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedToArrayList {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("Bharath");
		
		linkedlist.add("Adithya");
		
		linkedlist.add("kareem");
		
		linkedlist.add("Sumanth");
		
		ArrayList<String> list = new ArrayList<String>(linkedlist);
		
		/*for(String str : list) {
			
			System.out.println(str);
		}*/
		
		Iterator<String> itr = linkedlist.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
System.out.println(linkedlist.get(1));
	}

}
