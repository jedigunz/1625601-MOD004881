package logbooks;

import java.util.Scanner; //import java util scanner

public class Task1a { // start class

	public static void main(String args[]) { // start main

		System.out.println("enter the first number:"); // display text
		Scanner entry1 = new Scanner(System.in); // Create a Scanner object

		int Num1 = entry1.nextInt(); // Create Input Variable

		System.out.println("enter the second number:"); // display text
		Scanner entry2 = new Scanner(System.in); // Create a Scanner object

		int Num2 = entry2.nextInt(); // Create Input Variable

		int total = Num1 + Num2; // Sum Total 2 Variables
		System.out.println("The total number is " + total); // Outputs Total Variable

	} // end main

} // end class
