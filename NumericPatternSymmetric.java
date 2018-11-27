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
	
	public static String mnemoicsList(int num) {
		String output= "";
		return output;
	}
	public static String symmetricPattern(int num) {
		// method that produces a symmetric pattern about n where each half before and after n is also symmetric around n-1
		String output = "";
		String nextOuput;
		
		if(num > 15 || num < 1) {
			// error
			output = "Error";
			return output;
		}
		else if(num == 1) {
			// base case (n = 1)
			output = " 1 ";
			return output;
		}
		else {
			// for numbers greater than one
			nextOuput = symmetricPattern(num - 1);
			if(num <= 5) {
				output = nextOuput + num + nextOuput;
			}
			else {
				output = nextOuput + num + "\n" + nextOuput;
			}
			return output;
		}
	}
}