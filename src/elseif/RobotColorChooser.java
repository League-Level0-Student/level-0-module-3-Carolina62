//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	    Robot bot = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String answer = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if() if/else statement to set the pen color that the user requested		
        if(answer.equals("blue")) {
        	bot.setPenColor(11, 36, 229);
        	bot.setPenWidth(10);
        }else 
        	answer.equals("purple");{
        		bot.setPenColor(145, 1, 158);
        		bot.setPenWidth(10);
        } 
        	
        //6. If the user doesn’t enter anything, choose a random color
				
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
        bot.penDown();
        bot.setSpeed(25);
        for (int i=0;i<4;i++) {
        bot.move(125);
        bot.turn(90);
        
        }
        
	}
}

