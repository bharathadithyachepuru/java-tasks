package techouts;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArray {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();//Creating ArrayList
		list.add("Ravi");//Adding object in ArrayList  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
