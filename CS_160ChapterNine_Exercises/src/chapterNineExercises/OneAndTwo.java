//HEADER
//Program Name: Chapter 9 Exercise 1 and 2
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/25/2019
//Description: Histogram exercise

package chapterNineExercises;

import java.util.Arrays;

public abstract class OneAndTwo {
	
	
	public static void main(String[] args) {
		System.out.println((Arrays.toString(letterHist("banana"))));
	     
}
			public static int[] letterHist (String s) {
				int[] hist = new int[25];
					for (char letter: s.toCharArray()) {
						if (letter >= 'a' && letter <= 'z') {
							hist[letter- 'a']++;
						}
						else if(letter >= 'A' && letter <= 'Z') {
							hist[letter- 'A']++;
      }
       
   }
						return hist;
}
}
	

/*
 * Exercise 1
 * part 1
 *  System.out.println(1 + "red"); output = 1red
 *  System.out.println("blue " + " Red");  output = blue  Red
 *  Performs string concatenation when using integers and strings
 *  
 * part2
 * o = yes
 * x = no
 *  		boolean	char int double	String
 *  boolean	    x	 x	  x		x	   o
 *  char        x    o    x     o      o
 *  int			x    x    o     o      o
 *  double		x    x	  o     o      o
 *  String      o    o    o     o      o
 *  Many of these data types are turned into strings
 *  when concatenated.  Boolean values are not when 
 *  adding themselves together or adding them to integers or doubles.
 *  
 *  part 3
 *  I don't believe that we can know exactly what the designers had in mind however
 *  it may be a bit problematic to be concatenating a string and an integer or double.
 *  it makes sense for boolean values to not work when the add operator is used.  Also is 
 *  logical when adding doubles and integers because it is just simple math at that point.
 *  
 *  part 4
 *  There is a mismatch error. Java is trying to add a character to an integer.
 *  
 *  part 5
 *  when "" is used it puts a blank space in front of whatever it is concatenating.
 *  
 *  part 6
 *  boolean= boolean only
 *  char = char and int
 *  int = char and int
 *  double = int, char and double
 *  String = String
 *  
 *  Exercise 2
 *  banana output:
 *  [3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

 *  
 
 *  

 */
