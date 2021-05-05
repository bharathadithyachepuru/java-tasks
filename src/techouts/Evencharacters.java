package techouts;

import java.util.Scanner;

public class Evencharacters {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string");
		String s=scanner.nextLine();
		
	 for(int i=0;i<s.length();i++)
	 {
		if((i+1)%2==0)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	 }
		
		

	}

	
	
	}


