package analysis;

import java.util.HashSet;

public class HashsetToArray {

	public static void main(String[] args) {

	HashSet<String> hset = new HashSet<String>();
	
	hset.add("Bharath");
	
	hset.add("Adithya");
	
	hset.add("Kareem");
	
	hset.add("Sumanth");
	
	System.out.println("HashSet contains:"+hset);

	String[] array = new String[hset.size()];
	
	hset.toArray(array);
	
	System.out.println("Array elements :");
	
	for(String temp : array) {
		
		System.out.println(temp);
	}
	
	
	}

}
