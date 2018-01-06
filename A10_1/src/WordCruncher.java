//Name: Siyue Wang
//G number:01036439
//class:CIS 254
//date:05/16/2016
//instructor:Dave Harden
//file name:WordCruncher.java
/*It mainly read the word entered by the user, and
 * output the number of letters, vowels and the occurrence
 * of a specific letter as well asthe pig latin, gibberish
 * and the reverse version of the word. */



public class WordCruncher {
	String word;//instance variable

	
	
	
	//constructor to set the instance variable to default
	public WordCruncher(){
	this.word = "default";
}
	
	
	
	
	 //this is a method to find the number of the letters
	 //the word user input is the variable L
	//numL is the number of the letters
	public int numLetters(String L)
	   {
		int numL = 0;
	        for(int count = 0; count< L.length(); count++){
	        if(Character.isLetter(L.charAt(count))){
	        numL++;}
	        }
	        return numL;
	   }
	 
	
	
	
	
	
	 //this is a method to find the number of the vowels
	//It uses boolean method, isVowel to know if there is a vowel
	 //the word user input is the variable letter
	//vw is the number of the vowels(aeiou)
	 public int numVowels(String letter){
		 int vw = 0;
		 for(int count = 0; count < letter.length(); count++){
	          if(isVowel(letter.charAt(count))){
	        	  	vw++;
	          }
	     }
	    return vw;
	 }
	 
	 
	 
	 
	 
	 
	 /*If the word begins with a consonant, take the first letter of 
	  * the word and move it to the end of the word, followed by 'ay'
	 *If the word begins with a vowel, add 'way' to the word.
	 *pig is the word that the user should enter
	 *first is the first letter of the word.
	 *last is the last letter of the word
	 *Letters is the array of the words from word
	 */
	 public String toPigLatin (String pig){
		
			if(beginsWithVowel(pig)){
				pig+="way";
		}else {
		    char first = pig.charAt(0);
		    char last = pig.charAt(pig.length() - 1);
		    
		    pig = last+ pig.substring
		    		(1,pig.length() - 1) + first + "ay";
		}
		return pig;
	 }
	 
	 
	 
	 
	 
	 
	 
	 /*If the word begins with a consonant, follow the first letter with 'itha',
	  *  and place a 'g' before the rest of the original word.
	  *  If the word begins with a vowel, place 
	  *  'itha' at the front, and put a 'g' in front of the original word.
	 *Gib is the word that the user should enter
	 *first is the first letter of the word.
	 *Letters is the array of the words from word
	 */
	 public String toGibberish(String Gib){

			if(beginsWithVowel(Gib)){
				Gib="ithag"+Gib;
			}else {
			    char first = Gib.charAt(0);
			    
			    Gib = first+"ithag"+ Gib.substring
			    		(1,Gib.length());

			}
		return Gib;
	 }
	 
	 
	 
	 
	 //it uses a swap method to change the position of letters
	 //letters is the array from rev, the word.
	 //halfflength is the times need to loop
	 //i is the count number
	 //temp is the variable that swap the value
	 public String reverse(String rev)
	 {
	     char[] letters = rev.toCharArray();
	     int halfLength = letters.length / 2;
	     int length = letters.length-1;
	     for (int i=0; i<halfLength; i++)
	     {
	         char temp = letters[i];
	         letters[i] = letters[length-i];
	         letters[length-i] = temp;
	     }
	     return new String(letters);
	 }
	 
	 
	 
	 
	 /*ch is the charthe user enter to count the occurrence
	  * letter is the word that the user enter
	  * occ is the number of the occurrence
	  * It is used to count thenumber of the occurrences
	  */
	 
	 public int numCharOccurrences(char ch, String letter){
		 int occ = 0;
			 for(int count = 0; count <= letter.length()-1; count++){
			 if( ch == letter.charAt(count)){
				 occ++;
			 }
		 }
			 return occ;
	 }
	 
	 
	 /*str is the word user enter
	  * It uses isVowel bolean method to tell if
	  * the first letter of the word is vowel*/
	 public boolean beginsWithVowel (String str) {
		if(isVowel(str.charAt(0))){
			return true;
		}
		 return false;
	 }
	 
	 
	 
	 
	 //isVowel is a boolean method to tell if the word is aeiou
	 //v is the word need to be tested
	 public boolean isVowel( char v){
		if(v == 'a' || v == 'e' || v == 'i' ||v == 'o' || v == 'u') 
		{return true;}
		else{
		return false;}
	 }
	 
	 
	 
	 
	 
	 
		
}
