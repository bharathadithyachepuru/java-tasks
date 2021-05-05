package techouts;

import java.util.Iterator;
import java.util.Stack;

public class StackList {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();  
		stack.push("");  
		stack.push("Amit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Ayush");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
