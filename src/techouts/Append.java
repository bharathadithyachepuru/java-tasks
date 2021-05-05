package techouts;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter the 10 strings that are to be appended");

		// try {
		for (int i = 0; i < 10; i++) 
		{
			str[i] = sc.nextLine();
		}

		// }
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("please enter specified no of strings only");
		// 
		for (int j = 0; j < str.length; j++) 
		{
			sb = sb.append(str[j]);
		}

		System.out.println(" 10 Strings are appended ");
		System.out.println(sb.toString());
	    
}	

}

