package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int r = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(r);
	// 4. Get the user to enter something that they think is awesome
		String opinion = JOptionPane.showInputDialog("What do you think is awesome");
	// 5. If the random number is 0
		if(r == 0) {
			JOptionPane.showMessageDialog(null, opinion+ " is awesome!");
		}
		
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
		if(r == 1) {
			JOptionPane.showMessageDialog(null, opinion+ " is ok");
		}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
		if(r == 2) {
			JOptionPane.showMessageDialog(null, opinion + " is boring!");
		}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
		if(r == 2) {
			JOptionPane.showMessageDialog(null, opinion + " is boring.");
		}

	// -- write your own answer

}
}



