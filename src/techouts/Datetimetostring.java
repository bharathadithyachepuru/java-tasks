package techouts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Datetimetostring {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
		String date="15-02-2021 05:11:23";
		
		System.out.println(sdf.parse(date));

	}

}
