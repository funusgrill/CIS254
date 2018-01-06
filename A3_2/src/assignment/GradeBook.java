//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/08/2016(MM/DD/YYYY)
//instructor:Dave Harden
//name of file:GradeBook.java
/*  GradeBook class with a constructor is used to set and retrieve the course name and instructor's name,
 and to create a method that allows GradeBookTest to display welcome message and the instrutor's name.
 It does have a constructor that includes 2 parameters.
 */

package assignment;

public class GradeBook {
	private String courseName;
	private String instructorname;
	
	public GradeBook(String name,String instructor){
	courseName=name;
	instructorname=instructor;
	}//constructor specify with 2 parameters


	public void setCourseName(String name)
	{courseName=name; 
	}//set course name
	
	public String getCourseName()
	{return courseName;
	}//retrieve course name
	
	public void setinstructorname(String instructor)
	{instructorname=instructor; 
	}//set instructor name
	
	public String getinstructorname()
	{return instructorname;
	}//retrieve instructor name
	
	public void displayMessage()//create a method in order to display message to the user
	{System.out.printf( "Welcome to the grade book for\n%s!\n",getCourseName());
	System.out.printf( "This course is presented by: \n%s\n",getinstructorname());
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

