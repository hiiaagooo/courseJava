package partTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Dates {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		
		
		Date y1 = sdf1.parse("15/08/2020");
		Date y2 = sdf1.parse("15/08/2020 15:42:00");
		
		System.out.println("UTC (local)");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y1: " + sdf2.format(y2));
		
		System.out.println("GMT (+3)"); 
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y1: " + sdf3.format(y2));

	}

}
