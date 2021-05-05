package techouts;

import java.util.Scanner;

public class Integertostring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		String s1 = Integer.toString(num);
		System.out.println("String:"+s1);
		

	}

}
