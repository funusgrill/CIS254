/*
Siyue Wang
CIS 254
Assignment 8.2
File: A8_2.java
2016/4/18
Instructor: Dave Harden

This program will show the distinct numbers based on values that
the user entered. The result is separated by spaces and will not
show the same number twice. It asks the user to enter numbers and 
enter negative numbers to quit the program.
*/








import java.util.Scanner;
 	public class A8_2 {
 		public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            	final int size = 1000;
            	//initialize the size of array
            	int count =0;
            	//total amount of numbers
            	int numbers;
            	// the number that the user enter
            	int [] arr = new int [size];
            	//the array that use to store all the numbers
            	System.out.print("Enter a number "
            			+ "(negative number to quit): ");
            	numbers = input.nextInt();
            	arr[count] = numbers;
            	count=1;
        	
            	while (numbers >= 0){
            		System.out.print("Enter a number "
            				+ "(negative number to quit): ");    
            		numbers = input.nextInt();
            			if(readNumbers(numbers, arr, count)
            					&&(numbers>=0))
            				{arr[count] = numbers;
            				count++;}
            			}
            	
            		
            		printNumbers(arr, count);
            		
            		
            input.close();
 	}
 		
 		
 		
 		
 		
 		
 		
 		 /*------------------------------------------------------------------

 	    This method read numbers whether they are distinct or not
 	    by returning false when the number had existed more than 
 	    once.

 	   readNumbers is a boolean method so that it can determine if 
 	   the number should be added into the array. entry is numbers 
 	   entered by user. totalNum is the amount of numbers he entered.
		It determines the loop times. list helps us to find if it is 
		equal to the element of the array.
 	    ------------------------------------------------------------------*/
 		public static boolean readNumbers(int entry, int []list, int totalNum){
 		for (int times=0; times < totalNum;times++){
 			if(entry == list[times]){
 				return false;}
 			}
 			return true;
 		}
 		
 		
 		
 		
 		
 		
 		
 		
 		/*------------------------------------------------------------------

 	    This method print numbers in the array.It separate numbers by spaces.
 	    
 	    print array is used to read the element in the arr. It uses loop to
 	    display every element from the first to the last in order from the 
 	    array.
 	    ------------------------------------------------------------------*/
 		public static void printNumbers(int [] print,int numTotal){
 			System.out.println("You entered: ");
 			for (int num = 0; num < numTotal; num++){
 				System.out.print(print[num]+" ");}
 			
 		}
 		
}
 	
 	
 	
 	/*Enter a number (negative number to quit): 1
 	Enter a number (negative number to quit): 2
 	Enter a number (negative number to quit): 3
 	Enter a number (negative number to quit): 2
 	Enter a number (negative number to quit): 1
 	Enter a number (negative number to quit): 6
 	Enter a number (negative number to quit): 3
 	Enter a number (negative number to quit): 4
 	Enter a number (negative number to quit): 5
 	Enter a number (negative number to quit): 2
 	Enter a number (negative number to quit): -4
 	You entered: 
 	1 2 3 6 4 5 */