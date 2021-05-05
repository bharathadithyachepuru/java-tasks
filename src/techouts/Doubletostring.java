package techouts;

import java.util.Scanner;

public class Doubletostring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the double value");
		Double d = scan.nextDouble();
		String s1 = "";
		s1 = ""+ d;
		System.out.println(s1);

	}

}
