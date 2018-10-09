import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
	public static void main(String[] args) {
		int random = new Random().nextInt(3);
		System.out.println(random);
		String answer = JOptionPane.showInputDialog("Guess a number between 0 and 2");
		int guess = Integer.parseInt(answer);
		
		if (guess == random) {
			JOptionPane.showMessageDialog(null, "Correct");
					
	} else { String num = JOptionPane.showInputDialog("Wrong guess again");
	
	}

	}
}
