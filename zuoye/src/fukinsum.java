import java. util. Scanner; 
import static java.lang.System.*;
public class fukinsum {
	public static void main( String args[])
	{

	Scanner input = new Scanner (System.in);
	double lower =0;
	double upper=input.nextDouble();
	double n=input.nextDouble();
	
	
	
	for(lower=input.nextDouble();lower<=upper+n;lower+=n){
		System.out.print(5*Math.log(lower*lower*lower+3)+"\n");
	}
	}
}
