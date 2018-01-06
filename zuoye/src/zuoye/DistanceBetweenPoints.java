package zuoye;

import java.util.Scanner;
public class DistanceBetweenPoints{
	public static void main(String[] args){
			Scanner input = new Scanner( System.in );
		 String answer=null;
		 System.out.print("Enter a number:");
			int z= input.nextInt();
			if(isEven(z))System.out.print(z+" is even"+"\n");
			else System.out.print(z+" is odd"+"\n");
			System.out.print("Enter y to play again, n to quit(y/n):");
			   answer=input.next();
		while(answer.equals("y")){
			 System.out.print("Enter a number:");
			 z= input.nextInt();
			if(isEven(z))System.out.print(z+" is even"+"\n");
			else System.out.print(z+" is odd"+"\n");
			System.out.print("Enter y to play again, n to quit(y/n):");
			   answer=input.next();
	  }}



public static boolean isEven(int a){
	return a%2==0;}}