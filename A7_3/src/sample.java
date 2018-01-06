

	import javax.swing.*;

	public class sample{
	    public static void main(String args[]){
	        int choice;
	        while(true){
	            JFrame frame = new JFrame("InputDialog");
	            String choice1 = JOptionPane.showInputDialog(frame, "Enter:\n1 for Prime numbers in the range 1-1000\n2 for Perfect numbers in the range 1-10000\n3 to Quit");
	            choice = Integer.parseInt(choice1);
	            String output = "";
	            if(choice == 1){
	                output += "The prime numbers from 1-1000 are:\n";
	                int count = 0;
	                for(int i = 1; i <= 1000; i++){
	                    if(isPrime(i)){
	                        count++;
	                        output = output + i + " ";
	                        if(count % 10 == 0) output += "\n";
	                    }
	                }
	            }
	            else if(choice == 2){
	                output += "The perfect numbers from 1-1000 are:\n";
	                for(int i = 1; i <= 10000; i++){
	                    if(isPerfect(i)){
	                        output = output + i + " ";
	                    }
	                }
	            }
	            else if(choice == 3){
	                output += "Thanks for using the program!!";
	                JOptionPane.showMessageDialog(frame, output);
	                break;
	            }
	            JOptionPane.showMessageDialog(frame, output);
	        }
	    }
	
	    static boolean isPerfect(long x){
	        int sum = 0;
	        for(int i = 1; i < x; i++){
	            if(x % i == 0) sum += i;
	        }
	        if(x == sum) return true;
	        else return false;
	    }
	    static boolean isPrime(long x){
	        int count = 0;
	        for(int i = 1; i <= Math.sqrt(x); i++){
	            if(x % i == 0) count++;
	        }
	        if(count == 1) return true;
	        else return false;
	    }
	 }
