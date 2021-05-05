package techouts;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist 
{

	public static void main(String[] args) 
	{
		
		LinkedList<String> al=new LinkedList<String>(); 
		
		al.add("Ajay");  
		al.add("Adithya");  
		al.add("Ravi");  
		al.add("Ajay"); 
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  

	}

}
}
