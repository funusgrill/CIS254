//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:02/01/2016(MM/DD/YYYY)
//instructor:Dave Harden
//name of file:A2_3.java
/*The program is used to change degrees Celsius to Fahrenheit. It use Scanner from java.util so that
 it can read input from the user. The program declares 2 variables:degrees Celsius and Fahrenheit.
 It convert the amount that the user typed in by using temperature formula.*/



import java.util.Scanner;//use class Scanner from java.util

public class A2_3 {
    public static void main(String[] args) {// main method starts
        int degreesCelsius;//number of degrees Celsius
        int Fahrenheit;//number of Fahrenheit
        Scanner input = new Scanner(System.in);//get input from user

        System.out.print("enter degrees Celsius: ");//prompt
        degreesCelsius = input.nextInt();//read number of degrees Celsius user want to convert
        Fahrenheit= degreesCelsius*9/5+32;//temperature Conversion formula,then store in Fahrenheit
        
        System.out.println(degreesCelsius+" degrees Celsius is "+Fahrenheit+" degrees Fahrenheit.");
        //display degrees Celsius is equivalent to other number in Fahrenheit
        input.close();//close "object" input
    }//end main method
}//end class A2_3

/*enter degrees Celsius: 30
30 degrees Celsius is 86 degrees Fahrenheit.
*/