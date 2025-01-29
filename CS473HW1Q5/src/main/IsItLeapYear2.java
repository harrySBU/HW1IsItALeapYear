package main;

import java.util.Scanner;
/*
 * Leap years are divisible by 4 except if they are divisible by 100
 * if they are divisible by 100 then they must be divisible by 400
 */
public class IsItLeapYear2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a year(as an integer) starting with 0 to determine if it is a leap year:");
			System.out.println("or enter q to quit");
			String entry = scan.nextLine();
			
			if(entry.equals("q")) {
				System.out.println("Program Stopped");
				break;
			}
			
			if(entry.length()!=0) {
				
				// if it is a number / integer
				if(isNumericAndInteger(entry)) {
					
					// convert to long
					long x = Long.parseLong(entry);
					// if divisible by 4 and not div by 100 then leap year
					if((x%4==0) && !(x%100==0)) {
						System.out.println(entry+" IS a leap year!");
					}
					// else if divisible by 400, still leap year
					else if(x%400==0) {
						System.out.println(entry+" IS a leap year!");
					}
					// else not a leap year
					else {
						System.out.println(entry +" is NOT a leap year!");
					}
				}
				// if the input is not correct
				else {
					System.out.println("Incorrect input. Please enter a valid integer as the year!!");
				}
			}
			// if the input is empty
			else {
				System.out.println("No input. Please enter a valid integer as the year");
			}
			
		}
		scan.close();
	}
	/*
	 * method to check if an entry is numeric and an integer(doesn't contain any other characters)
	 * takes a string as input
	 * returns true if method parseInt succeeds
	 * catches number format exception and returns false if parseInt fails.
	 */
	public static boolean isNumericAndInteger(String entry) { 
		  try {  
			// if this succeeds return true
		    Integer.parseInt(entry);  
		    return true;
		  }
		  // if it fails catch the exception and return false.
		  catch(NumberFormatException e){  
		    return false;  
		  }  
		}
}
