//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:05/16/2016
//instructor:Dave Harden
//file name:WordCruncherTest.java
/*It mainly read the word entered by the user, and
 * output the number of letters, vowels and the occurrence
 * of a specific letter as well asthe pig latin, gibberish
 * and the reverse version of the sentence. */






import java.util.Scanner;
public class WordCruncherTest {
	public static void main( String[] args ){
		Scanner input = new Scanner( System.in );
	
		WordCruncher cruncher = new WordCruncher();
		System.out.println("Enter a word or quit to quit");
		String sentence = input.nextLine();
	//ask for the sentence
		while(!sentence.equals("quit")){
			System.out.println("The number of letters: " + cruncher.numLetters(sentence));
			System.out.println("The number of vowels: " + cruncher.numVowels(sentence));
			System.out.println("The reverse version is: " + cruncher.reverse(sentence));
			System.out.println("The Gibberish language translation is: " + cruncher.toPigLatin(sentence));
			System.out.println("The Pig Latin translation is: " + cruncher.toGibberish(sentence));
			System.out.println("Enter a letter you want to count occurence: ");
			char occurence = input.next().charAt(0);
			System.out.println("The occurence of " + occurence + " is: " 
						+ cruncher.numCharOccurrences(occurence, sentence));
	
	
			System.out.println("Enter a sentence or quit to quit");
			sentence = input.nextLine();//read the new sentence
			sentence = input.nextLine();//next line
		}
	}
}







/*Enter a sentence or quit to quit
bee
The number of letters: 3
The number of vowels: 2
The reverse version is: eeb
The Gibberish language translation is: eebay
The Pig Latin translation is: bithagee
Enter a letter you want to count occurence: 
e
The occurence of e is: 2
Enter a sentence or quit to quit
amazon
The number of letters: 6
The number of vowels: 3
The reverse version is: nozama
The Gibberish language translation is: amazonway
The Pig Latin translation is: ithagamazon
Enter a letter you want to count occurence: 
a
The occurence of a is: 2
Enter a sentence or quit to quit
costco
The number of letters: 6
The number of vowels: 2
The reverse version is: octsoc
The Gibberish language translation is: oostccay
The Pig Latin translation is: cithagostco
Enter a letter you want to count occurence: 
o
The occurence of o is: 2
Enter a sentence or quit to quit
quit
*/