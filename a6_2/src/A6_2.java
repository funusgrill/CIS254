//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:03/07/2016
//instructor:Dave Harden
//file name:A6_2.java
//function: It asks users to enter how many numbers they will enter.
//It uses for loop to ask user to enter numbers for the required times.
//if method could calculate the position of 7. If 7 appears, then the count
//at that time is the position. If no 7 is entered, it also will display 
//the message that no 7 is entered.



import java.util.Scanner;
public class A6_2 {
	public static void main( String[] args ){
	Scanner input = new Scanner( System.in );
	//prepare variables 
	int entry = 0;
	int first=0;
	int last=0;
	int seven=0;
	int count=1;
	
	System.out.print("How many numbers will be entered? ");//ask how many times
	int number = input.nextInt();
		
	for(count=1;count<=number;count++)//loop for user's required times
	{System.out.print("Enter num: ");
			entry = input.nextInt();
			if(entry==7 && seven==0){//count the first time 7 appears
				first=count;
				seven++;}
			if(entry==7 && seven==1){//count the last time 7 appears
				last=count;}
		}
		
		if (seven==0){//show user that there is no 7 
		System.out.println("Sorry, no 7's were entered.");}
			else{ System.out.print("The first 7 was in position "+ first  
					+"\nThe last 7 was in position "+last);}
	}
}



/*How many numbers will be entered? 8
Enter num: 5
Enter num: 7
Enter num: 6
Enter num: 7
Enter num: 7
Enter num: 3
Enter num: 8
Enter num: 6
The first 7 was in position 2
The last 7 was in position 5

How many numbers will be entered? 8
Enter num: 5
Enter num: 2
Enter num: 6
Enter num: 7
Enter num: 1
Enter num: 3
Enter num: 8
Enter num: 6
The first 7 was in position 4
The last 7 was in position 4

How many numbers will be entered? 8
Enter num: 5
Enter num: 1
Enter num: 6
Enter num: 5
Enter num: 9
Enter num: 3
Enter num: 8
Enter num: 6
Sorry, no 7's were entered.
*/