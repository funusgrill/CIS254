//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/15/2016
//instructor:Dave Harden
//file name:A4_3.java
/*The program is used as a simple calculator. It only can operate addition,
 quotient, multiplication and difference. It tells user to enter the first number,
 second number and his required operation. It uses switch method to determine what 
 shoud be out put for +,-,x and /.
 */

import java.util.Scanner;

public class A4_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in ); 
		
		System.out.print("enter the first number: ");
		int number1 = input.nextInt();  
		System.out.print("enter the operator: ");
	    char operator=input.next().charAt(0);
		System.out.print("enter the second number: ");
	    int number2 = input.nextInt();  

		switch(operator)
		{
        	case '+':
        		System.out.printf("result: %d",number1+number2);
        		break;  
        	case '-':  
        		System.out.printf("result: %d",number1-number2);
        		break;  
        	case 'x':  
        		System.out.printf("result: %d",number1*number2); 
        		break;  
        	case '/':  
        		System.out.printf("result: %d",number1/number2);
        		break;  
        	default:  
        		System.out.println("no way");
        		break;  
        }  
    }  
}
/*enter the first number: 3
enter the operator: +
enter the second number: 6
result: 9*/

/*enter the first number: 6
enter the operator: -
enter the second number: 3
result: 3*/

/*enter the first number: 3
enter the operator: x
enter the second number: 6
result: 18*/

/*enter the first number: 6
enter the operator: /
enter the second number: 3
result: 2*/

/*enter the first number: 2
enter the operator: =
enter the second number: 3
no way*/