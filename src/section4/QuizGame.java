package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
	
		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("spell 'sphinx'");
		// 3.  Use an if statement to check if their answer is correct
		if(question.equalsIgnoreCase("sphinx")) {
			score += 1;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String question2 = JOptionPane.showInputDialog("spell 'cat'");
		if(question2.equalsIgnoreCase("cat")) {
			score ++;
		}
		String question3 = JOptionPane.showInputDialog("spell 'dog'");
		if(question3.equalsIgnoreCase("dog")) {
			score++;
		}
		String question4 = JOptionPane.showInputDialog("spell 'fish'");
		if(question4.equalsIgnoreCase("fish")) {
			score++;
		}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"your score is " + score);
	}
}
