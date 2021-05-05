package techouts;

import java.util.ArrayList;

public class ElementExists {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        // check if ArrayList contains element
        if (al.contains(4)) {
            System.out.println("4 was found in the list");
        } 
        
        else {
            System.out.println("4 was not found in the list");
        }

	}

}
