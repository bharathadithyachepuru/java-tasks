package techouts;

import java.util.TreeSet;

public class DuplicatesAndSorting {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,5,4,4,7,9,8,9,10};
		TreeSet<Integer> tree = new TreeSet<Integer>();

		for(int i = 0; i< arr.length; i++) {
		    tree.add(arr[i]);
		}

		arr = new Integer[tree.size()];
		tree.toArray(arr);
		for(int i = 0; i< arr.length; i++) {
		    System.out.print(arr[i] + "\t");
		}

	}

}
