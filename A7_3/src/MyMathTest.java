//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:03/28/2016
//instructor:Dave Harden
//file name:MyMathTest.java
//Function: It is used to display perfect numbers between 1 and 10000
//and prime numbers between 1 and 1000.It uses a method to determine whether
// positive integer is prime. If it¡¯s divisible by only 1 and itself, it is 
// a prime number. Also, it uses a method to determine whether it is a perfect or not.
//If it equals to the sum of its factors except it self, then it is a perfect number.




import javax.swing.JOptionPane;
	public class MyMathTest {
		public static void main(String[] args) {
			
			
            MyMath Math = new MyMath();
            String choice = JOptionPane.showInputDialog(
            		"Do you want to display the prime numbers in 1-1000"
            		+ "\nor the perfect numbers in 1-10,000?"
            		+ "\n(perfect or prime or others to quit)");
            
            
            
            int perfectnumber = 0;
            int primenumber = 0;
            int count = 0;
            switch(choice){
            //three conditions for each choice
            case "perfect":
            	String perfectmessage = "The perfect numbers in 1-10000 are:\n";
            	for(perfectnumber=6; perfectnumber<=10000; perfectnumber++){
            		//under 10000
            	if(Math.isPerfect(perfectnumber)){
            		count++;
            		 perfectmessage += (perfectnumber + " ");
            		 if(count % 10 == 0) {//ten in a row
            			 perfectmessage += "\n";
            		}
                }
            }
            	JOptionPane.showMessageDialog(null, perfectmessage);
            	break;
            	
            case "prime":
            	String primemessage = "The prime numbers in 1-1000 are:\n";
                for(primenumber = 2; primenumber <= 1000; primenumber++){
                	//under 1000
                	if(Math.isPrime(primenumber)){
                    count++;
                    primemessage += (primenumber + " ");
                    if(count % 10 == 0) {//ten in a row
                    	primemessage += "\n";
                    	}
                    }
                }
              	 JOptionPane.showMessageDialog(null, primemessage);//display the message
            	break;
            	
            default:
            	JOptionPane.showMessageDialog(null, "Yo! Quit!");
            	break;
            
            }
		}
	}	
	
	
	
	
	
	
	class MyMath{//MyMath class including two method determine prime numbers and perfect numbers
		public static boolean isPrime(int prime) {//boolean method to determine prime numbers
			int number = 2;
			for(number = 2;number <= Math.sqrt(prime);number++){
				if(prime % number == 0){	
				return false;}
					}
		return true;
		}

		
		
		
		
		
		
		 static boolean isPerfect(int perfect){//boolean method to determine perfect numbers
		        int sum = 0;
		        for(int number = 1; number < perfect; number++){
		        	 if(perfect % number == 0){sum += number;}
		        }
		        return perfect == sum;
		 		}
		    }
	
	
	/*I do not know how to copy the out put from dialog boxes, sorry about that */