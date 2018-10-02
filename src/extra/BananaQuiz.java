//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		//2. if they say no, 
		String answer=JOptionPane.showInputDialog("Do you like Bananas?");
		if(answer.equals("no")) { JOptionPane.showMessageDialog(null, "You're Crazy");}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		if(answer.equals("yes")) {String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");}

		
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}

