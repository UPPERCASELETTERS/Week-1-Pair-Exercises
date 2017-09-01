package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65 billAmount
 Please enter the amount tendered: 100.00 payAmount
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the amount of the bill: ");
		
		double billAmount = input.nextDouble();
		input.nextLine();
		
		System.out.print("PLease enter the amount paid: ");
		
		double payAmount = input.nextDouble();
		input.nextLine();
		
		System.out.println( "Your change is " + makeChange(billAmount, payAmount));
	}

	public static double makeChange (double billAmount, double payAmount) {
	 
		double change;				
		change = payAmount - billAmount; 
			return change;
				
	}
	
	
}
