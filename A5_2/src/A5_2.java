//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/22/2016
//instructor:Dave Harden
//file name:A5_4.java
//function: Users need to enter the number of the pounds 
//he needs to convert. If he wants to quit, he needs to
// in put a negative number. It use question type loop so that
// the command will continue to be executed, until the "No"
// answer.





import java.util.Scanner;
public class A5_2 {
	public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
			
		String response;
		int pound;
		int ounce;
	
		System.out.print("Do you need to convert pounds to ounces Yes or No? ");
		response = input.next();
    
		while(response.equals("Yes")){
			System.out.print( "Enter pounds:" );
			pound = input.nextInt();
	
			ounce = 16*pound; 
			System.out.printf( "%d pounds is %d ounces.\n", pound, ounce ); 
		
			System.out.print("Do you need to convert pounds to ounces Yes or No? ");
			response = input.next();
		}
	}
}
/*Do you need to convert pounds to ounces Yes or No? Yes
Enter pounds:5
5 pounds is 80 ounces.
Do you need to convert pounds to ounces Yes or No? Yes
Enter pounds:6
6 pounds is 96 ounces.
Do you need to convert pounds to ounces Yes or No? No
*/