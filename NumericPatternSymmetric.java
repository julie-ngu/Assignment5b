/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Nov 2018
 * Created for: ICS4U
 * Numeric Pattern Symmetric recursive program in java
 * 
 ****************************************************************************/

import java.util.Scanner;

public class NumericPatternSymmetric {
	public static void main(String[] args) { 		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer below 15: ");
		if(input.hasNextInt()) {
			int userNum = input.nextInt();
			String numPattern = symmetricPattern(userNum);		
			System.out.print(numPattern);
		}
		else {
			System.out.println("Error");
		}
	}
	
	public static String symmetricPattern(int num) {
		// method that produces a symmetric pattern about n where each half before and after n is also symmetric around n-1
		
		// make a variable to hold the text for where the whole pattern is contained (output)
		String output = "";
		// make a variable to hold the text for where the repetitions (1 2 1) is contained (nextOutput)
		String nextOuput;
		
		if(num >= 15 || num < 1) {
			// returns error if number is greater than/equal to 15 or number is less than 1
			output = "Error";
			return output;
		}
		else if(num == 1) {
			// base case (n = 1), prints out " 1 " if number is 1
			output = " 1 ";
			return output;
		}
		else {
			// for numbers greater than one but less or equal to 15
			nextOuput = symmetricPattern(num - 1);
			// assign recursion to variable nextOutput so you don't need to type in that same line of code over and over
			if(num <= 5) {
				//if number is less than or equal to 5, let the output be assigned nextOuput (recursion) + number + nextOutput(recursion)
				output = nextOuput + num + nextOuput;
			}
			else {
				//if the number is greater than 5, do the same thing from if statement, except add a new line before the next recursion
				output = nextOuput + num + "\n" + nextOuput;
			}
			//return output after if-else
			return output;
		}
	}
}
