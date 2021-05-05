package analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class DifferentActionsInArrayList {

	public static void main(String[] args) {

ArrayList<String> list=new ArrayList<String>();


	    list.add("Bharath");
		
		list.add("Adithya");
		
		list.add("Kareem");
		
		list.add("Sumanth");
		
		System.out.println("before sorting:"+list);
		
		list.add(1,"Phani"); 
		
		System.out.println("after adding element:"+list);
		
		Collections.sort(list);
		
		System.out.println("after sorting:"+list);
		
		System.out.println("searching element:"+list.contains("Adithya"));
		
		Collections.sort(list, Collections.reverseOrder()); 
		
		System.out.println("descending order:"+list);
		
		list.set(0,"Gupta");
		
		System.out.println("After replacing element:"+list);
		
	    ListIterator<String> itr=list.listIterator();
		
		itr.add("Vinay");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());

	  }

	}
}
