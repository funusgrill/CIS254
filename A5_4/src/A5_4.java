//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/22/2016
//instructor:Dave Harden
//file name:A5_4.java
//function: User need to enter each person's age and food
//preference. If he enters the negative number, he can
//quit and get the results including the number of people,
//average age, the number of food preferences, the min age(youngest) 
//and the max age(oldest).If he enter the negative number
//at the first time, he will be told that he enter the wrong
//number and will not get the result.





import java.util.Scanner;
public class A5_4 {
	public static void main( String[] args ){
	Scanner input = new Scanner( System.in );
	
	//variables for ages
	int underage = 0;
	int young = 0;
	int mature = 0;
	int middleage = 0;
	int elders = 0;
	
	//variables for foods
	String food;
	int popcorn=0;
	int soda=0;
	int both=0;
	
	//variables for averages,max and min
	int count = 0;
	int total = 0;
	int average = 0;
	int minimum = 0;
	int maximum = 0;
	
	System.out.print(" Enter age of attendee (negative number to quit):");
	int age=input.nextInt();
	minimum = age;
	maximum = age;
	
	if (age<0){//if user input the negative number, it will warn the user.
	     System.out.println("There is no results since you did not enter number greater than 0.");
	} else {
		while(age>=0){
			
			total+=age;
			count++;
			average=total/count;
			//count the  number of people in each group
			if (0<=age && age<=18){
				underage++;
			}else if(19<=age && age<=30){
					young++;
			}else if(31<=age && age<=40){
						mature++;
			}else if(41<=age && age <=60){
							middleage++;
			}else{elders++;}
			//count the food preferences
			System.out.print(" Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):");
			food=input.next();
			switch(food){
			case "p":
				popcorn ++;
				break;
		
			case "s":
				soda ++;
				break;
		
			case "b":
				both ++;
				break;
				
			default:
				System.out.print("You need to enter letters!");
				break;}
			//calculate the youngest and oldest
			if (age < maximum){
                maximum = age;
            }
			if (age > minimum){
                minimum = age;
            }
			
			System.out.print(" Enter age of attendee (negative number to quit):");
			age=input.nextInt();
			
		}
	displayages(underage, young, mature, middleage, elders);
	//display the number of people in each category
	displayfood(popcorn,soda,both);
	// display the number of food preferences in each category
	displayavemaxmin(average, minimum, maximum);
	//display the average age, the youngest and the oldest.
	}
}

	
//create a method to display the number of people in each category
public static void displayages( int under18,int under30,
		int under40,int under60,int over60){
	
	System.out.printf("\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
			"age 0  to 18: ",under18,
			"age 19 to 30: ",under30,
			"age 31  to 40: ",under40,
			"age 41 to 60: ",under60,
			"over 60: ",over60);
	}
//create a method to display the number of food preferences in each category
public static void displayfood( int pop, int sd, int bo){
	System.out.printf("\n%s%d\n%s%d\n%s%d\n",
			 "food preference popcorn:" ,pop,
			 "food preference soda:", sd,
			 "food preference both:", bo);
	}
//create a method to display the average age, the youngest and the oldest.
public static void displayavemaxmin( int ave, int max, int min){
	System.out.print(
	"The average age was " +ave+".\n"
    +"The youngest person in attendance was "+ min+".\n"
    +"The oldest person in attendance was " +max+".");
	}
}

/* Enter age of attendee (negative number to quit):34
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):s
 Enter age of attendee (negative number to quit):16
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):b
 Enter age of attendee (negative number to quit):68
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):b
 Enter age of attendee (negative number to quit):53
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):s
 Enter age of attendee (negative number to quit):39
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):p
 Enter age of attendee (negative number to quit):23
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):s
 Enter age of attendee (negative number to quit):21
 Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):s
 Enter age of attendee (negative number to quit):-1

age 0  to 18: 1
age 19 to 30: 2
age 31  to 40: 2
age 41 to 60: 1
over 60: 1

food preference popcorn:1
food preference soda:4
food preference both:2
The average age was 36.
The youngest person in attendance was 16.
The oldest person in attendance was 68.*/
