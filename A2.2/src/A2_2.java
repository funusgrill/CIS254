//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/01/2016(MM/DD/YYYY)
//instructor:Dave Harden
//name of file:A2_2.java
/*The program is used to change cents to quarters, dimes, nickels, and pennies if the user only wants to
 use these four measures. It reads input from the user in cents.The program declares 5 variables: pennies,
 nickels,dimes and quarters.Then change the amount in cents by using modulus operator and division 
 arithmetic to get the number of the other four required measures.
 */


import java.util.Scanner;//use class Scanner from java.util

public class A2_2 {

	public static void main( String[] args ){// main method starts
		
		
		int cents,pennies,nickels,dimes,quarters;
		//amount of cents and the number of pennies,nickels,dimes and quarters if using the four measures
		Scanner input = new Scanner(System.in);//get input from the command window
		
		System.out.print( "Enter number of cents:" );//prompt
		cents = input.nextInt();//read number of cents from the user
		
		pennies=cents%25%10%5;//find the reminder from dividing by 25,10 and 5
		nickels=cents%25%10/5;//find the reminder from dividing by 25 and 10, then divide by 5
		dimes=cents%25/10;//find the reminder from dividing by 25, then  divide by 10
		quarters=cents/25;//cents divided by 25
		
		System.out.println("pennies: "+pennies+"\n"
		+"nickels: "+nickels+"\n"
		+"dimes: "+dimes+"\n"
		+"quarters: "+quarters);
		//display number of pennies,quarters,dimes and quarters
		
		input.close();//close "object" input
	}//end main method
}//end class A2_2


/*Enter number of cents:119
pennies:4
nickels:1
dimes:1
quarters:4*/