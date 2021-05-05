package techouts;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating Array List 
		
		list.add("Ravi");//Adding object in Array List  
		list.add("Sujay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}

}

}