package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		System.out.println("Enter the date(dd-MMM-yyyy:)");
	    Scanner scan=new Scanner(System.in);
	    String input=scan.nextLine();
		
	    SimpleDateFormat formatter = new SimpleDateFormat( "dd-MMM-yyyy" );  
	    
	    try {
			java.util.Date d1 = formatter.parse(input);
			Calendar calendar1 = Calendar.getInstance();
			calendar1.setTime(d1);
			DateFormat f = new SimpleDateFormat("EEEE"); 
			String d= f.format(d1);
			System.out.println(d);
		} 
	    catch (ParseException e) {
			
		e.printStackTrace();
		}

	}

}
