//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/15/2016
//instructor:Dave Harden
//file name:A4_1.java
/*The program is used to calculate the area of square or triangle. The square is represented by s,
and the triangle is represented by t.  If they choose to calculate the triangle's area, then the 
user needs to input the lengths of base and height. If they choose to calculate the square's area, 
then the user needs to input the lengths of side. 
*/

import java.util.Scanner;
	
public class A4_1{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in ); 
		System.out.printf("Enter the type of figure (s or t): ");//ask for the figure,triangle or square
		String figure=input.next();
		
		//determine which figure 's area does the user want to calculate
		if(figure.equals("t")){//calculate triangle's area
			System.out.printf("Enter the base: ");
			double base =input.nextDouble();
			System.out.printf("Enter the height: ");
			double height =input.nextDouble();
			System.out.printf("The area is %.2f\n",height*base/2);
		}else{
			if (figure.equals("s")){//calculate square's area
				System.out.printf("Enter the side: ");
				double side =input.nextDouble();
				System.out.printf("The area is %.2f",side*side);
			}
		}
	}
}
/*Enter the type of figure (s or t): t
Enter the base: 4
Enter the height: 3
The area is 6.00*/
	
/*Enter the type of figure (s or t): s
Enter the side: 9
The area is 81.00*/