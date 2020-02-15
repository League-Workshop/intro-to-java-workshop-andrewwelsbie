package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");
		Random random = new Random();
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHp = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHp = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int damage1 = 20;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int damage2 = 20;

		// 6. Delete the slashes at the beginning of the next line.
		while (playerHp > 0 && dragonHp > 0) { // this line of code keeps the battle going until someone's health
												// reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String playerAttack = JOptionPane.showInputDialog("do you want to yell at the dragon or kick it?");
			// 9. If they typed in "yell":
			if (playerAttack.equalsIgnoreCase("yell")) {

				// -- Find a random number between 0 and 10 and store it in dragonDamage
				int dragonDamage = random.nextInt(11);

				// -- Subtract that number from the dragon's health variable
				dragonHp = dragonHp - dragonDamage;
			}

			// 10. If they typed in "kick":
			if (playerAttack.equalsIgnoreCase("kick")) {
				int dragonDamage = random.nextInt(26);
				dragonHp = dragonHp - dragonDamage;
			}
			// -- Find a random number between 0 and 25 and store it in dragonDamage

			// -- Subtract that number from the dragon's health variable

			// 11. Find a random number between 0 and 35 and store it in playerDamage
			int playerDamage = random.nextInt(36);
			// 12. Subtract this number from the player's health
			playerHp = playerHp - playerDamage;

			// 13. If the user's health is less than or equal to 0
			if (playerHp <= 0) {
				JOptionPane.showMessageDialog(null, "you lost");
			} else if (dragonHp <= 0) {
				JOptionPane.showMessageDialog(null, "you have slain the dragon an won tons of gold!");
			} else {
				JOptionPane.showMessageDialog(null, "your hp: " + playerHp + ", the dragons hp: " + dragonHp);
			}
			// -- Tell the user that they lost

			// 14. Else if the dragon's health is less than or equal to 0

			// -- Tell the user that the dragon is dead and they took a ton of gold!

			// 15. Else

			// -- Pop up a message that tells the their current health and the dragon's
			// currently health (Bonus: Also display the amount of health that was lost for
			// each player this round)
		}
	}
}
