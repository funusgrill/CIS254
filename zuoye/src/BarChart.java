import java. util. Scanner; 
public class BarChart {
	public static void main( String args[])
	{

	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter an integer(1-30):");
	int first=input.nextInt();
	
	System.out.println("Enter an integer(1-30):");
	int second=input.nextInt();
	
	System.out.println("Enter an integer(1-30):");
	int third=input.nextInt();
	
	System.out.println("Enter an integer(1-30):");
	int fourth=input.nextInt();
	
	System.out.println("Enter an integer(1-30):");
	int fifth=input.nextInt();
	
for (int count = 0; count < first; count++) 
{
 System.out.print("*");}
for (int count = 0; count < second; count++) 
{
 System.out.print("*");}
for (int count = 0; count < third; count++) 
{
 System.out.print("*");}
for (int count = 0; count < fourth; count++) 
{
 System.out.print("*");}
for (int count = 0; count < fifth; count++) 
{
 System.out.print("*");}
	}
}