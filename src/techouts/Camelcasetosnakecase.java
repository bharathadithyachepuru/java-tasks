package techouts;

import java.util.Scanner;

public class Camelcasetosnakecase {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string");
		String s=scanner.nextLine();
		
		String str="";
		for(int i=0;i<s.length();i++)
			
		{
			
			if(s.charAt(i)==' ')
			{
				str=str+"_";
			}
			else
			{
				str=str+Character.toLowerCase(s.charAt(i));
			}
			}
		System.out.println(str);
		
	}

}	
		
		

	