package techouts;

import java.util.Arrays;

public class Sequencechange {

	public static void main(String[] args) {
		
		String s1 = "MYHOMEISJEWEL";
		char[] ch = s1.toCharArray();
		String s2 = "JEWELISMYHOME";
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch);
		Arrays.equals(ch, ch2);
		System.out.println(ch2);
		
	}

}
