
import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
				if(answer.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "Then you will rule the world!");
				} else {
					JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
				}

	}
}

