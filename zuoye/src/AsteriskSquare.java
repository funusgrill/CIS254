import java. util. Scanner; 
 class AsteriskSquare
{
		public static void main( String args[])
		{

		Scanner input = new Scanner (System.in);
			int count,size;
			int space;
			int height;
			size=count=0;
			space=size;
		System.out.print("Enter the size of the asterisk square from 1-20:");
		int a =input.nextInt();
			if(a==1){System.out.print("*" );}
			else{
			for(count=a;size<count;size++){
		         System.out.print("*" );
		         System.out.print("");	    
			}
			
			for(height=0;height<a-2;height++){
			System.out.print("\n*" );
			for(space=0;space < count-2;space++){
		    System.out.print(" " );}
			System.out.print("*" );}
			
			System.out.println();
			for(size=0;size<count;size++){
		         System.out.printf("*" );
		         System.out.print("");
			}}
			}}