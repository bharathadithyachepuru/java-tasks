package techouts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stringtodatetime {

	public static void main(String[] args) throws ParseException {
		
		String sDate1="20/02/2021";
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);

	}

}
