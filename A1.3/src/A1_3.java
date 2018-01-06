//Name: Siyue Wang
///G number:01036439
//class:CIS 254
//date:01/25/2016
//instructor:Dave Harden
//name of file:A1_3.java




import java.util.Scanner;//use class Scanner from java.util

public class A1_3 
{
	public static void main( String[] args )// main method starts
	{
	
		Scanner input = new Scanner( System.in );//get inputs from the command window
		
		
		int pound;//the number of pounds
		int ounce;//the number of ounces after converting from pounds
		
		System.out.print( "Enter pounds:" );//prompt
		pound = input.nextInt();//read the number of pounds from user's input
		
		ounce = 16*pound; //pounds convert into ounces
		
		System.out.printf( "%d pounds is %d ounces.", pound, ounce ); // display ounces
	}// main method ends
}//end poundsconcert




/*Enter pounds:4
4 pounds is 64 ounces.*/