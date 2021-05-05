package techouts;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {

		
        /*ArrayList declaration and initialization*/
      ArrayList<String> cities= new ArrayList<String>();
      cities.add("Boston");
      cities.add("Dallas");
      cities.add("San jose");
      cities.add("Chicago");

         /*ArrayList to Array Conversion */
         String citinames[]=cities.toArray(new String[cities.size()]);

         /*Displaying Array elements*/
     for(String k: citinames)
    {
       System.out.println(k);
   }
		
 }

}
