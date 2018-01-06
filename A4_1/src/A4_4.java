//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/15/2016
//instructor:Dave Harden
//file name:A4_4.java
/*The program is used to calculate the net cost and gross cost for calls from San 
 Francisco  to Miami, Florida. it needs to read start time and length of call in 
 minutes from the users. The clock is based on 0-2400. The gross cost is the cost
 before tax and discount. The net cost is the cost after tax and discount. It uses 
 if else method to determine which formula need to apply for different start time and 
 length.
*/


import java.util.Scanner;

public class A4_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in ); 
		
		double netcost;
		
		System.out.printf( "Enter start time: ");
		int timestart=input.nextInt();
		System.out.printf( "Enter  length of call in minutes: ");
		int length=input.nextInt();
		
		double grosscost=0.4*length;
		System.out.printf( "gross cost: $%.2f\n",grosscost);
		
		if((timestart <=800 || timestart > 1800) && (length<60)){
			netcost=0.5*grosscost*1.04;
			System.out.printf( "net cost: $%.2f",netcost);
		}else{
			if((timestart>1800 || timestart<=800) && (length>=60)){
				netcost=0.5*grosscost*1.04*0.85;
				System.out.printf( "net cost: $%.2f",netcost);
			}else{
				if((timestart<=1800 && timestart>800) && (length>=60)){
					netcost=grosscost*1.04*0.85;
					System.out.printf( "net cost: $%.2f",netcost);
				}else{ netcost=grosscost*1.04;
					System.out.printf( "net cost: $%.2f",netcost);
				}
			}
		}
	}
}
/*Enter start time: 2232
Enter  length of call in minutes: 67
gross cost: $26.80
net cost: $11.85*/

/*Enter start time: 759
Enter  length of call in minutes: 10
gross cost: $4.00
net cost: $2.08*/

/*Enter start time: 1300
Enter  length of call in minutes: 100
gross cost: $40.00
net cost: $35.36*/

/*Enter start time: 1300
Enter  length of call in minutes: 10
gross cost: $4.00
net cost: $4.16*/