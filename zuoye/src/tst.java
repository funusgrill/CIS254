import java.util.Scanner;
 	public class tst {
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
            	System.out.print("Enter an integer between 10 and 100: ");
            	numbers = input.nextInt();
            	arr[count] = numbers;
            	count=1;
        	
            	while (count<=3){
            		System.out.print("Enter an integer between 10 and 100:");    
            		numbers = input.nextInt();
            			if(readNumbers(numbers, arr, count)
            					&&(numbers>=0))
            				{arr[count] = numbers;
            				count++;
							System.out.print("This is the first time"+numbers+" has been entered");}
            			}
            	
            		
            		printNumbers(arr, count);
            		
            		
            input.close();
 	}
 		
 		
 		
 		

 		public static boolean readNumbers(int entry, int []list, int totalNum){
 		for (int times=0; times < totalNum;times++){
 			if(entry == list[times]){
 				return false;}
 			}
 			return true;
 		}
 		
 		
 
 		public static void printNumbers(int [] print,int numTotal){
 			System.out.println("The complete set of unique values entered is:");
 			for (int num = 0; num < numTotal; num++){
 				System.out.printf("Unique Value %d: is %d",num+1,print[num]);}
 			
 		}
 		
}