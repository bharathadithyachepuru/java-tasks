package techouts;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInterface {

	public static void main(String[] args) {
		
		//DeQueue
		//   | 
		//Array DeQueue
		
        
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Abhay");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  

	}

}
