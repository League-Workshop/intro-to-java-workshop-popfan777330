package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)
	
	public static void main(String[] args) {
		Random r = new Random();

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		int dragonHealth = 100;
		// it equal to 100)

		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 9;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 20;
		// 6. Delete the slashes at the beginning of the next line.
		 while(playerHealth>0 && dragonHealth>0) { //this line of code keeps the
		// battle going until someone's health reaches 0

		// 7. Add a closing mustache at the very bottom of this program (since we just
		// added an opening mustache on the previous step).

		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
		// or a kick
		String yourAnswer = JOptionPane.showInputDialog(null, "Do you attack the dragon with a hit or a yell?");

		// 9. If they typed in "yell":
		if(yourAnswer.equalsIgnoreCase("yell"));
		// -- Find a random number between 0 and 10 and store it in dragonDamage
		playerDamage = r.nextInt(10);
		// -- Subtract that number from the dragon's health variable
		dragonHealth -= playerDamage;
		
		// 10. If they typed in "kick":
		if(yourAnswer.equalsIgnoreCase("kick"));
		// -- Find a random number between 0 and 25 and store it in dragonDamage
		playerDamage = r.nextInt(25);
		// -- Subtract that number from the dragon's health variable
		dragonHealth -= playerDamage;
		// 11. Find a random number between 0 and 35 and store it in playerDamage
		playerDamage = r.nextInt(35);
		// 12. Subtract this number from the player's health
		playerHealth -= playerDamage;
		// 13. If the user's health is less than or equal to 0
		if(playerHealth <= 0) {
		// -- Tell the user that they lost
			JOptionPane.showMessageDialog(null,"F");
		} 	
			
		// 14. Else if the dragon's health is less than or equal to 0
		if(dragonHealth <= 0) {
		// -- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null,"you default dance on the dragons' body");
		} else {
		// 15. Else
			JOptionPane.showMessageDialog(null,"Dragon: "+dragonHealth+ "You: " +playerHealth);
		}
		// -- Pop up a message that tells the their current health and the dragon's
		// currently health (Bonus: Also display the amount of health that was lost for
		// each player this round)

	}
}
}
