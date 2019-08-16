package com.virtusa.codetest;

import java.util.Scanner;

//Java program to print a given number in words. The 
//program handles numbers from 0 to 99999999 

/**
 * As Per OOPS concepts I am creating a generic class this would be useful for the where ever we want to execute it
 * it will work and also i created a static method and also object creation is not required
 * @author Nagaraju Meruva
 *
 */
public class NumberToWordProgram {

	public static void main(String[] args) {

		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		
		//handle the basic exception handling,if user will provide the more than 9 digits
		//it will handle exception has please enter a valid number
		try {
	       //read a number from through keyboard
		   number = scanner.nextInt();
		   if (number == 0) {
			System.out.print("Number in words: Zero");
		   } else {
			System.out.print("Number in words: " + NumberUtils.numberToWord(number));
		   }
		 } catch (Exception e) {
			System.out.println("Please enter a valid number");
		 }
		// close the reader
		scanner.close();
		

	}

}
