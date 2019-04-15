package logbooks;

import java.util.Scanner; //import java util scanner

public class task3a { //start class

	public static void main(String args[]) { //start main

		int pass = 0; //set pass int to 0
		int fail = 0; //set fail int to 0

		System.out.println("welcome to the total grade system"); //intro text
		System.out.println("enter either the number 1 for pass or 2 for fail"); //intro text

		for (int x = 1; x <= 20; x++) { //for loop 20 times

			System.out.println("Entry number " + x + ": Enter here!"); //enter number and displays which entry your entering
			Scanner entry1 = new Scanner(System.in); //scanner
			int value = entry1.nextInt(); //assign entry to a variable

				if (value == 1) { //if number 1 is entered 
					pass++; //increase pass int by 1
	
				} else if (value == 2) { //if number 2 is entered
					fail++; //increase fail int by 1
	
				} //end if statement

		} //end for loop

		System.out.println("total pass: " + pass + "   total fail: " + fail); //display total pass and total fail entries
		
			if (pass == 16 || pass > 16) { //if pass is equal to or greater than 16
				System.out.println("Congratulations to the Tutors!"); //display success text
			} else { //if pass is below 16
				System.out.println("either the tutors or the students messed up here !"); //display fail text
			} //end if statement
		
	} //end main

} //end class
