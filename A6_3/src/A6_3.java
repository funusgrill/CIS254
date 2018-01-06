//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:03/07/2016
//instructor:Dave Harden
//file name:A6_2.java
//function: It asks users to enter the number so that it can calculate 
//the sum of square from1 to the user's required number.
//For loop is used to ask the numbers for the required times. Also, it adds
//up the sum so far to get the answer.if the required number if less than 1, 
//user can quit the program.


import java.util.Scanner;
public class A6_3 {
	public static void main( String[] args ){
	Scanner input = new Scanner( System.in );
	
	int sum=0;
	
	System.out.print("Enter a number greater than 0 (less than 1 to quit): ");
	int entry = input.nextInt();
	
		while(entry>=1){//loop only for the number greater than or equal to 1,otherwise,quit
			for(int count=0;count<=entry;count++){
			sum = count*count+sum;}//add square to sum so far
			

			System.out.printf("The sum of the squares from 1 to %d is %d\n",entry,sum);
			
			System.out.print("Enter a number greater than 0 (less than 1 to quit): ");
			entry = input.nextInt();
			sum=0;//Reinitialize sum to 0
		}
	}
}

/*Enter a number greater than 0 (less than 1 to quit): 4
The sum of the squares from 1 to 4 is 30
Enter a number greater than 0 (less than 1 to quit): 1
The sum of the squares from 1 to 1 is 1
Enter a number greater than 0 (less than 1 to quit): 0
*/