//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/15/2016
//instructor:Dave Harden
//file name:A4_2.java
/*The program is used to assort education level of students by their education years.
The user should input their number of years of schooling, and then use if method to tell
which level they are. The number of schooling is less than or equal to 0, then it will out
 put none.The number of schooling is 1-6, then it will out put elementary school. The number
 is 7 - 8, then it will out put middle school. 9-12 is high school. other else numbers
 are college.
 */


import java.util.Scanner;

public class A4_2 
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in ); 
		
		int year;
		System.out.print("enter the number of years of schooling: ");
		year=input.nextInt();
		if (year<=0) {// schooling year is less than or equal to 0
			System.out.println("none");
		} else {
			if (year>=1 && year<=6) {// schooling year is greater than 1 or less than 6
				System.out.println("elementary school");     
			} else {
				if (year>=7 && year<=8) {// schooling year is greater than 7 or less than 8
					System.out.println("middle school");
				} else {
					if (year>=9 && year<=12) { //schooling year is greater than 9 or less than 12
						System.out.println("high school");
					} else {//schooling year is greater than 12
						System.out.println("college");
					}
				}
			}
		}
	}
}
/*enter the number of years of schooling: -1
none*/
/*enter the number of years of schooling: 5
elementary school*/
/*enter the number of years of schooling: 7
middle school*/
/*enter the number of years of schooling: 12
high school*/
/*enter the number of years of schooling: 14
college*/