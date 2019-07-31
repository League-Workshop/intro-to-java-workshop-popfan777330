package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
		Robot Arnold = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		Arnold.setSpeed(300);

		// 5. Set the pen width to 5
		Arnold.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i=0; i<4; i++) {
		Arnold.setRandomPenColor();
		Arnold.turn(+90);
		
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
		}
	}

	
	void drawSquare() {
		for (int i=0; i < 4; i++) {
			Arnold.penDown();
			Arnold.move(200);
			Arnold.turn(90);
		}
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
		
	}

}



