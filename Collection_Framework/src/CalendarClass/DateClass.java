package CalendarClass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateClass {
	public static void main(String args[])
	{
		
		Date d=new Date();

		
		DateFormat fmt=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.MEDIUM,  Locale.UK);

		
		String str=fmt.format(d);

		
		System.out.println(str);
	}


}
