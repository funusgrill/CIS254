//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/22/2016
//instructor:Dave Harden
//file name:A5_4.java
//function: Users need to enter the number of the pounds 
//he needs to convert. If he wants to quit, he needs to
// in put a negative number. It use special value type loop so that
// the command will continue to be executed, until the negative
// input.



import java.util.Scanner;

public class A5_3 {
	public static void main( String[] args )
	{
			
		Scanner input = new Scanner( System.in );
				
		String response;
		int pound;
		int ounce;
		
		System.out.print( "Enter pounds(negative number to quit):");
		pound = input.nextInt();
		//loop until user  wants to quit
		while(pound>0){
			ounce = 16*pound; 
			System.out.printf( "%d pounds is %d ounces.\n", pound, ounce ); 
			
			System.out.print( "Enter pounds(negative number to quit):");
			pound = input.nextInt();
		}
	}
}
/*Enter pounds(negative number to quit):3
3 pounds is 48 ounces.
Enter pounds(negative number to quit):4
4 pounds is 64 ounces.
Enter pounds(negative number to quit):-2*/