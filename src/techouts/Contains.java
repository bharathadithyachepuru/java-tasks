package techouts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contains {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String my_str=scanner.nextLine();
		
		
	      Pattern my_pattern = Pattern.compile("[^a-zA-Z0-9 ]", Pattern.CASE_INSENSITIVE);
	      Matcher my_match = my_pattern.matcher(my_str);
	      boolean check = my_match.find();
	      if (check)
	         System.out.println("Numbers and Special characters found in the string");
	      else
	         System.out.println("Numbers and Special characters not found in the string");

	}

}
