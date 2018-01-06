import java.util.Scanner;
public class triangle {
		public static void main( String[] args ){
		Scanner input = new Scanner( System.in );
						int countsofar=1;
			System.out.print("Enter an integer to be a limit of the pattern:");
				int limit=input.nextInt();
			int row,column,space;
			System.out.print("Pattern A: \n");
				for ( row = 1; row <= limit; row++ )
					 {
					 for ( column = 1; column <= row; column++ )
					 System.out.print( "*" );
					
					System.out.println();
					} 

					
					System.out.print("\nPattern B: \n");
					for ( row = limit; row >= 1; row-- )
					{
						for ( column = 1; column <= row; column++ )
							System.out.print( "*" );
						System.out.print("\n");} 

					System.out.print("\nPattern C: \n");

					
					for ( row = limit; row >= 1; row-- )
					{
						for ( space = limit; space > row; space-- )
							System.out.print( " " );
						for ( column = 1; column <= row; column++ )
							System.out.print( "*" );
						System.out.print("\n");
					} 
					
					System.out.print("\nPattern D: \n");

					for ( row = limit; row >= 1; row-- ) {
						for ( space = 1; space < row; space++ )
							System.out.print( " " );
						for ( column = limit; column >= row; column-- )
							System.out.print( "*" );
						System.out.print("\n");}
 
		}}