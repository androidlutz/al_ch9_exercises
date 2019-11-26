//HEADER
//Program Name: Chapter 9 Exercise 3
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/25/2019
//Description:  counting parentheses 

package chapterNineExercises;

public class ExerciseThree {

	public static void main(String[] args) {
		
		System.out.println(parentheses("((3 + 7) * 2)", '(', ')' ));
	}
	public static int parentheses(String str, char openp, char closep){
	      int count = 0;
	      for (int i = 0; i<str.length(); i++){
	         char c = str.charAt(i);
	         if (c == openp){
	            count++;
	         } 
	         else if (c == closep){
	            count--;
	         }
	      }
	      return count;
	   }
}
	  // public static int moreParentheses(String str){
	     // return parentheses(str, '(',')');
	  // }
	//}
/*
 * Footer
 * 
 * 
 * 
 * 
 * */



