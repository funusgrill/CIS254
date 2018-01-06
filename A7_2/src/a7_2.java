//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:03/28/2016
//instructor:Dave Harden
//file name:A7_2.java
//function: It asks users to enter a rocket's height, width and number of boxes(stages).
//The rocket is made up of asterisks by two cones and boxes. The codes are separated by
//several parts. The two main parts are boxes and cones. Also, two of them were decompose
//by several methods. It could draw even width, and the top of the cones will appear to
//have two asterisks.




import java.util.Scanner;
 	public class a7_2 {
 		public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int width;
            int height;
            //let the user to enter the inputs
            System.out.print("Enter width: ");
            width = input.nextInt();
            System.out.print("Enter height: ");    
            height = input.nextInt();
            System.out.print("Enter stages: ");    
            int stages = input.nextInt();
            drawRocket(width,height,stages);
 			}
 			
 		
 		
 		
 		
 			public static void drawRocket(int wide, int high, int numberofstages) {
 				//draw cones two times and draw boxes
 				drawCone(wide,high);    
 	        	for(int count=0; count<numberofstages;count++){//loop so that it could draw required number of stages
 	        	drawBox(wide, high);}
 	        	drawCone(wide,high);
 			}

 			
 			
 			
 			
 			//
 			public static void drawCone(int stagewidth, int coneheight) {//draw cones
				int conerow;
				int space1 = 0,space2 = 0;
				//the number of cone's row is determined by stage's width
				// the number of rows is equal to the width of the stages divided by 2 (plus 1 for odd widths)
				if (stagewidth%2 == 0){conerow = (stagewidth - 1) / 2;}
				else{conerow=stagewidth / 2;}
				
				for(int count = 1; count <= conerow + 1; count ++){
					drawSpacesfirst(space1,space2,conerow,count,stagewidth);//draw spaces and the first star
					
					drawOneortwoasterisks(stagewidth,count);//decide to draw the last star or not for first row

						System.out.print("\n");
				}
		}
			
 		
 		
 		
 		
 		
 		public static void drawSpacesfirst//draw spaces and the first star before the second star
 		(int spacefirst,int spacesecond,int ConeR,int Conecount,int coneW){ 
			for(spacefirst = 0;spacefirst <= ConeR - Conecount;spacefirst++){
				System.out.print(" ");//draw spaces before first star
				}
			
				System.out.print("*");//draw first star
				
			for(spacesecond=0;spacesecond < coneW - 2*spacefirst - 2;spacesecond++){
				System.out.print(" ");//draw spaces before the second star
				}}
			
 		
 		
 		
 		
 		
 		
		public static void drawOneortwoasterisks(int conelength,int rowcount) { 
			//decide to draw the last star or not for first row
				if( conelength % 2 == 1 &&rowcount == 1){
					//if the stage width is even then draw a star, otherwise, the odd width do not draw star.
					System.out.print(" ");}
				else {
				System.out.print("*");}
			}
			
			
			
		
		

			public static void drawBox(int boxwidth, int boxheight){
				//draw boxes by width and height
 				drawHorizontalLine(boxwidth);    
 				draw2VerticalLines(boxwidth, boxheight);   
 				drawHorizontalLine(boxwidth);
 			}
 		
			
			
			
			
			
			
 				public static void drawHorizontalLine(int numXs) {   
 					//draw Horizontal Lines of the box
 					for (int count = 0; count < numXs; count++){
 						System.out.print("*");
 					}
 					System.out.println();
 				}

 				
 				
 				
 				
 				
 				public static void draw2VerticalLines(int numSpaces, int numRows) { 
 					//determine how many vertical lines need to draw                   
 					for (int rowCount = 0; rowCount < numRows-2; rowCount++){
 						drawOneRow(numSpaces-2);
 					}
 				}

 				
 				
 				
 				
 				

 				public static void drawOneRow(int numSpaces) {
 					
 					// draw vertical lines with spaces and stars
 					System.out.print("*");
 					for (int spaceCount = 0; spaceCount < numSpaces; spaceCount++){    
 						System.out.print(" ");
 					}
 					System.out.println("*"); 
 				}
}
 	
 	
 	
 	/*
 	
 Enter width: 5
Enter height: 4
Enter stages: 2
  * 
 * *
*   *
*****
*   *
*   *
*****
*****
*   *
*   *
*****
  * 
 * *
*   *

    
Enter width: 6
Enter height: 5
Enter stages: 2
  **
 *  *
*    *
******
*    *
*    *
*    *
******
******
*    *
*    *
*    *
******
  **
 *  *
*    *


*/
