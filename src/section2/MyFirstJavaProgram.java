package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		Robot Arnold = new Robot();
		Arnold.hide();
		// object
		Arnold.penDown();
		Arnold.setSpeed(100);
		
			
		for (int i = 0; i < 4; i++) {
			Arnold.move(200);
			Arnold.turn(90);

		}
		
	}
}
