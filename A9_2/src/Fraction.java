//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:05/02/2016
//instructor:Dave Harden
//file name:Fraction.java
//It contains two constructors. One is to initialize the value,
//the other is to supply two parameters, denominator and numerator
//There are four methods to calculate multiplication, division, addition
// and difference. They all use reduce method which is to divide by common
//factor and try from 2 until the larger value between denominator and
//numerator.







import java.lang.Math;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	

	
	
	//Fraction no-argument constructor
	//initialize numerator to 0, denominator to 1;
	public Fraction() {
		this(0,1);
	}
	

	
	
	
	//numerator and denominator supplied
	public Fraction(int numerator, int denominator) {
		this.numerator =numerator;
		this.denominator = denominator;
	}
	
	
	
	
	
	
	
	//print is a method to print the numerator and denominator
	//Separated by a slash. Also, it reduce the fraction before
	//showing them. if they are reciprocal, the result will be 1/1.
	public void print() {
		reduce();
		if( numerator ==  denominator){
			 numerator =  denominator = 1;
		}
		System.out.print( numerator + "/" +  denominator);
	}

	
	
	
	
	
	//return denominator of product and numerator of product.
	//reduce the fraction after multiplication of numerators
	//and denominators(a/b*c/d=ac/bd)
	public Fraction multipliedBy(Fraction frac) {
		
		Fraction product = new Fraction();
		product.numerator =  numerator * frac.numerator;
		product.denominator =  denominator * frac.denominator;
		reduce();
		return product;
	}

	


		
	
	
	//return denominator of quotient and numerator of quotient.
	//reduce the fraction after division of numerators
	//and denominators((a/b) /(c/d)= ad/bc)
	public Fraction dividedBy(Fraction frac) {
		Fraction quotient = new Fraction();
		quotient.numerator =  numerator * frac.denominator;
		quotient.denominator =  denominator * frac.numerator;
		reduce();
			return quotient;
	}
	
	
	
	
	
	//return denominator and numerator after addition.
	//reduce the fraction after addition of numerators
	//and denominators(a/b+c/d=(ad+bc)/bd)
	public Fraction addedTo(Fraction frac) {
		Fraction addition = new Fraction();
		addition.numerator =  numerator * frac.denominator
							+  denominator * frac.numerator;
		addition.denominator =  denominator * frac.denominator;
		reduce();
		return addition;
	}

	
	
	
	
	//return numerator and numerator after subtracting.
	//reduce the result after subtracting of numerators
	//and denominators(a/b-c/d=(ad-bc)/bd)
	public Fraction subtract(Fraction frac) {
		Fraction difference = new Fraction();
		difference.numerator =  numerator * frac.denominator
							-  denominator * frac.numerator;
		difference.denominator =  denominator * frac.denominator;
		reduce();
		return difference;
	}

	
	
	
	
	
	//if the numerators and denominators are equal
	//it will return true
	public boolean isEqualTo(Fraction frac) {
		 return ((numerator == frac.numerator) 
				 && (denominator == frac.denominator));
	}

	
	
	
	
	//reduce the result by loop
	//divide both numerators and denominators by common factors
	//from 2. Loop from 2, divide from 2 until they could not be 
	//dividede simultaneously any more
	public void reduce() {
		for(int count = 2; 
				count < Math.max( numerator, denominator);
				count++){
				if(( numerator % count == 0)
						&& ( denominator % count == 0))
				{ numerator /= count;
				 denominator /= count;}
				}
           
        }
}

/*
The result starts off at 0/1
The product of 9/8 and 2/3 is 3/4
The quotient of 9/8 and 2/3 is 27/16
The sum of 9/8 and 2/3 is 43/24
The difference of 9/8 and 2/3 is 11/24
The two Fractions are not equal.
The product of 3/2 and 2/3 is 1/1
*/
