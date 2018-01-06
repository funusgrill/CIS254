//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/08/2016(MM/DD/YYYY)
//instructor:Dave Harden
//name of file:GradeBook.java
/*  GradeBookTest is used to input your course name and instructor's name so that it
 can use method from GradeBook and show the welcoming message. And then,enter a new
 instructor's name. It will use set method to change the instructor's name and display a
 new welcoming message
 */


package assignment;

import java.util.Scanner;

public class GradeBookTest {
public static void main( String[] args ){

	Scanner input = new Scanner( System.in );
	GradeBook myGradeBook = new GradeBook(null,null);
	// assign the Gradebook object to myGradeBook
	
	System.out.println( "Please enter the course name:");
	String course = input.nextLine();
	myGradeBook.setCourseName( course );//set the course name
	System.out.print("Please enter the instructor's name:");
	String instructor = input.nextLine();
	myGradeBook.setinstructorname(instructor);//set the instructor's name
	
	System.out.println();
	
	myGradeBook.displayMessage( );
	System.out.println( "\nChange the instructor's name:" );
	String change = input.nextLine();
	myGradeBook.setinstructorname(change);//set the instructor's name
	
	System.out.println();
	
	myGradeBook.displayMessage( );//display welcome message after changing the instructor's name
	input.close();
	}
}
/*Please enter the course name:
CIS254 Intro to Object Oriented Program Design
Please enter the instructor's name:Dave Harden

Welcome to the grade book for
CIS254 Intro to Object Oriented Program Design!
This course is presented by: 
Dave Harden

Change the instructor's name:
Bruce

Welcome to the grade book for
CIS254 Intro to Object Oriented Program Design!
This course is presented by: 
Bruce
*/
