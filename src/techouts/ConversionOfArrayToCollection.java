package techouts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ConversionOfArrayToCollection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Program on how to convert an array in to a collection

		BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many elements you want to add to the array");
		
		int n = Integer.parseInt(out.readLine());
		
		String[] name = new String[n];
		
		for(int i=0; i<n; i++) {
			
			name[i] = out.readLine();
			
		}
		
		List<String> list = Arrays.asList(name);
		System.out.println();
		
		for(String li: list) {
			
			String str = li;
			
			System.out.println(str+" ");
			
			
			
		}

	}

}
