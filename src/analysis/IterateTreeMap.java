package analysis;

import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> hm = new TreeMap<String, String>();
       
		hm.put("first", "Bharath");
        hm.put("second", "Adithya");
        hm.put("third","Kareem");
        hm.put("fourth", "Sumanth");
        
        hm.put("five", null);
        
        hm.put("sixth", null);
        
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));

            
	}

}
	
}
