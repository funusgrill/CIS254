 package zuoye;
import java.util.Scanner;
public class DateTest {
		static int d,m,y;
	       public static void main(String[] args ) {
	    	   Scanner input = new Scanner(System.in);
	           int month,date,year;
	    	   System.out.printf("Enter the month, day and year in the form XX XX XXXX and hit enter:");
	           month= input.nextInt();
	           date=input.nextInt();
	           year=input.nextInt();
	           Date day=new Date(month,date,year);
	           day.displayDate();
	           System.out.print ("Enter a new year:");
		        y = input.nextInt();
		        day.setYear(y);
		        day.displayDate();
		        System.out.print ("Enter a new day:");
			    d = input.nextInt();
			    day.setDay(d);
			    day.displayDate();
		        System.out.print ("Enter a new month:");
			    m = input.nextInt();
			    day.setMonth(m);
			    day.displayDate();
	       
	       }

	}
