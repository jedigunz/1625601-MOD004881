package logbooks;

import java.util.Scanner; //import java util scanner

public class Task1b { // start class

	public static void main(String args[]) { // start main

		System.out.println("enter the first number:"); // display text
		Scanner entry1 = new Scanner(System.in); // Create a Scanner object
		int Num1 = entry1.nextInt(); // Create Input Variable

		System.out.println("enter the second number:"); // display text
		Scanner entry2 = new Scanner(System.in); // Create a Scanner object
		int Num2 = entry2.nextInt(); // Create Input Variable

		System.out.println("enter the third number:"); // display text
		Scanner entry3 = new Scanner(System.in); // Create a Scanner object
		int Num3 = entry3.nextInt(); // Create Input Variable

		// if statements to organise into Ascending Order
		if (Num1 > Num3) { // if Num1 larger than Num3

			int temp = Num1; // Hold Temporary Value
			Num1 = Num3; // Swap 1 & 3
			Num3 = temp; // Swap 3 & Temp
		}
		if (Num1 > Num2) { // if Num1 larger than Num2

			int temp2 = Num1; // Hold Temporary Value
			Num1 = Num2; // Swap 1 & 2
			Num2 = temp2; // Swap 2 & Temp
		}
		if (Num2 > Num3) { // if Num2 larger than Num3

			int temp3 = Num2; // Hold Temporary Value
			Num2 = Num3; // Swap 2 & 3
			Num3 = temp3; // Swap 3 & Temp
		}
		System.out.println("first:" + Num1 + " second:" + Num2 + " third:" + Num3); // Output Ascending Order

		int total = Num1 + Num2 + Num3; // Add all inputs together
		int average = total / 3; // Divide total sum by total number of inputs

		System.out.println("Average:" + average); // Output the calculated average of Inputs
	} // end main
}// end class
