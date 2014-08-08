package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class datediff {

	public static void main(String[] args) {
		 	
			System.out.println("Enter the old date(dd-MMM-yyyy:)");
		    Scanner scan1=new Scanner(System.in);
		    String Datestart=scan1.nextLine();
		    
		    System.out.println("Enter the new date(dd-MMM-yyyy:)");
		    Scanner scan2=new Scanner(System.in);
		    String Dateend=scan2.nextLine();
		    
		    SimpleDateFormat formatter = new SimpleDateFormat( "dd-MMM-yyyy" ); 
		    
	
	try {
		Date d1 = formatter.parse(Datestart);
		Date d2 = formatter.parse(Dateend);
	
		
		Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(d1);
        calendar2.setTime(d2);
        long milliseconds1 = calendar1.getTimeInMillis();
        long milliseconds2 = calendar2.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        
        long diffDays = diff / (24 * 60 * 60 * 1000);
       
        
        System.out.println("Date Difference: " + diffDays + " days.");
 
		
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	

	
			

	}

}
