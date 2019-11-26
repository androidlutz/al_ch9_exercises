//HEADER
//Program Name: Chapter 9 Exercise 4
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/25/2019
//Description: String Methods

package chapterNineExercises;

public class ExerciseFour {

	public static void main(String[] args) {

		System.out.println(isPalindrome("racecar"));
		
		
	}

/**
 * Returns the first character of the given String.
 */
	public static char first(String s) {
    return s.charAt(0);
	
}
	
	/**
	 * Returns all but the first letter of the given String.
	 */
	public static String rest(String s) {
	    return s.substring(1);
	
	}
	
/**
 * 
 * Returns all but the first and last letter of the String.
 */
	public static String middle(String s) {
    return s.substring(1, s.length() - 1);
	
}
/**
 * Returns the length of the given String.
 */
	public static int length(String s) {
    return s.length();
	
}

	public static void printString(String s) {
	    System.out.println(s.charAt(0));
	    System.out.println(s.charAt(1));
	    System.out.println(s.charAt(2));
	    System.out.println(s.charAt(3));
	    System.out.println(s.charAt(4));
	    System.out.println(s.charAt(5));
	
	}
	public static void printBackward(String s) {
	    System.out.println(s.charAt(5));
	    System.out.println(s.charAt(4));
	    System.out.println(s.charAt(3));
	    System.out.println(s.charAt(2));
	    System.out.println(s.charAt(1));
	    System.out.println(s.charAt(0));
	    
	}
	
	public static String reverseString(String str) {
		
		 if (length(str) != 0){
	         return reverseString(rest(str)) + first(str);
	      }
	      return "";
	}
	public static boolean isPalindrome(String str){
	      int length = length(str);
	      if (length == 1){
	         return true;
	      } 
	      else if (length == 2){
	         return first(str) == first(rest(str));
	      } 
	      else {
	         return first(str) == first(reverseString(rest(str))) && isPalindrome(middle(str));
	      }
}
}

/*
 * 1.A
 * 	 ndrew
 * 	 ndre
 * 	 6
 * 	 
 * 2.A
	 n
	 d
	 r
	 e
	 w

	3.w
	  e
	  r
	  d
	  n
	  A
	  
	4.reverseString
		werdnA
		
	5. For the String 'Andrew' 
		false
	   For the string 'racecar'
	    true 
	  
	  

 * 
 * 
 * 
*/
