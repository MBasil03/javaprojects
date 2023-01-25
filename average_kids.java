package basics_of_java;

import java.util.Scanner;

public class average_kids {

	/**
	 * compute the average kids per family. Integers should be type cast to doubles
	 */
	public static void main(String[] args) {
		// (single-line comment)
		Scanner scnr = new Scanner(System.in);
	
		int numKidsA;
		int numKidsB;
		int numKidsC;
		int numFamilies;
		double avgKids;
		double typeconversion;
		double common_error;
		//String myString;
		//char myChar;
		//double common_error = 6.01e10; scientific notation
		
		System.out.print("family A has ");
		numKidsA = scnr.nextInt();
		
		//String word = scnr.next()
		//String Line = scnr.nextLine()
		//char Character = scnr.next().charAt(0)
		//Take the index
		//we will talk more about string object operation when we start the loop chapter 
		
		System.out.print("family B has ");
		numKidsB = scnr.nextInt();
		System.out.println("family C has ");
		numKidsC = scnr.nextInt();
		System.out.println("number of families entered? ");
		numFamilies = scnr.nextInt();
		
		//Use example 1 3 4
		avgKids = (double)(numKidsA + numKidsB + numKidsC) / (double)(numFamilies);
		//type casting converts the 
		
		typeconversion = (numKidsA + numKidsB + numKidsC) / (double)(numFamilies);
		//compiler automatically performs int-to-double conversion
		
		common_error = (double)((numKidsA + numKidsB + numKidsC) / (numFamilies));
		//common error cast the entire result of integer division, rather than the operators
		
		System.out.println("Average kids per family:" + avgKids);
		System.out.println("this is the typeconversion:" + typeconversion);
		System.out.println("this is the common error:" + common_error);
		System.out.printf("Average kids per family %.1f\n", avgKids); 
		// %f prints out the floating value %(.precision)f prints out the number of digit after the decimal point
		// %d prints out the int
		// %s prints out the String 
			
		System.out.println("closing scanner scnr");
		scnr.close();
		System.out.println("Scanner closed.");

	}

}