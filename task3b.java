package logbooks;
import javax.swing.JOptionPane; //import javax swing joptionpane

public class task3b { //start class

	public static void main(String args[]) { //start main

		int pass = 0; //set pass int to 0
		int fail = 0; //set fail int to 0

		JOptionPane.showMessageDialog(null, "welcome to the total grade system"); //intro
		JOptionPane.showMessageDialog(null, "enter either the number 1 for pass or 2 for fail"); //intro
		
		for (int x = 1; x <= 20; x++) { //for loop 20 times
			
			int value =  Integer.parseInt(JOptionPane.showInputDialog("Entry number " + x + ": Enter Here!"));  //assign entry to a variable

				if (value == 1) { //if number 1 is entered 
					pass++; //increase pass int by 1
	
				} else if (value == 2) { //if number 2 is entered
					fail++; //increase fail int by 1
	
				} //end if statement

		} //end for loop
		
			if (pass == 16 || pass > 16) { //if pass is equal to or greater than 16
				JOptionPane.showMessageDialog(null,
						"total pass: " + pass + "   total fail: " + fail +//display total pass and total fail entries
						"\n Congratulations to the Tutors!"); //display success text
			} else { //if pass is below 16
				JOptionPane.showMessageDialog(null,
						"total pass: " + pass + "   total fail: " + fail +//display total pass and total fail entries
						"\n either the tutors or the students messed up here !"); //display fail text
			} //end if statement
		
	} //end main

} //end class
