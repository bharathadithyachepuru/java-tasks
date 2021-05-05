package techouts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionClass {

	public static void main(String[] args) {
       
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes"); 
	      
	      for(String str:list)
	      {
	      //Printing the arraylist object   
	      System.out.println(str);  
		
	      }
	}

}
