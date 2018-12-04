
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 21st";
		String dadsBirthday = "August 18th";
		String myBirthday = "April 1t1h";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog(null, "What birthday do you want?");

		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if (answer.equals("mom")) {
			System.out.println(momsBirthday);
		}
		
		else if (answer.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		
		else if (answer.equals("myBirthday")) {
			System.out.println(myBirthday);
		} else { JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		
		}
		
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
	}
}

